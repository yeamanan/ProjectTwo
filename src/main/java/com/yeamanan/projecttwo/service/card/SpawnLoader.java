package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Spawn;
import java.util.List;

/**
 * SpawnLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface SpawnLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of spawn card file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of an spawn card to load
     * @return an invasion card object
     */
    Spawn load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of spawn card objects
     */
    List<Spawn> loadAll();

    /**
     * save() method.
     *
     * @param argSpawnCard an spawn card object to save
     */
//    void save(final Spawn argSpawnCard);

}
