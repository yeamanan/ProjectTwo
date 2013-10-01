package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.mission.Zone;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * ZoneDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZoneDrawerImpl implements ZoneDrawer {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(MissionDrawerImpl.class);

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
        final Drawer drawer = new DrawerFactoryImpl();
        for (Element element : argZone.getElements()) {
            LOG.info(element.getClass().getSimpleName());
            if (element.getClass().equals(Survivor.class)) {
                continue;
            }
            pane.getChildren().add(drawer.draw(element, pane));
        }
        group.getChildren().add(pane);
        return group;
    }

}
