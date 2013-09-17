package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Weapon;
import com.yeamanan.projecttwo.service.GenericIOService;
import com.yeamanan.projecttwo.service.GenericIOServiceImpl;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * WeaponServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class WeaponIOServiceImpl implements WeaponIOService {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(WeaponServiceImpl.class);

    /**
     * Equipment cards folder in jar.
     */
    private static final String FOLDER = "cards/weapons/";

    /**
     * Equipment cards file's extension.
     */
    private static final String EXTENSION = ".wxml";

    /**
     * Generic service.
     */
    private final transient GenericIOService<Weapon> service;

    /**
     * Constructor.
     */
    public WeaponIOServiceImpl() {
        this.service = new GenericIOServiceImpl(FOLDER, EXTENSION, Weapon.class);
    }

    /**
     * getNames() method.
     *
     * @return a list of weapon card file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a weapon card to load
     * @return a weapon card object
     */
    @Override
    public final Weapon load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of weapon card objects
     */
    @Override
    public final List<Weapon> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argCard a weapon card object to save
     */
    @Override
    public final void save(final Weapon argCard) {
        this.service.save(argCard, argCard.getName());
    }

}
