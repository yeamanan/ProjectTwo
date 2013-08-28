package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.ZombieCard;
import java.util.List;

/**
 * ZombieCardService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface ZombieCardService {

    /**
     * getFileNames() method.
     *
     * @return a list of zombie card file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a zombie card to load
     * @return a zombie card object
     */
    ZombieCard load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    List<ZombieCard> loadAll();

    /**
     * save() method.
     *
     * @param argZombieCard a zombie card object to save
     */
    void save(final ZombieCard argZombieCard);

}
