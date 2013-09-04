package com.yeamanan.projecttwo.service.stuff;

import com.yeamanan.projecttwo.model.stuff.Mission;
import com.yeamanan.projecttwo.service.GenericService;
import com.yeamanan.projecttwo.service.GenericServiceImpl;
//import com.yeamanan.projecttwo.model.Tile;
//import com.yeamanan.projecttwo.util.AxeUtil;
//import java.util.ArrayList;
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
    private static final Logger LOG =
            Logger.getLogger(MissionServiceImpl.class);

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
    private GenericService<Mission> service;

    /**
     * Constructor.
     */
    public MissionServiceImpl() {
        this.service =
                new GenericServiceImpl<>(FOLDER, EXTENSION, Mission.class);
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
    @Override
    public final void save(final Mission argMission) {
        final String sName = argMission.getId() + " - " + argMission.getName();
        this.service.save(argMission, sName);
    }

    /**
     * treatLine() method.
     *
     * @param mission the mission to modify
     * @param line a line to treat
     */
//    private void treatLine(final Mission mission, final String line) {
//        final String[] tmp = line.split(PROPERTY_SEPARATOR);
//        switch (tmp[0]) {
//            case "id":
//                mission.setId(tmp[1]);
//                break;
//            case "name":
//                mission.setName(tmp[1]);
//                break;
//            case "row":
//                mission.getGrid().add(treatTileRow(tmp[1]));
//                break;
//            case "objective":
//                break;
//            default:
//        }
//    }

    /**
     * treatTileRow() method.
     *
     * @param row a tiles' row to treat
     */
//    private List<Tile> treatTileRow(final String row) {
//        final List<Tile> tiles = new ArrayList<>();
//        final String[] sTiles = row.split(TILE_ROW_SEPARATOR);
//        for (String sTile : sTiles) {
//            final String[] tmp = sTile.split(TILE_ORIENTATION_SEPARATOR);
//            tiles.add(new Tile(tmp[0], AxeUtil.convertToAxe(tmp[1])));
//        }
//        return tiles;
//    }

}
