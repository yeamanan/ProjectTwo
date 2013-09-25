package com.yeamanan.projecttwo.service;

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
 * GenericIOServiceImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 * @param <T> a type of object for the service
 */
public class GenericIOServiceImpl<T> implements GenericIOService<T> {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(GenericIOServiceImpl.class);

    /**
     * Object folder in jar.
     */
    private final transient String folder;

    /**
     * XML file's extension.
     */
    private final transient String extension;

    /**
     * Type of generic.
     */
    private final transient Class gClass;

    /**
     * Constructor.
     *
     * @param argFolder the folder where are those xml file
     * @param argExtension the extension of the xml file
     * @param argClass a class
     */
    public GenericIOServiceImpl(final String argFolder, final String argExtension,
            final Class argClass) {
        this.folder = argFolder;
        this.extension = argExtension;
        this.gClass = argClass;
    }

    /**
     * getFileNames() method.
     *
     * @return a list of equipment card names
     */
    @Override
    public final List<String> getFileNames() {
        final List<String> sFileNames = new ArrayList();
        final Class aClass = this.getClass();
        final List<String> sPaths =
                JarUtil.getJarFolderFileList(aClass, this.folder);
        for (String sPath : sPaths) {
            final String sFileName = sPath.replaceFirst(this.folder, "")
                    .replaceFirst(this.extension, "");
            sFileNames.add(sFileName);
        }
        return sFileNames;
    }

    /**
     * load() method.
     *
     * @param argFileName the file name to load
     * @return an object
     */
    @Override
    public final T load(final String argFileName) {
        final String sPath = this.folder + argFileName + this.extension;
        final Class aClass = this.getClass();
        final InputStream stream =
                aClass.getClassLoader().getResourceAsStream(sPath);
        T object = null;
        try {
            final JAXBContext context = JAXBContext.newInstance(this.gClass);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            object = (T) unmarshaller.unmarshal(stream);
        } catch (JAXBException ex) {
            LOG.error("Error loading " + this.gClass + " file", ex);
        }
        return object;
    }

    /**
     * loadAll() method.
     *
     * @return a list of objects
     */
    @Override
    public final List<T> loadAll() {
        final List<T> objects = new ArrayList();
        for (String sName : getFileNames()) {
            objects.add(load(sName));
        }
        return objects;
    }

    /**
     * save() method.
     *
     * @param argObject an object to save
     * @param argFileName the file name of the object
     */
    @Override
    public final void save(final T argObject, final String argFileName) {
        final String sPath = System.getProperty("user.home") + "/"
                + argFileName + this.extension;
        final File file = new File(sPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
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
    }

}
