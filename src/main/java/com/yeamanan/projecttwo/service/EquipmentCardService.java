package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.EquipmentCard;
import java.util.List;

/**
 * EquipmentCardService interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface EquipmentCardService {

    /**
     * getFileNames() method.
     *
     * @return a list of equipment card names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argName the id of a equipment card to load
     * @return a equipment card object
     */
    EquipmentCard load(final String argName);

    /**
     * loadAll() method.
     *
     * @return a list of equipment card objects
     */
    List<EquipmentCard> loadAll();

    /**
     * save() method.
     *
     * @param argCard a equipment card object to save
     */
    void save(EquipmentCard argCard);

}
