package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.game.Tile;
import com.yeamanan.projecttwo.model.rule.State;
import com.yeamanan.projecttwo.util.JarUtil;
import com.yeamanan.projecttwo.util.StateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * TileServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class TileServiceImpl implements TileService {

    /**
     * Constants.
     */
    private static final String PROPERTY_SEPARATOR = "=", ZONE_SEPARATOR = ";";

    /**
     * Tiles folder in jar.
     */
    private static final String TILES_FOLDER = "tiles/";

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(TileServiceImpl.class);

    /**
     * loadTiles() method.
     *
     * @return a list of tile objects
     */
    @Override
    public final List<Tile> loadTiles() {
        final List<Tile> tiles = new ArrayList<>();
        final Class aClass = this.getClass();
        final List<String> filePaths =
                JarUtil.getJarFolderFileList(aClass, TILES_FOLDER);
        for(String path : filePaths) {
            final InputStream stream =
                    aClass.getClassLoader().getResourceAsStream(path);
            tiles.add(loadTile(stream));
        }
        return tiles;
    }

    /**
     * loadTile() method.
     *
     * @param inputStream input stream of a file to load
     * @return a tile object
     */
    @Override
    public final Tile loadTile(final InputStream inputStream) {
        return loadTile(new InputStreamReader(inputStream));
    }

    /**
     * loadMission() method.
     *
     * @param reader reader of a file to load
     * @return a mission object
     */
    @Override
    public final Tile loadTile(final Reader reader) {
        final Tile tile = new Tile();
        try (final BufferedReader bReader = new BufferedReader(reader)) {
            String sLine;
            while ((sLine = bReader.readLine()) != null) {
                treatLine(tile, sLine);
            }
        } catch (IOException e) {
            LOGGER.error("Error reading mission file", e);
        }
        return tile;
    }

    /**
     * treatLine() method.
     *
     * @param mission a mission to modify
     * @param line a line to treat
     */
    private void treatLine(final Tile tile, final String line) {
        final String[] tmp = line.split(PROPERTY_SEPARATOR);
        switch (tmp[0]) {
            case "name":
                tile.setName(tmp[1]);
                break;
            case "zones":
                tile.getZones().add(treatZones(tmp[1]));
                break;
            case "zonesstates":
                tile.getZonesStates().add(treatStates(tmp[1]));
                break;
            default:
        }
    }

    /**
     * treatZones() method.
     *
     * @param argZones a list of zone to treat
     */
    private List<String> treatZones(final String argZones) {
        final List<String> zones = new ArrayList<>();
        final String[] sZones = argZones.split(ZONE_SEPARATOR);
        Collections.addAll(zones, sZones);
//        for (String sZone : sZones) {
//            zones.add(sZone);
//        }
        return zones;
    }

    /**
     * treatStates() method.
     *
     * @param argStates a list of state to treat
     */
    private List<State> treatStates(final String argStates) {
        final List<State> states = new ArrayList<>();
        final String[] sStates = argStates.split(ZONE_SEPARATOR);
        for (String sState : sStates) {
            states.add(StateUtil.convertToState(sState));
        }
        return states;
    }

}
