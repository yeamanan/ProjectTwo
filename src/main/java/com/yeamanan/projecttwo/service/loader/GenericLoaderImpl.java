package com.yeamanan.projecttwo.service.loader;

import com.yeamanan.projecttwo.service.GenericService;
import com.yeamanan.projecttwo.util.JarUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.log4j.Logger;

/**
 * GenericLoaderImpl class.
 *
 * @param <T> class of the object to load
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class GenericLoaderImpl<T> extends GenericService implements GenericLoader<T> {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(GenericLoaderImpl.class);

    /**
     * Constructor.
     *
     * @param argFolder the folder where are those xml file
     * @param argExtension the extension of the xml file
     * @param argClass the class of the object to load
     */
    public GenericLoaderImpl(final String argFolder, final String argExtension,
            final Class argClass) {
        super(argFolder, argExtension, argClass);
    }

    /**
     * getFileNames() method.
     *
     * @return a list of file names
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
     * @param argFileName the file name of the xml to load
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

}
