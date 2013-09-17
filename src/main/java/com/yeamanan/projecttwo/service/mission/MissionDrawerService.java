package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Mission;
import javafx.scene.Node;

/**
 * MissionDrawerService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface MissionDrawerService {

    /**
     * draw() method.
     *
     * @param argMission the mission to draw
     * @return the node representing the mission
     */
    Node draw(Mission argMission);

}
