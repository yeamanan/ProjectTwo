package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.service.GenericLoader;
import com.yeamanan.projecttwo.service.GenericLoaderImpl;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * MissionLoaderImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class MissionLoaderImpl implements MissionLoader {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(MissionLoaderImpl.class);

    /**
     * Missions folder in jar.
     */
    private static final String FOLDER = "missions/";

    /**
     * Mission file's extension.
     */
    private static final String EXTENSION = ".mxml";

    /**
     * Generic service.
     */
    private final transient GenericLoader<Mission> service;

    /**
     * Constructor.
     */
    public MissionLoaderImpl() {
        this.service =
                new GenericLoaderImpl(FOLDER, EXTENSION, Mission.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of mission file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a mission to load
     * @return a mission object
     */
    @Override
    public final Mission load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of mission objects
     */
    @Override
    public final List<Mission> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argMission a mission object to save
     */
//    @Override
//    public final void save(final Mission argMission) {
//        final String sName = argMission.getId() + " - " + argMission.getName();
//        this.service.save(argMission, sName);
//    }

}
