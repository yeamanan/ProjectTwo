package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Mission;
import java.util.List;

/**
 * MissionLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface MissionLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of mission file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a mission to load
     * @return a mission object
     */
    Mission load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of mission objects
     */
    List<Mission> loadAll();

    /**
     * save() method.
     *
     * @param argMission a mission object to save
     */
//    void save(final Mission argMission);

}
