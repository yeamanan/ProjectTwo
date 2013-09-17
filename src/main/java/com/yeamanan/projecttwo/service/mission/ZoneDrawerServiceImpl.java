package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.model.mission.Tile;
import com.yeamanan.projecttwo.model.mission.Zone;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
//import org.apache.log4j.Logger;

/**
 * ZoneDrawerServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZoneDrawerServiceImpl implements ZoneDrawerService {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(MissionDrawerServiceImpl.class);

    /**
     * draw() method.
     *
     * @param argZone the zone to draw
     * @return the node representing the zone
     */
    @Override
    public final Node draw(final Zone argZone) {
        final Group group = new Group();
        final double x = argZone.getX();
        final double y = argZone.getY();
        final double width = argZone.getWidth();
        final double height = argZone.getHeight();
        final Line top = new Line(x, y, (x+width)-1, y);
        final Line right = new Line((x+width)-1, y, (x+width)-1, (y+height)-1);
        final Line bottom =
                new Line((x+width)-1, (y+height)-1, x, (y+height)-1);
        final Line left = new Line(x, (y+height)-1, x, y);
        final Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(Color.TRANSPARENT);
        group.getChildren().add(top);
        group.getChildren().add(right);
        group.getChildren().add(bottom);
        group.getChildren().add(left);
        group.getChildren().add(rectangle);
        group.setUserData(argZone);
        return group;
    }

}
