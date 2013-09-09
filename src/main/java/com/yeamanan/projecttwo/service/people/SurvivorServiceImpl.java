package com.yeamanan.projecttwo.service.people;

import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.service.GenericService;
import com.yeamanan.projecttwo.service.GenericServiceImpl;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * SurvivorServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorServiceImpl implements SurvivorService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(SurvivorServiceImpl.class);

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
    private GenericService<Survivor> service;

    public SurvivorServiceImpl() {
        this.service = new GenericServiceImpl<>(FOLDER, EXTENSION, Survivor.class);
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
    @Override
    public final void save(final Survivor argSurvivor) {
        service.save(argSurvivor, argSurvivor.getName());
    }

}
