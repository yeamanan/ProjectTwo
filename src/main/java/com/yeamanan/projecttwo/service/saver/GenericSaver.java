package com.yeamanan.projecttwo.service.saver;

/**
 * GenericWriter interface.
 *
 * @param <T> class of the object to save
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface GenericSaver<T> {

    /**
     * save() method.
     *
     * @param argObject an object to save
     * @param argFileName the file name of the xml to save
     * @return a boolean
     */
    boolean save(T argObject, final String argFileName);

}
