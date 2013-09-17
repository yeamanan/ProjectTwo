package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Zone;
import javafx.scene.Node;

/**
 * ZoneDrawerService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface ZoneDrawerService {

    /**
     * draw() method.
     *
     * @param argZone the zone to draw
     * @return the node representing the zone
     */
    Node draw(Zone argZone);

}
