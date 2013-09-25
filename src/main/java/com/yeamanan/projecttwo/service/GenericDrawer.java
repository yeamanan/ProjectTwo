package com.yeamanan.projecttwo.service;

import javafx.scene.Node;

/**
 * GenericDrawer interface.
 *
 * @param <T> class of the object to draw
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface GenericDrawer<T> {

    /**
     * draw() method.
     *
     * @param argObject the object to draw
     * @return the node representing the T object
     */
    Node draw(T argObject, double argWidth, double argHeight);

}
