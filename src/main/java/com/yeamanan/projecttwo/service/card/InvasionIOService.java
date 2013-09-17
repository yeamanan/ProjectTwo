package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Invasion;
import java.util.List;

/**
 * InvasionService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface InvasionIOService {

    /**
     * getFileNames() method.
     *
     * @return a list of invasion card file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of an invasion card to load
     * @return an invasion card object
     */
    Invasion load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of invasion card objects
     */
    List<Invasion> loadAll();

    /**
     * save() method.
     *
     * @param argZombieCard an invasion card object to save
     */
    void save(final Invasion argZombieCard);

}
