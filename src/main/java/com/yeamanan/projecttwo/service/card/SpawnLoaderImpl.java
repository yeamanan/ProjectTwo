package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Spawn;
import com.yeamanan.projecttwo.service.GenericLoader;
import com.yeamanan.projecttwo.service.GenericLoaderImpl;
import java.util.List;
//import org.apache.log4j.Logger;

/**
 * SpawnLoaderImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SpawnLoaderImpl implements SpawnLoader {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(SpawnLoaderImpl.class);

    /**
     * Spawn cards file folder in jar.
     */
    private static final String FOLDER = "cards/invasions/";

    /**
     * Spawn cards file's extension.
     */
    private static final String EXTENSION = ".ixml";

    /**
     * Generic service.
     */
    private final transient GenericLoader<Spawn> service;

    /**
     * Constructor.
     */
    public SpawnLoaderImpl() {
        this.service = new GenericLoaderImpl(FOLDER, EXTENSION, Spawn.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of spawn card file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a spawn card to load
     * @return a spawn card object
     */
    @Override
    public final Spawn load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of spawn card objects
     */
    @Override
    public final List<Spawn> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argSpawnCard an spawn card object to save
     */
//    @Override
//    public final void save(final Spawn argSpawnCard) {
//        this.service.save(argSpawnCard, argSpawnCard.getName());
//    }

}
