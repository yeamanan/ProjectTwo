package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Tile;
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
    private final transient GenericService<Tile> service;

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

}
