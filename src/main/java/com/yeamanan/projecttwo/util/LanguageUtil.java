package com.yeamanan.projecttwo.util;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * LanguageUtil class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public final class LanguageUtil {

    /**
     * Bundles folder in jar.
     */
    private final static String BUNDLES_FOLDER = "bundles/";

    /**
     * Default language.
     */
    public final static String DEFAULT_LANGUAGE = "English";

    /**
     * Selected language.
     */
    private static String selectedLanguage = DEFAULT_LANGUAGE;

    /**
     * HashMap of languages.
     */
    private final static Map<String, ResourceBundle> languages = new HashMap<>();

    /**
     * Constructor.
     */
    private LanguageUtil() { }

    /**
     * loadLanguages() method.
     *
     * @param aClass a class
     */
    public static void loadLanguages(final Class aClass) {
        final List<String> files =
                JarUtil.getJarFolderFileList(aClass, BUNDLES_FOLDER);
        for (String file : files) {
            final String language = file.substring(17, 19);
            final Locale locale = new Locale(language);
            final ResourceBundle bundle =
                ResourceBundle.getBundle("bundles.Language", locale);
            languages.put(bundle.getString("language"), bundle);
        }
    }

    /**
     * getLanguages() method.
     *
     * @return a list of languages available
     */
    public static Set<String> getLanguages() {
        return languages.keySet();
    }

    /**
     * getLanguageBundle() method.
     *
     * @param language the language
     * @return the bundle of the language
     */
    public static ResourceBundle getLanguageBundle(final String language) {
        return languages.get(language);
    }

//    /**
//     * getDefaultLanguageBundle() method
//     *
//     * @return the default language bundle
//     */
//    public static ResourceBundle getDefaultLanguageBundle() {
//        return languages.get(DEFAULT_LANGUAGE);
//    }

    /**
     * getSelectedLanguage() method.
     *
     * @return the selected language
     */
    public static String getSelectedLanguage() {
        return selectedLanguage;
    }

    /**
     * setSelectedLanguage() method.
     *
     * @param language the new selected language
     */
    public static void setSelectedLanguage(final String language) {
        selectedLanguage = language;
    }

}
