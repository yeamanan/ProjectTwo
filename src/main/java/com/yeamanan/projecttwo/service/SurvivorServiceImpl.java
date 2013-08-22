package com.yeamanan.projecttwo.service;

import com.yeamanan.projecttwo.model.people.Survivor;
import com.yeamanan.projecttwo.util.JarUtil;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
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
     * Survivor folder in jar.
     */
    private static final String SURVIVORS_FOLDER = "survivors/";

    /**
     * Survivor file's extension.
     */
    private static final String SURVIVOR_EXTENSION = ".sxml";

    /**
     * getSurvivorNames() method.
     *
     * @return a list of survivor names
     */
    @Override
    public final List<String> getSurvivorNames() {
        final List<String> sNames = new ArrayList<>();
        final Class aClass = this.getClass();
        final List<String> sPaths =
                JarUtil.getJarFolderFileList(aClass, SURVIVORS_FOLDER);
        for (String sPath : sPaths) {
            final String sName = sPath.replaceFirst(SURVIVORS_FOLDER, "")
                    .replaceFirst(SURVIVOR_EXTENSION, "");
            sNames.add(sName);
        }
        return sNames;
    }

    /**
     * loadSurvivor() method.
     *
     * @param argName the name of a survivor to load
     * @return a survivor object
     */
    @Override
    public final Survivor loadSurvivor(final String argName) {
        final String sPath = SURVIVORS_FOLDER + argName + SURVIVOR_EXTENSION;
        final Class aClass = this.getClass();
        final InputStream stream =
                    aClass.getClassLoader().getResourceAsStream(sPath);
        Survivor survivor = null;
        try {
            final JAXBContext context = JAXBContext.newInstance(Survivor.class);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            survivor = (Survivor) unmarshaller.unmarshal(stream);
        } catch (JAXBException ex) {
            LOGGER.error("Error loading survivor file", ex);
        }
        return survivor;
    }

}
