package com.yeamanan.projecttwo.service.stuff;

import com.yeamanan.projecttwo.model.mission.Tile;
import java.util.List;

/**
 * TileService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface TileService {

    /**
     * getFileNames() method.
     *
     * @return a list of tile file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a tile to load
     * @return a tile object
     */
    Tile load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of tile objects
     */
    List<Tile> loadAll();

    /**
     * save() method.
     *
     * @param argTile a tile object to save
     */
    void save(final Tile argTile);

}
