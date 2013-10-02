package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.mission.Zone;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * ZoneDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZoneDrawerImpl implements Drawer {

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
    public final Node draw(final Element argElement, final Pane argParent) {
        final Zone zone = (Zone) argElement;
        final Pane pane = new Pane();
        pane.setLayoutX(zone.getX());
        pane.setLayoutY(zone.getY());
        pane.setPrefSize(zone.getWidth(), zone.getHeight());
        final Drawer drawer = new DrawerFactoryImpl();
        for (Element element : zone.getElements()) {
            pane.getChildren().add(drawer.draw(element, pane));
        }
        return pane;
    }

}
