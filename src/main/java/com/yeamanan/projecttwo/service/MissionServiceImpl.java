package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.Mission;
import com.yeamanan.projecttwo.model.Tile;
import com.yeamanan.projecttwo.util.AxeUtil;
import com.yeamanan.projecttwo.util.JarUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * MissionServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class MissionServiceImpl implements MissionService {

    private static final String PROPERTY_SEPARATOR = "=";
    private static final String TILE_ROW_SEPARATOR = "-";
    private static final String TILE_ORIENTATION_SEPARATOR = ";";

    private static final String MISSION_FOLDER = "Missions/";

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ProjectTwo.class);

    /**
     * loadFile() method.
     * @return a list of mission objects
     */
    @Override
    public final List<Mission> loadMissionsAsRessources() {
        List<Mission> missions = new ArrayList<>();
        List<String> filePaths =
                JarUtil.getJarFolderFileList(this.getClass(), MISSION_FOLDER);
        for(String path : filePaths) {
            InputStream stream =
                    getClass().getClassLoader().getResourceAsStream(path);
            missions.add(loadFile(stream));
        }
        return missions;
    }

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
            LOGGER.error("Error reading mission file : " + filePath, e);
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
            String sLine;
            while ((sLine = bReader.readLine()) != null) {
                treatLine(mission, sLine);
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
                mission.getGrid().add(treatTileRow(tmp[1]));
                break;
            case "objective":
                break;
            default:
        }
    }

    /**
     * treatTileRow() method.
     * @param row the tiles' row to treat
     */
    public final List<Tile> treatTileRow(final String row) {
        final List<Tile> tiles = new ArrayList<>();
        final String[] sTiles = row.split(TILE_ROW_SEPARATOR);
        for (String sTile : sTiles) {
            final String[] tmp = sTile.split(TILE_ORIENTATION_SEPARATOR);
            tiles.add(new Tile(tmp[0], AxeUtil.treatAxe(tmp[1])));
        }
        return tiles;
    }

}
