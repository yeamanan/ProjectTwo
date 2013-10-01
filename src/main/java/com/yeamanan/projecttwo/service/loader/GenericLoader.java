package com.yeamanan.projecttwo.service.loader;

import java.util.List;

/**
 * GenericLoader interface.
 *
 * @param <T> class of the object to load
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface GenericLoader<T> {

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

}
