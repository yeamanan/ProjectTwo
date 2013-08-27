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
     * getIds() method.
     *
     * @return a list of zombie card ids
     */
    List<String> getIds();

    /**
     * load() method.
     *
     * @param argId the id of a zombie card to load
     * @return a zombie card object
     */
    ZombieCard load(final String argId);

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    List<ZombieCard> loadAll();

    /**
     * save() method.
     *
     * @param argCard a zombie card object to save
     */
    void save(ZombieCard argCard);

}
