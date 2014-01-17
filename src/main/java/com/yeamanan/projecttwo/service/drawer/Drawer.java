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
     * @param argElement the element to draw
     * @param argParent the parent to set for the returning node
     * @return the node representing the T object
     */
    Node draw(Element argElement, Pane argParent);

}
