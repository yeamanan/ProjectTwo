package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.token.ColoredToken;
import com.yeamanan.projecttwo.model.token.Door;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

/**
 * GenericReaderServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 * @param <T> a type of object for the service
 */
public class GenericDrawerServiceImpl<T> implements GenericDrawerService<T> {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(GenericDrawerServiceImpl.class);

    /**
     * draw() method.
     *
     * @param argMission the mission to draw
     * @return the node representing the mission
     */
    @Override
    public final Node draw(final T argObject, final double argWidth, final double argHeight) {
        String fileName = argObject.getClass().getSimpleName();
        if (ColoredToken.class.isAssignableFrom(argObject.getClass())) {
            fileName += "_" + ((ColoredToken) argObject).getColor().getName();
        }
        if (argObject.getClass().equals(Door.class)) {
            if (((Door) argObject).isOpen()) {
                fileName += "_Open";
            } else {
                fileName += "_Closed";
            }
        }
        final String sPath = "images/" + fileName + ".jpg";
        final ImageView image = new ImageView(sPath);
        final double x = (argWidth - image.getBoundsInLocal().getWidth()) / 2;
        final double y = (argHeight - image.getBoundsInLocal().getHeight()) / 2;
        image.setLayoutX(x);
        image.setLayoutY(y);
        return image;
    }

}
