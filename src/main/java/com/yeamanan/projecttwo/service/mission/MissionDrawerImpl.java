package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.model.mission.Tile;
import com.yeamanan.projecttwo.model.mission.Zone;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.Node;
//import org.apache.log4j.Logger;

/**
 * MissionDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class MissionDrawerImpl implements MissionDrawer {

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
    public final Node draw(final Mission argMission) {
        final Group group = new Group();
        final List<Tile> tiles = argMission.getTiles();
        final TileDrawer tService = new TileDrawerImpl();
        for (Tile tile : tiles) {
            group.getChildren().add(tService.draw(tile));
        }
        final List<Zone> zones = argMission.getZones();
        final ZoneDrawer zService = new ZoneDrawerImpl();
        for (Zone zone : zones) {
            group.getChildren().add(zService.draw(zone));
        }
        group.setUserData(argMission);
        return group;
    }

}
