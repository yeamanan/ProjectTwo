package com.yeamanan.projecttwo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * LanguagesUtil class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public final class LanguagesUtil {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(LanguagesUtil.class);

    /**
     * Bundles folder in jar.
     */
    private final static String BUNDLES_FOLDER = "bundles/";

    /**
     * Constructor.
     */
    private LanguagesUtil() { }

    /**
     * loadDefaultLanguage() method.
     */
    public static ResourceBundle loadDefaultLanguage() {
        return ResourceBundle.getBundle("bundles.Language");
    }

    /**
     * loadLanguage() method.
     *
     * @param language the language to load
     */
    public static ResourceBundle loadLanguage(final String language) {
        final Locale locale = new Locale(language);
        return ResourceBundle.getBundle("bundles.Language", locale);
    }

    /**
     * getAvailableLanguages() method.
     *
     * @param aClass a class to load the languages
     */
    public static List<ResourceBundle> loadLanguages(final Class aClass) {
        final List<ResourceBundle> languages = new ArrayList<>();
        final List<String> files =
            JarUtil.getJarFolderFileList(aClass, BUNDLES_FOLDER);
        for (String file : files) {
            final Locale locale = new Locale(file.substring(17, 19));
            final ResourceBundle bundle =
                    ResourceBundle.getBundle("bundles.Language", locale);
            languages.add(bundle);
        }
        return languages;
    }

}
