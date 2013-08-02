package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.Mission;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.log4j.Logger;

/**
 * MissionServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class MissionServiceImpl implements MissionService {

    private static final String PROPERTY_SEPARATOR = "=";
    private static final String LIST_SEPARATOR = ";";

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ProjectTwo.class);

    /**
     * loadFile() method.
     *
     * @param filePath name of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadFile(final String filePath) {
        Mission mission = null;
        try (final FileReader fReader = new FileReader(filePath)) {
            mission = loadFile(fReader);
        } catch (IOException e) {
            LOGGER.error("Error reading mission file", e);
        }
        return mission;
    }

    /**
     * loadFile() method.
     *
     * @param inputStream input stream of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadFile(final InputStream inputStream) {
        return loadFile(new InputStreamReader(inputStream));
    }

    /**
     * loadFile() method.
     *
     * @param reader reader of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadFile(final Reader reader) {
        final Mission mission = new Mission();
        try (final BufferedReader bReader = new BufferedReader(reader)) {
            String currentLine;
            while ((currentLine = bReader.readLine()) != null) {
                treatLine(mission, currentLine);
            }
        } catch (IOException e) {
            LOGGER.error("Error reading mission file", e);
        }
        return mission;
    }

    /**
     * treatLine() method.
     * @param mission the mission to modify
     * @param line the line to treat
     */
    public final void treatLine(final Mission mission, final String line) {
        final String[] tmp = line.split(PROPERTY_SEPARATOR);
        switch (tmp[0]) {
            case "id":
                mission.setId(tmp[1]);
                break;
            case "name":
                mission.setName(tmp[1]);
                break;
            case "row":
                break;
            case "objective":
                break;
            default:
        }
    }

}
