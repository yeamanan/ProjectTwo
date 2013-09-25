package com.yeamanan.projecttwo.service;

import javafx.scene.Node;

/**
 * GenericReaderService interface.
 *
 * @param <T> class of the object
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface GenericDrawerService<T> {

    /**
     * draw() method.
     *
     * @param argObject the object to draw
     * @return the node representing the T object
     */
    Node draw(T argObject, double argWidth, double argHeight);

}
