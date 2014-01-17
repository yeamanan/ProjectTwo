package com.yeamanan.projecttwo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * PropertiesUtil class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public final class PropertiesUtil {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(PropertiesUtil.class);

    /**
     * Folder name.
     */
    private static final String FOLDER_NAME = ".zombicide";

    /**
     * File name.
     */
    private static final String FILE_NAME = "config.cfg";

    /**
     * Folder path.
     */
    private static final String FOLDER_PATH;

    /**
     * File path.
     */
    private static final String FILE_PATH;

    /**
     * Static initialization
     */
    static {
        final String userHome = System.getProperty("user.home");
        FOLDER_PATH = userHome + File.separator + FOLDER_NAME + File.separator;
        FILE_PATH = FOLDER_PATH + FILE_NAME;
    }

    /**
     * Constructor.
     */
    private PropertiesUtil() { }

    /**
     * loadProperties() method.
     *
     * @return the properties of the application
     */
    public static Properties loadProperties() {
        final Properties properties = new Properties();
        if (pathExists(FILE_PATH)) {
            try (final FileInputStream stream = new FileInputStream(FILE_PATH)) {
                properties.load(stream);
            } catch (IOException ex) {
                LOG.error("Error reading config file", ex);
            }
        }
        return properties;
    }

    /**
     * saveProperties() method.
     *
     * @param properties the properties to save
     */
    public static boolean saveProperties(final Properties properties) {
        if (createFile()) {
            try (final FileOutputStream stream = new FileOutputStream(FILE_PATH)) {
                properties.store(stream, null);
            } catch (IOException ex) {
                LOG.error("Error writing config file", ex);
            }
            return true;
        }
        return false;
    }

    /**
     * createFile() method.
     */
    private static boolean createFile() {
        if(!pathExists(FOLDER_PATH)) {
            File file = new File(FOLDER_PATH);
            if (!file.mkdirs()) {
                return false;
            }
        }
        if(!pathExists(FILE_PATH)) {
            File file = new File(FILE_PATH);
            try {
                if(!file.createNewFile()) {
                    return false;
                }
            } catch (IOException ex) {
                LOG.error("Error creating config file", ex);
            }
        }
        return true;
    }

    /**
     * pathExists() method.
     *
     * @param path the path to test
     * @return a boolean
     */
    private static boolean pathExists(final String path) {
        final File file = new File(path);
        return file.exists();
    }

}
