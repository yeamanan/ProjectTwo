package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * ImageDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ImageDrawerImpl implements Drawer {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(ImageDrawerImpl.class);

    /**
     * draw() method.
     *
     * @param argElement the element to draw
     * @param argParent the parent of the element to draw in
     * @return the node representing the image
     */
    @Override
    public final Node draw(final Element argElement, final Pane argParent) {
        final String fileName = buildFileName(argElement);
        final String path = buildPath(fileName);
        final ImageView image = new ImageView(path);
        calculPositionAndRotation(argElement, image, argParent);
        return image;
    }

    /**
     * buildFileName() method.
     *
     * @param argElement the element to draw
     * @return the file name of the image to load
     */
    public String buildFileName(final Element argElement) {
        return  argElement.getClass().getSimpleName();
    }

    /**
     * buildPath() method.
     *
     * @param argFileName the file name of the image to load
     * @return the path of the image to load
     */
    public final String buildPath(final String argFileName) {
//        String path = "images/" + argFileName + ".jpg";
//        List<String> images =
//                JarUtil.getJarFolderFileList(this.getClass(), "images/");
//        if (!images.contains(path)) {
//            path = "images/" + argFileName + ".png";
//        }
        return "images/" + argFileName + ".png";
    }

    /**
     * calculPositionAndRotation() method.
     *
     * @param argElement the element to draw
     * @param argImage the image loaded
     * @param argParent the parent of the element to draw in
     */
    public void calculPositionAndRotation(final Element argElement,
            final ImageView argImage, final Pane argParent) {
        final double width = argParent.getPrefWidth();
        final double height = argParent.getPrefHeight();
        final double x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
        final double y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        argImage.setLayoutX(x);
        argImage.setLayoutY(y);
    }

}
