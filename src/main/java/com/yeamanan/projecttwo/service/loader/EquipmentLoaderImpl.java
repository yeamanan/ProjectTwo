package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.model.card.Equipment;
import com.yeamanan.projecttwo.service.loader.GenericLoader;
import com.yeamanan.projecttwo.service.loader.GenericLoaderImpl;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * EquipmentLoaderImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class EquipmentLoaderImpl implements EquipmentLoader {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(EquipmentLoaderImpl.class);

    /**
     * Equipment cards folder in jar.
     */
    private static final String FOLDER = "cards/equipments/";

    /**
     * Equipment cards file's extension.
     */
    private static final String EXTENSION = ".exml";

    /**
     * Generic service.
     */
    private final transient GenericLoader<Equipment> service;

    /**
     * Constructor.
     */
    public EquipmentLoaderImpl() {
        this.service =
                new GenericLoaderImpl(FOLDER, EXTENSION, Equipment.class);
    }

    /**
     * getNames() method.
     *
     * @return a list of equipment card file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of an equipment card to load
     * @return an equipment card object
     */
    @Override
    public final Equipment load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of equipment card objects
     */
    @Override
    public final List<Equipment> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argCard an equipment card object to save
     */
//    @Override
//    public final void save(final Equipment argCard) {
//        this.service.save(argCard, argCard.getName());
//    }

}
