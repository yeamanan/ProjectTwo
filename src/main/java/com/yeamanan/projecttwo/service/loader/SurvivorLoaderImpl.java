package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.service.loader.GenericLoader;
import com.yeamanan.projecttwo.service.loader.GenericLoaderImpl;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * SurvivorLoaderImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorLoaderImpl implements SurvivorLoader {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(SurvivorLoaderImpl.class);

    /**
     * Survivor file folder in jar.
     */
    private static final String FOLDER = "survivors/";

    /**
     * Survivor file's extension.
     */
    private static final String EXTENSION = ".sxml";

    /**
     * Generic service.
     */
    private final transient GenericLoader<Survivor> service;

    /**
     * Constructor.
     */
    public SurvivorLoaderImpl() {
        this.service =
                new GenericLoaderImpl(FOLDER, EXTENSION, Survivor.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of survivor file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a survivor to load
     * @return a survivor object
     */
    @Override
    public final Survivor load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<Survivor> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argSurvivor a survivor object to save
     */
//    @Override
//    public final void save(final Survivor argSurvivor) {
//        service.save(argSurvivor, argSurvivor.getName());
//    }

}
