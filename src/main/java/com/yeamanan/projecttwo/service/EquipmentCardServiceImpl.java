package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.EquipmentCard;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * EquipmentCardXMLServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class EquipmentCardServiceImpl implements EquipmentCardService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(EquipmentCardServiceImpl.class);

    /**
     * Equipment cards folder in jar.
     */
    private static final String FOLDER = "cards/equipment/";

    /**
     * Equipment cards file's extension.
     */
    private static final String EXTENSION = ".ecxml";

    /**
     * Generic service.
     */
    private GenericService<EquipmentCard> service;

    public EquipmentCardServiceImpl() {
        this.service = new GenericServiceImpl<>(FOLDER, EXTENSION, EquipmentCard.class);
    }

    /**
     * getNames() method.
     *
     * @return a list of equipment card names
     */
    @Override
    public final List<String> getFileNames() {
        return this.service.getFileNames();
    }

    /**
     * load() method.
     *
     * @param argFileName the id of a zombie card to load
     * @return a equipment card object
     */
    @Override
    public final EquipmentCard load(final String argFileName) {
        return this.service.load(argFileName);
    }

    /**
     * loadAll() method.
     *
     * @return a list of zombie card objects
     */
    @Override
    public final List<EquipmentCard> loadAll() {
        return this.service.loadAll();
    }

    /**
     * save() method.
     *
     * @param argCard a equipment card object to save
     */
    @Override
    public final void save(final EquipmentCard argCard) {
        this.service.save(argCard, argCard.getName());
    }

}
