package com.yeamanan.projecttwo.service.saver;

import com.yeamanan.projecttwo.service.GenericService;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.log4j.Logger;

/**
 * GenericSaverImpl class.
 *
 * @param <T> class of the object to save
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public final class GenericSaverImpl<T> extends GenericService implements GenericSaver<T> {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(GenericSaverImpl.class);

    /**
     * Constructor.
     *
     * @param argFolder the folder where are those xml file
     * @param argExtension the extension of the xml file
     * @param argClass the class of the object to save
     */
    public GenericSaverImpl(final String argFolder, final String argExtension,
                             final Class argClass) {
        super(argFolder, argExtension, argClass);
    }

    /**
     * save() method.
     *
     * @param argObject an object to save
     * @param argFileName the file name of the xml to save
     */
    @Override
    public boolean save(final T argObject, final String argFileName) {
        final String sPath = System.getProperty("user.home") + "/"
                + argFileName + this.extension;
        final File file = new File(sPath);
        if (!file.exists()) {
            try {
                if(!file.createNewFile()) {
                    return false;
                }
            } catch (IOException ex) {
                LOG.error("Error saving " + this.gClass + " file", ex);
            }
        }
        try {
            final JAXBContext context = JAXBContext.newInstance(this.gClass);
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(argObject, new File(sPath));
        } catch (JAXBException ex) {
            LOG.error("Error saving " + this.gClass + " file", ex);
        }
        return true;
    }

}
