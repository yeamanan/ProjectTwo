package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.model.Game;
import com.yeamanan.projecttwo.util.LanguagesUtil;
import com.yeamanan.projecttwo.util.PropertiesUtil;
import com.yeamanan.projecttwo.view.ViewType;
import java.util.Properties;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * Context class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Context {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(Context.class);

    /**
     * Properties.
     */
    private final transient Properties properties;

    /**
     * Language.
     */
    private ResourceBundle language;

    /**
     * Current view.
     */
    private ViewType currentView;

    /**
     * Game of the application.
     */
    private final transient Game game;

    /**
     * Constructor.
     */
    public Context() {
        this.properties = PropertiesUtil.loadProperties();
        final String sLanguage = this.properties.getProperty("language");
        if (sLanguage == null || sLanguage.isEmpty()) {
            this.language = LanguagesUtil.loadDefaultLanguage();
            this.currentView = ViewType.LanguageSelectionView;
        } else {
            this.language = LanguagesUtil.loadLanguage(sLanguage);
            this.currentView = ViewType.MainView;
        }
        this.game = new Game();
    }

    /**
     * getProperties() method.
     *
     * @return the properties of the application
     */
    public final Properties getProperties() {
        return this.properties;
    }

    /**
     * getLanguage() method.
     *
     * @return the current language of the application
     */
    public final ResourceBundle getLanguage() {
        return this.language;
    }

    /**
     * setLanguage() method.
     *
     * @param argLanguage the new language of the application
     */
    public final void setLanguage(final ResourceBundle argLanguage) {
        this.language = argLanguage;
        this.properties.setProperty("language",
                this.language.getString("locale"));
    }

    /**
     * getCurrentView() method.
     *
     * @return the current view of the application
     */
    public final ViewType getCurrentView() {
        return this.currentView;
    }

    /**
     * setCurrentView() method.
     *
     * @param argCurrentView the new current view
     */
    public final void setCurrentView(final ViewType argCurrentView) {
        this.currentView = argCurrentView;
    }

    /**
     * getGame() method.
     *
     * @return the game of the application
     */
    public final Game getGame() {
        return this.game;
    }

    /**
     * setGame() method.
     *
     * @param argGame the new game of the application
     */
//    public final void setGame(final Game argGame) {
//        this.game = argGame;
//    }

}
