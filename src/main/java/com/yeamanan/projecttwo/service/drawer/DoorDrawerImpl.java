package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.token.Door;
import com.yeamanan.projecttwo.model.token.Spawn;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

/**
 * DoorDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class DoorDrawerImpl extends GenericDrawerImpl {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(DoorDrawerImpl.class);

    /**
     * draw() method.
     *
     * @param argElement the element to draw
     * @param argParent the parent of the element to draw in
     * @return the node representing the image
     */
//    @Override
//    public final Node draw(final Element argElement, final Pane argParent) {
//        final Door door = (Door) argElement;
//        String fileName = door.getClass().getSimpleName();
//        fileName += "_" + door.getColor().getName();
//        if (door.isOpen()) {
//            fileName += "_Open";
//        } else {
//            fileName += "_Closed";
//        }
//        final String path = "images/" + fileName + ".jpg";
//        LOG.info(path);
//        final ImageView image = new ImageView(path);
//        final double width = argParent.getPrefWidth();
//        final double height = argParent.getPrefHeight();
//        final double x = (width - image.getBoundsInLocal().getWidth()) / 2;
//        final double y = (height - image.getBoundsInLocal().getHeight()) / 2;
//        image.setLayoutX(x);
//        image.setLayoutY(y);
//        return image;
//    }

    @Override
    public String buildFileName(final Element argElement) {
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

}
