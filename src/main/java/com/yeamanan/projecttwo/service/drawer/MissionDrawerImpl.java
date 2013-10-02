package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.model.mission.Tile;
import com.yeamanan.projecttwo.model.mission.Zone;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
//import org.apache.log4j.Logger;

/**
 * MissionDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class MissionDrawerImpl implements Drawer {

    /**
     * Logger.
     */
//    private static final Logger LOG = 
//            Logger.getLogger(MissionDrawerImpl.class);

    /**
     * draw() method.
     *
     * @param argMission the mission to draw
     * @return the node representing the mission
     */
    @Override
    public final Node draw(final Element argElement, final Pane argParent) {
        final Mission mission = (Mission) argElement;
        final Group group = new Group();
        final Drawer tDrawer = new TileDrawerImpl();
        for (Tile tile : mission.getTiles()) {
            argParent.getChildren().add(tDrawer.draw(tile, argParent));
        }
        final Drawer zDrawer = new ZoneDrawerImpl();
        for (Zone zone : mission.getZones()) {
            group.getChildren().add(zDrawer.draw(zone, argParent));
        }
//        group.setUserData(mission);
        return group;
    }

}
