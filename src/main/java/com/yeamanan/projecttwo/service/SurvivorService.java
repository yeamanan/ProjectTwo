package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.Survivor;
import com.yeamanan.projecttwo.model.ZombieCard;
import java.util.List;

/**
 * SurvivorService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface SurvivorService {

    /**
     * getNames() method.
     *
     * @return a list of survivor names
     */
    List<String> getNames();

    /**
     * load() method.
     *
     * @param argName the name of a survivor to load
     * @return a survivor object
     */
    Survivor load(final String argName);

    /**
     * save() method.
     *
     * @param argSurvivor a survivor object to save
     */
    void save(Survivor argSurvivor);

}
