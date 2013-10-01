package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.model.character.Survivor;
import java.util.List;

/**
 * SurvivorLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface SurvivorLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of survivor file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a survivor to load
     * @return a survivor object
     */
    Survivor load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of survivor objects
     */
    List<Survivor> loadAll();

    /**
     * save() method.
     *
     * @param argSurvivor a survivor object to save
     */
//    void save(final Survivor argSurvivor);

}
