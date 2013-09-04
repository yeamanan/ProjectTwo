package com.yeamanan.projecttwo.service.stuff;

import com.yeamanan.projecttwo.model.stuff.Tile;
import com.yeamanan.projecttwo.service.GenericService;
import com.yeamanan.projecttwo.service.GenericServiceImpl;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * TileServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class TileServiceImpl implements TileService {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(TileServiceImpl.class);

    /**
     * Tiles folder in jar.
     */
    private static final String FOLDER = "tiles/";

    /**
     * Tile file's extension.
     */
    private static final String EXTENSION = ".txml";

    /**
     * Generic service.
     */
    private GenericService<Tile> service;

    /**
     * Constructor.
     */
    public TileServiceImpl() {
        this.service = new GenericServiceImpl<>(FOLDER, EXTENSION, Tile.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of tile file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a tile to load
     * @return a tile object
     */
    @Override
    public final Tile load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of tile objects
     */
    @Override
    public final List<Tile> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argTile a tile object to save
     */
    @Override
    public final void save(final Tile argTile) {
        this.service.save(argTile, argTile.getName());
    }

    /**
     * treatLine() method.
     *
     * @param mission a mission to modify
     * @param line a line to treat
     */
//    private void treatLine(final Tile tile, final String line) {
//        final String[] tmp = line.split(PROPERTY_SEPARATOR);
//        switch (tmp[0]) {
//            case "name":
//                tile.setName(tmp[1]);
//                break;
//            case "zones":
//                tile.getZones().add(treatZones(tmp[1]));
//                break;
//            case "zonesstates":
//                tile.getZonesStates().add(treatStates(tmp[1]));
//                break;
//            default:
//        }
//    }

    /**
     * treatZones() method.
     *
     * @param argZones a list of zone to treat
     */
//    private List<String> treatZones(final String argZones) {
//        final List<String> zones = new ArrayList<>();
//        final String[] sZones = argZones.split(ZONE_SEPARATOR);
//        Collections.addAll(zones, sZones);
////        for (String sZone : sZones) {
////            zones.add(sZone);
////        }
//        return zones;
//    }

    /**
     * treatStates() method.
     *
     * @param argStates a list of state to treat
     */
//    private List<State> treatStates(final String argStates) {
//        final List<State> states = new ArrayList<>();
//        final String[] sStates = argStates.split(ZONE_SEPARATOR);
//        for (String sState : sStates) {
//            states.add(StateUtil.convertToState(sState));
//        }
//        return states;
//    }

}
