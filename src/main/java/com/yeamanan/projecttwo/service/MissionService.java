package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.Mission;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * MissionService interface.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public interface MissionService {

    /**
     * loadFile() method.
     * @return a list of mission objects
     */
    List<Mission> loadMissionsAsRessources();

    /**
     * loadFile() method.
     * @param filePath path of a file to load
     * @return a mission object
     */
    Mission loadFile(final String filePath);

    /**
     * loadFile() method.
     * @param inputStream input stream of a file to load
     * @return a mission object
     */
    Mission loadFile(final InputStream inputStream);

    /**
     * loadFile() method.
     * @param reader reader of a file to load
     * @return a mission object
     */
    Mission loadFile(final Reader reader);

}
