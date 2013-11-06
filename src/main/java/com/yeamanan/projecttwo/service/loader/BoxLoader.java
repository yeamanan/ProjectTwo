package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.model.Box;
import java.util.List;

/**
 * BoxLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface BoxLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of box names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a box to load
     * @return a box object
     */
    Box load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of Box objects
     */
    List<Box> loadAll();

    /**
     * save() method.
     *
     * @param argBox a Box object to save
     */
//    void save(Box argBox);

}
