package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * GenericDrawer interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface Drawer {

    /**
     * draw() method.
     *
     * @param argFileName the file name of the image to load
     * @return the node representing the T object
     */
    Node draw(Element argElement, Pane argParent);

}
