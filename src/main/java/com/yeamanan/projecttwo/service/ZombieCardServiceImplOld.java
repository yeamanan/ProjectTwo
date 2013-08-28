package com.yeamanan.projecttwo.service;

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
public class ZombieCardServiceImplOld implements ZombieCardService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(ZombieCardServiceImplOld.class);

    /**
     * Zombie cards folder in jar.
     */
    private static final String ZOMBIE_CARDS_FOLDER = "cards/zombie/";

    /**
     * Zombie cards file's extension.
     */
    private static final String ZOMBIE_CARD_EXTENSION = ".zcxml";

    /**
     * getFileNames() method.
     *
     * @return a list of zombie card ids
     */
    @Override
    public final List<String> getFileNames() {
        final List<String> sIds = new ArrayList<>();
        final Class aClass = this.getClass();
        final List<String> sPaths =
                JarUtil.getJarFolderFileList(aClass, ZOMBIE_CARDS_FOLDER);
        for (String sPath : sPaths) {
            final String sId = sPath.replaceFirst(ZOMBIE_CARDS_FOLDER, "")
                    .replaceFirst(ZOMBIE_CARD_EXTENSION, "");
            sIds.add(sId);
        }
        return sIds;
    }

    /**
     * load() method.
     *
     * @param argId the id of a zombie card to load
     * @return a zombie card object
     */
    @Override
    public final ZombieCard load(final String argId) {
        final String sPath = ZOMBIE_CARDS_FOLDER + argId
                + ZOMBIE_CARD_EXTENSION;
        final Class aClass = this.getClass();
        final InputStream stream =
                    aClass.getClassLoader().getResourceAsStream(sPath);
        ZombieCard card = null;
        try {
            final JAXBContext context = JAXBContext.newInstance(ZombieCard.class);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            card = (ZombieCard) unmarshaller.unmarshal(stream);
        } catch (JAXBException ex) {
            LOGGER.error("Error loading zombie card file", ex);
        }
        return card;
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<ZombieCard> loadAll() {
        final List<ZombieCard> cards = new ArrayList<>();
        for (String sFileName : getFileNames()) {
            cards.add(load(sFileName));
        }
        return cards;
    }

    /**
     * save() method.
     *
     * @param argCard a zombie card object to save
     */
    @Override
    public final void save(final ZombieCard argCard) {
        final String sPath = System.getProperty("user.home") + "/"
                + argCard.getId() + ZOMBIE_CARD_EXTENSION;
        final File file = new File(sPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                LOGGER.error("Error saving zombie card file", ex);
            }
        }
        try {
            final JAXBContext context =
                    JAXBContext.newInstance(ZombieCard.class);
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(argCard, new File(sPath));
        } catch (JAXBException ex) {
            LOGGER.error("Error saving zombie card file", ex);
        }
    }

}
