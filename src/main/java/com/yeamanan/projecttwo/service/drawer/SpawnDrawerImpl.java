package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Direction;
import com.yeamanan.projecttwo.model.token.Spawn;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
//import org.apache.log4j.Logger;

/**
 * SpawnDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SpawnDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
//    private static final Logger LOG = Logger.getLogger(SpawnDrawerImpl.class);

    @Override
    protected final String buildFileName(final Element argElement) {
        final Spawn spawn = (Spawn) argElement;
        String fileName = spawn.getClass().getSimpleName();
        fileName += "_" + spawn.getColor().getName();
        return  fileName;
    }

    /**
     * calculatePositionAndRotation() method.
     *
     * @param argElement the element to draw
     * @param argImage the image loaded
     * @param argParent the parent of the element to draw in
     */
    @Override
    protected final void calculatePositionAndRotation(final Element argElement,
            final ImageView argImage, final Pane argParent) {
        final Spawn spawn = (Spawn) argElement;
        final double width = argParent.getPrefWidth();
        final double height = argParent.getPrefHeight();
        double x = 0.0d, y = 0.0d;
        if (spawn.getDirection() == Direction.NORTH) {
            x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
        } else if (spawn.getDirection() == Direction.EAST) {
            x = width - argImage.getBoundsInLocal().getWidth();
            y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        } else if (spawn.getDirection() == Direction.SOUTH) {
            x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
            y = height - argImage.getBoundsInLocal().getHeight();
        } else if (spawn.getDirection() == Direction.WEST) {
            y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        }
        argImage.setLayoutX(x);
        argImage.setLayoutY(y);
        argImage.setRotate(spawn.getDirection().getAngle());
    }

}
