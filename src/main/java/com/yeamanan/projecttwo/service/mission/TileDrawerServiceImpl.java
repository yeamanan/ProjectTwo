package com.yeamanan.projecttwo.service.mission;

import com.yeamanan.projecttwo.model.mission.Tile;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
//import org.apache.log4j.Logger;

/**
 * TileDrawerServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class TileDrawerServiceImpl implements TileDrawerService {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(TileDrawerServiceImpl.class);

    /**
     * Width and height of a tile.
     */
    private final static double WIDTH = 250.0d, HEIGHT = 250.0d;

    /**
     * draw() method.
     *
     * @param argTile the tile to draw
     * @return the node representing the mission
     */
    @Override
    public final Node draw(final Tile argTile) {
        final String tPath = "images/" + argTile.getName() + ".jpg";
        final Pane pane = new Pane();
        pane.setLayoutX(argTile.getX() * WIDTH);
        pane.setLayoutY(argTile.getY() * HEIGHT);
        pane.setPrefSize(WIDTH, HEIGHT);
        pane.setStyle("-fx-background-image: url(\"" + tPath + "\")");
        pane.setId(argTile.getName());
        pane.setRotate(argTile.getAxe().getAngle());
        return pane;
    }

}
