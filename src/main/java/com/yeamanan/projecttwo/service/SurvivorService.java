package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.people.Survivor;
import java.util.List;

/**
 * SurvivorService interface.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public interface SurvivorService {

    /**
     * getSurvivorNames() method.
     *
     * @return a list of survivor names
     */
    List<String> getSurvivorNames();

    /**
     * loadSurvivor() method.
     *
     * @param argName the name of a survivor to load
     * @return a survivor object
     */
    Survivor loadSurvivor(final String argName);

}
