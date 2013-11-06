package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.model.Box;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * BoxLoaderImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class BoxLoaderImpl implements BoxLoader {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(WeaponLoaderImpl.class);

    /**
     * Equipment cards folder in jar.
     */
    private static final String FOLDER = "boxes/";

    /**
     * Equipment cards file's extension.
     */
    private static final String EXTENSION = ".bxml";

    /**
     * Generic service.
     */
    private final transient GenericLoader<Box> service;

    /**
     * Constructor.
     */
    public BoxLoaderImpl() {
        this.service = new GenericLoaderImpl(FOLDER, EXTENSION, Box.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of box file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a box to load
     * @return a box object
     */
    @Override
    public final Box load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of box objects
     */
    @Override
    public final List<Box> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argBox a box object to save
     */
//    @Override
//    public final void save(final Box argBox) {
//        this.service.save(argBox, argBox.getName());
//    }

}
