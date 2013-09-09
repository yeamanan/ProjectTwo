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
    private static final String folderName = ".zombicide";

    /**
     * File name.
     */
    private static final String fileName = "config.cfg";

    /**
     * Folder path.
     */
    private static final String folderPath;

    /**
     * File path.
     */
    private static final String filePath;

    /**
     * Static initialization
     */
    static {
        final String userHome = System.getProperty("user.home");
        folderPath = userHome + File.separator + folderName + File.separator;
        filePath = folderPath + fileName;
    }

    /**
     * Constructor.
     */
    public PropertiesUtil() { }

    /**
     * loadProperties() method.
     *
     * @return the properties of the application
     */
    public static Properties loadProperties() {
        final Properties properties = new Properties();
        if (pathExists(filePath)) {
            try (final FileInputStream stream = new FileInputStream(filePath)) {
                if (stream != null) {
                    properties.load(stream);
                }
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
        if (!createFile()) {
            return false;
        }
        try (final FileOutputStream stream = new FileOutputStream(filePath)) {
            properties.store(stream, null);
        } catch (IOException ex) {
            LOG.error("Error writing config file", ex);
        }
        return true;
    }

    /**
     * createFile() method.
     */
    private static boolean createFile() {
        if(!pathExists(folderPath)) {
            File file = new File(folderPath);
            if (!file.mkdirs()) {
                return false;
            }
        }
        if(!pathExists(filePath)) {
            File file = new File(filePath);
            try {
                file.createNewFile();
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
