package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.util.JarUtil;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * GenericDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class GenericDrawerImpl implements Drawer {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(GenericDrawerImpl.class);

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
        LOG.info(path);
        final ImageView image = new ImageView(path);
        final double width = argParent.getPrefWidth();
        final double height = argParent.getPrefHeight();
        final double x = (width - image.getBoundsInLocal().getWidth()) / 2;
        final double y = (height - image.getBoundsInLocal().getHeight()) / 2;
        image.setLayoutX(x);
        image.setLayoutY(y);
        return image;
    }

    public String buildFileName(final Element argElement) {
        return  argElement.getClass().getSimpleName();
    }

    public final String buildPath(final String argFileName) {
        String path = "images/" + argFileName + ".jpg";
        List<String> images =
                JarUtil.getJarFolderFileList(this.getClass(), "images/");
        if (!images.contains(path)) {
            path = "images/" + argFileName + ".png";
        }
        return path;
    }

}