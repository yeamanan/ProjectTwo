package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.Tile;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * TileService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface TileService {

    /**
     * loadTiles() method.
     *
     * @return a list of tiles objects
     */
    List<Tile> loadTiles();

    /**
     * loadTileFromFile() method.
     *
     * @param inputStream input stream of a file to load
     * @return a tile object
     */
    Tile loadTile(final InputStream inputStream);

    /**
     * loadTilesFromFile() method.
     *
     * @param reader reader of a file to load
     * @return a tile object
     */
    Tile loadTile(final Reader reader);

}
