package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.Mission;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * MissionService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface MissionService {

    /**
     * getMissionsNames() method.
     *
     * @return a list of string representing the missions names
     */
    List<String> getMissionNames();

    /**
     * loadMissionAsResource() method.
     *
     * @param name name of a mission to load
     * @return a mission object
     */
    Mission loadMissionFromResource(final String name);

    /**
     * loadMission() method.
     *
     * @param filePath path of a file to load
     * @return a mission object
     */
    Mission loadMission(final String filePath);

    /**
     * loadMission() method.
     *
     * @param inputStream input stream of a file to load
     * @return a mission object
     */
    Mission loadMission(final InputStream inputStream);

    /**
     * loadMission() method.
     *
     * @param reader reader of a file to load
     * @return a mission object
     */
    Mission loadMission(final Reader reader);

}
