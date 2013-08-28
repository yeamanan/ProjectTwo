package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.EquipmentCard;
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
 * EquipmentCardServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class EquipmentCardServiceImplOld implements EquipmentCardService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(EquipmentCardServiceImplOld.class);

    /**
     * Equipment cards folder in jar.
     */
    private static final String EQUIPMENT_CARDS_FOLDER = "cards/equipment/";

    /**
     * Equipment cards file's extension.
     */
    private static final String EQUIPMENT_CARD_EXTENSION = ".ecxml";

    /**
     * getFileNames() method.
     *
     * @return a list of equipment card names
     */
    @Override
    public final List<String> getFileNames() {
        final List<String> sNames = new ArrayList<>();
        final Class aClass = this.getClass();
        final List<String> sPaths =
                JarUtil.getJarFolderFileList(aClass, EQUIPMENT_CARDS_FOLDER);
        for (String sPath : sPaths) {
            final String sId = sPath.replaceFirst(EQUIPMENT_CARDS_FOLDER, "")
                    .replaceFirst(EQUIPMENT_CARD_EXTENSION, "");
            sNames.add(sId);
        }
        return sNames;
    }

    /**
     * load() method.
     *
     * @param argId the id of a zombie card to load
     * @return a zombie card object
     */
    @Override
    public final EquipmentCard load(final String argId) {
        final String sPath = EQUIPMENT_CARDS_FOLDER + argId
                + EQUIPMENT_CARD_EXTENSION;
        final Class aClass = this.getClass();
        final InputStream stream =
                    aClass.getClassLoader().getResourceAsStream(sPath);
        EquipmentCard card = null;
        try {
            final JAXBContext context =
                    JAXBContext.newInstance(EquipmentCard.class);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            card = (EquipmentCard) unmarshaller.unmarshal(stream);
        } catch (JAXBException ex) {
            LOGGER.error("Error loading equipment card file", ex);
        }
        return card;
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<EquipmentCard> loadAll() {
        final List<EquipmentCard> cards = new ArrayList<>();
        for (String sName : getFileNames()) {
            cards.add(load(sName));
        }
        return cards;
    }

    /**
     * save() method.
     *
     * @param argCard a zombie card object to save
     */
    @Override
    public final void save(final EquipmentCard argCard) {
        final String sPath = System.getProperty("user.home") + "/"
                + argCard.getName() + EQUIPMENT_CARD_EXTENSION;
        final File file = new File(sPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                LOGGER.error("Error saving equipment card file", ex);
            }
        }
        try {
            final JAXBContext context =
                    JAXBContext.newInstance(EquipmentCard.class);
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(argCard, new File(sPath));
        } catch (JAXBException ex) {
            LOGGER.error("Error saving equipment card file", ex);
        }
    }

}
