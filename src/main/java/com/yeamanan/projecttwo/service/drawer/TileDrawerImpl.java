package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Tile;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
//import org.apache.log4j.Logger;

/**
 * TileDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class TileDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(TileDrawerImpl.class);

    /**
     * buildFileName() method.
     *
     * @param argElement the element to draw
     * @return the file name of the image to load
     */
    @Override
    public String buildFileName(final Element argElement) {
        final Tile tile = (Tile) argElement;
        return tile.getName();
    }

    /**
     * calculPositionAndRotation() method.
     *
     * @param argElement the element to draw
     * @param argImage the image loaded
     * @param argParent the parent of the element to draw in
     */
    @Override
    public final void calculPositionAndRotation(final Element argElement,
            final ImageView argImage, final Pane argParent) {
        final Tile tile = (Tile) argElement;
        final double width = argImage.getBoundsInLocal().getWidth();
        final double height = argImage.getBoundsInLocal().getHeight();
        argImage.setLayoutX(tile.getX() * width);
        argImage.setLayoutY(tile.getY() * height);
        argImage.setRotate(tile.getDirection().getAngle());
    }

}
