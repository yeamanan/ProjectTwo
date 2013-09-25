package com.yeamanan.projecttwo.service;

import java.util.List;

/**
 * GenericIOService interface.
 *
 * @param <T> class of the object
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface GenericIOService<T> {

    /**
     * getFileNames() method.
     *
     * @return a list of file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of the xml to load
     * @return an object
     */
    T load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of objects
     */
    List<T> loadAll();

    /**
     * save() method.
     *
     * @param argObject an object to save
     * @param argFileName the file name of the xml to save
     */
    void save(T argObject, final String argFileName);

}
