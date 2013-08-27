package com.yeamanan.projecttwo.service;

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
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class MissionServiceImpl implements MissionService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(MissionServiceImpl.class);

    /**
     * Constants.
     */
    private static final String PROPERTY_SEPARATOR = "=",
            TILE_ROW_SEPARATOR = "-", TILE_ORIENTATION_SEPARATOR = ";";

    /**
     * Missions folder in jar.
     */
    private static final String MISSIONS_FOLDER = "missions/";

    /**
     * Mission file's extension.
     */
    private static final String MISSION_EXTENSION = ".mis";

    /**
     * getMissionsNames() method.
     *
     * @return a list of mission names
     */
    @Override
    public final List<String> getMissionNames() {
        final List<String> names = new ArrayList<>();
        final Class aClass = this.getClass();
        final List<String> filePaths =
                JarUtil.getJarFolderFileList(aClass, MISSIONS_FOLDER);
        for (String path : filePaths) {
            path = path.replaceAll(MISSIONS_FOLDER, "");
            path = path.replaceAll(MISSION_EXTENSION, "");
            names.add(path);
        }
        return names;
    }

    /**
     * loadMissionAsResource() method.
     *
     * @param name name of a mission to load
     * @return a mission object
     */
    @Override
    public final Mission loadMissionFromResource(final String name) {
        final String path = MISSIONS_FOLDER + name + MISSION_EXTENSION;
        final Class aClass = this.getClass();
        final InputStream stream =
                    aClass.getClassLoader().getResourceAsStream(path);
        return loadMission(stream);
    }
            
    /**
     * loadMission() method.
     *
     * @param filePath name of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadMission(final String filePath) {
        Mission mission = null;
        try (final FileReader fReader = new FileReader(filePath)) {
            mission = loadMission(fReader);
        } catch (IOException e) {
            LOGGER.error("Error reading mission file : " + filePath, e);
        }
        return mission;
    }

    /**
     * loadMission() method.
     *
     * @param inputStream input stream of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadMission(final InputStream inputStream) {
        return loadMission(new InputStreamReader(inputStream));
    }

    /**
     * loadMission() method.
     *
     * @param reader reader of a file to load
     * @return a mission object
     */
    @Override
    public final Mission loadMission(final Reader reader) {
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
     *
     * @param mission the mission to modify
     * @param line a line to treat
     */
    private void treatLine(final Mission mission, final String line) {
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
     *
     * @param row a tiles' row to treat
     */
    private List<Tile> treatTileRow(final String row) {
        final List<Tile> tiles = new ArrayList<>();
        final String[] sTiles = row.split(TILE_ROW_SEPARATOR);
        for (String sTile : sTiles) {
            final String[] tmp = sTile.split(TILE_ORIENTATION_SEPARATOR);
            tiles.add(new Tile(tmp[0], AxeUtil.convertToAxe(tmp[1])));
        }
        return tiles;
    }

}
