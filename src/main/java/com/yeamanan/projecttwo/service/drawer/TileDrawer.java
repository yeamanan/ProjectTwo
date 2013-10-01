package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.mission.Tile;
import javafx.scene.Node;

/**
 * TileDrawer interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface TileDrawer {

    /**
     * draw() method.
     *
     * @param argTile the tile to draw
     * @return the node representing the tile
     */
    Node draw(Tile argTile);

}
