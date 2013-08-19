package com.yeamanan.projecttwo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * PropertyUtil class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public final class PropertyUtil {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(PropertyUtil.class);

    /**
     * Folder name.
     */
    private static final String folderName = ".projecttwo";

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
     * Properties.
     */
    private final Properties properties;

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
    public PropertyUtil() {
        properties = new Properties();
        LOGGER.info(filePath);
        createFile();
        try (final FileInputStream stream = new FileInputStream(filePath)) {
            if(stream != null) {
                properties.load(stream);
            }
        } catch (IOException ex) {
            LOGGER.info("Error reading config file", ex);
        }
    }

    /**
     * getProperty() method.
     *
     * @param key the key
     * @return the value for the key
     */
    public String getProperty(final String key) {
        return properties.getProperty(key);
    }

    /**
     * setProperty() method.
     *
     * @param key a key
     * @param value a value
     */
    public void setProperty(final String key, final String value) {
        properties.setProperty(key, value);
        createFile();
        try (final FileOutputStream stream = new FileOutputStream(filePath)) {
            properties.store(stream, null);
        } catch (IOException ex) {
            LOGGER.info("Error writing config file", ex);
        }
    }

    /**
     * createFile() method.
     */
    public void createFile() {
        File file = new File(folderPath);
        if(!file.exists()) {
            file.mkdir();
        }
        file = new File(filePath);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                LOGGER.info("Error writing config file", ex);
            }
        }
    }

}
