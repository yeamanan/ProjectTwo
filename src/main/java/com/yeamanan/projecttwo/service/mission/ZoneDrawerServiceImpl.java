package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Zone;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.TilePane;
import org.apache.log4j.Logger;

/**
 * ZoneDrawerServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZoneDrawerServiceImpl implements ZoneDrawerService {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(MissionDrawerServiceImpl.class);

    /**
     * draw() method.
     *
     * @param argZone the zone to draw
     * @return the node representing the zone
     */
    @Override
    public final Node draw(final Zone argZone) {
        final Group group = new Group();
        final TilePane pane = new TilePane();
        pane.setLayoutX(argZone.getX());
        pane.setLayoutY(argZone.getY());
        pane.setPrefSize(argZone.getWidth(), argZone.getHeight());
//        for (Element element : argZone.getElements()) {
//            
//        }
        group.getChildren().add(pane);
        return group;
    }

}
