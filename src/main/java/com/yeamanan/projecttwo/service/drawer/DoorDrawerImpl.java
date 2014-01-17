package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.mission.Direction;
import com.yeamanan.projecttwo.model.token.Door;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
//import org.apache.log4j.Logger;

/**
 * DoorDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class DoorDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
//    private static final Logger LOG = Logger.getLogger(DoorDrawerImpl.class);

    /**
     * buildFileName() method.
     *
     * @param argElement the element to draw
     * @return the file name of the image to load
     */
    @Override
    protected final String buildFileName(final Element argElement) {
        final Door door = (Door) argElement;
        String fileName = door.getClass().getSimpleName();
        fileName += "_" + door.getColor().getName();
        if (door.isOpen()) {
            fileName += "_Open";
        } else {
            fileName += "_Closed";
        }
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
        final Door door = (Door) argElement;
        final double width = argParent.getPrefWidth();
        final double height = argParent.getPrefHeight();
        double x = 0.0d, y = 0.0d;
        if (door.getDirection() == Direction.NORTH) {
            x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
        } else if (door.getDirection() == Direction.EAST) {
            x = width - argImage.getBoundsInLocal().getWidth();
            y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        } else if (door.getDirection() == Direction.SOUTH) {
            x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
            y = height - argImage.getBoundsInLocal().getHeight();
        } else if (door.getDirection() == Direction.WEST) {
            y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        }
        argImage.setLayoutX(x);
        argImage.setLayoutY(y);
        argImage.setRotate(door.getDirection().getAngle());
    }

}
