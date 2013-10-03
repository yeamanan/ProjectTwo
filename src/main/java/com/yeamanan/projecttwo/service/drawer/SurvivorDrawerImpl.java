package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Survivor;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.apache.log4j.Logger;

/**
 * SurvivorDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(SurvivorDrawerImpl.class);

    /**
     * buildFileName() method.
     *
     * @param argElement the element to draw
     * @return the file name of the image to load
     */
    @Override
    public String buildFileName(final Element argElement) {
        final Survivor survivor = (Survivor) argElement;
        String fileName = survivor.getName();
        return  fileName;
    }

    /**
     * calculPositionAndRotation() method.
     *
     * @param argElement the element to draw
     * @param argImage the image loaded
     * @param argParent the parent of the element to draw in
     */
    @Override
    public void calculPositionAndRotation(final Element argElement,
            final ImageView argImage, final Pane argParent) {
//        final double width = argParent.getPrefWidth();
//        final double height = argParent.getPrefHeight();
//        final double x = (width - argImage.getBoundsInLocal().getWidth()) / 2;
//        final double y = (height - argImage.getBoundsInLocal().getHeight()) / 2;
        argImage.setLayoutX(0.0d);
        argImage.setLayoutY(0.0d);
    }

}
