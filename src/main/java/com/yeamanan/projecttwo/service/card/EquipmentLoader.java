package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Equipment;
import java.util.List;

/**
 * EquipmentLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface EquipmentLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of equipment card file names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of an equipment card to load
     * @return a equipment card object
     */
    Equipment load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of equipment card objects
     */
    List<Equipment> loadAll();

    /**
     * save() method.
     *
     * @param argCard an equipment card object to save
     */
//    void save(Equipment argCard);

}
