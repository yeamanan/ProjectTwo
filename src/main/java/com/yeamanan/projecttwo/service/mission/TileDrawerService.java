package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Tile;
import javafx.scene.Node;

/**
 * TileDrawerService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface TileDrawerService {

    /**
     * draw() method.
     *
     * @param argTile the tile to draw
     * @return the node representing the tile
     */
    Node draw(Tile argTile);

}
