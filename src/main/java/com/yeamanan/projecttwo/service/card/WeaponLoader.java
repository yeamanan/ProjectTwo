package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Weapon;
import java.util.List;

/**
 * WeaponLoader interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface WeaponLoader {

    /**
     * getFileNames() method.
     *
     * @return a list of weapon card names
     */
    List<String> getFileNames();

    /**
     * load() method.
     *
     * @param argFileName the file name of a weapon card to load
     * @return a weapon card object
     */
    Weapon load(final String argFileName);

    /**
     * loadAll() method.
     *
     * @return a list of weapon card objects
     */
    List<Weapon> loadAll();

    /**
     * save() method.
     *
     * @param argCard a weapon card object to save
     */
//    void save(Weapon argCard);

}
