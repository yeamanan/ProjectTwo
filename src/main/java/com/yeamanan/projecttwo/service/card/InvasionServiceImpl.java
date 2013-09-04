package com.yeamanan.projecttwo.service.card;

import com.yeamanan.projecttwo.model.card.Invasion;
import com.yeamanan.projecttwo.service.GenericService;
import com.yeamanan.projecttwo.service.GenericServiceImpl;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * InvasionServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class InvasionServiceImpl implements InvasionService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(InvasionServiceImpl.class);

    /**
     * Zombie cards file folder in jar.
     */
    private static final String FOLDER = "cards/invasions/";

    /**
     * Zombie cards file's extension.
     */
    private static final String EXTENSION = ".ixml";

    /**
     * Generic service.
     */
    private GenericService<Invasion> service;

    /**
     * Constructor.
     */
    public InvasionServiceImpl() {
        this.service = new GenericServiceImpl<>(FOLDER, EXTENSION, Invasion.class);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of zombie card file names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the file name of a zombie card to load
     * @return a zombie card object
     */
    @Override
    public final Invasion load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<Invasion> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argCard a zombie card object to save
     */
    @Override
    public final void save(final Invasion argZombieCard) {
        this.service.save(argZombieCard, argZombieCard.getName());
    }

}
