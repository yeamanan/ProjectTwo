package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Zone;
import com.yeamanan.projecttwo.model.token.Door;
import com.yeamanan.projecttwo.model.token.Start;
import com.yeamanan.projecttwo.service.GenericDrawer;
import com.yeamanan.projecttwo.service.GenericDrawerImpl;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
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
        final Pane pane = new Pane();
        pane.setLayoutX(argZone.getX());
        pane.setLayoutY(argZone.getY());
        pane.setPrefSize(argZone.getWidth(), argZone.getHeight());
        for (Element element : argZone.getElements()) {
            if (element.getClass().equals(Start.class) ||
                    element.getClass().equals(Door.class)) {
                final GenericDrawer<Element> service =
                        new GenericDrawerImpl();
                pane.getChildren().add(service.draw(element, argZone.getWidth(), argZone.getHeight()));
            }
        }
        group.getChildren().add(pane);
        return group;
    }

}
