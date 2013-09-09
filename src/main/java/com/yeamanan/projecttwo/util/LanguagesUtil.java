package com.yeamanan.projecttwo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
//import org.apache.log4j.Logger;

/**
 * LanguagesUtil class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public final class LanguagesUtil {

    /**
     * Logger.
     */
//    private static final Logger LOG = Logger.getLogger(LanguagesUtil.class);

    /**
     * Bundles folder in jar.
     */
    private static final String BUNDLES_FOLDER = "bundles/";

    /**
     * Constructor.
     */
    private LanguagesUtil() { }

    /**
     * loadDefaultLanguage() method.
     *
     * @return the resource bundle of the default language
     */
    public static ResourceBundle loadDefaultLanguage() {
        return ResourceBundle.getBundle("bundles.Language");
    }

    /**
     * loadLanguage() method.
     *
     * @param argLanguage the language to load
     * @return the resource bundle of the loaded language
     */
    public static ResourceBundle loadLanguage(final String argLanguage) {
        final Locale locale = new Locale(argLanguage);
        return ResourceBundle.getBundle("bundles.Language", locale);
    }

    /**
     * getAvailableLanguages() method.
     *
     * @param aClass a class to load the languages
     * @return a list of language resource bundles
     */
    public static List<ResourceBundle> loadLanguages(final Class aClass) {
        final List<ResourceBundle> languages = new ArrayList();
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
