package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.Survivor;
import com.yeamanan.projecttwo.model.ZombieCard;
import com.yeamanan.projecttwo.util.JarUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.apache.log4j.Logger;

/**
 * ZombieCardServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZombieCardServiceImpl implements ZombieCardService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(ZombieCardServiceImpl.class);

    /**
     * Zombie cards file folder in jar.
     */
    private static final String FOLDER = "cards/zombie/";

    /**
     * Zombie cards file's extension.
     */
    private static final String EXTENSION = ".zcxml";

    /**
     * Generic service.
     */
    private GenericService<ZombieCard> service;

    public ZombieCardServiceImpl() {
        this.service = new GenericServiceImpl<>(FOLDER, EXTENSION, ZombieCard.class);
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
    public final ZombieCard load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<ZombieCard> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argCard a zombie card object to save
     */
    @Override
    public final void save(final ZombieCard argZombieCard) {
        this.service.save(argZombieCard, argZombieCard.getId());
    }

}
