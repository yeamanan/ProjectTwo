package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.token.Spawn;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * SpawnDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SpawnDrawerImpl extends GenericDrawerImpl {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(SpawnDrawerImpl.class);

    /**
     * draw() method.
     *
     * @param argElement the element to draw
     * @param argParent the parent of the element to draw in
     * @return the node representing the image
     */
//    @Override
//    public final Node draw(final Element argElement, final Pane argParent) {
//        final Spawn spawn = (Spawn) argElement;
//        String fileName = spawn.getClass().getSimpleName();
//        fileName += "_" + spawn.getColor().getName();
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
        final Spawn spawn = (Spawn) argElement;
        String fileName = spawn.getClass().getSimpleName();
        fileName += "_" + spawn.getColor().getName();
        return  fileName;
    }

}
