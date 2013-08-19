package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.util.LanguageUtil;
import com.yeamanan.projecttwo.util.PropertyUtil;
import com.yeamanan.projecttwo.view.ViewType;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

/**
 * ProjectTwo class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class ProjectTwo extends Application {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ProjectTwo.class);

    /**
     * Size of the box.
     */
    private static final int WIDTH = 800, HEIGHT = 600;

    /**
     * Instance of the main class.
     */
    private static ProjectTwo instance;

    /**
     * Properties.
     */
    private PropertyUtil properties;

    /**
     * Stage of the application.
     */
    private Stage stage;

    /**
     * Current view.
     */
    private ViewType currentView;

    /**
     * start() method.
     *
     * @param argStage the stage of the application
     */
    @Override
    public final void start(final Stage argStage) {
        this.instance = this;
        this.stage = argStage;
        properties = new PropertyUtil();
        final String language = properties.getProperty("language");
        if(language == null || language.isEmpty()) {
            this.currentView = ViewType.LanguageView;
        } else {
            this.currentView = ViewType.MainView;
            LanguageUtil.setSelectedLanguage(language);
        }
        LanguageUtil.loadLanguages(this.getClass());
        final ResourceBundle bundle = LanguageUtil.getSelectedLanguageBundle();
        final Parent root = this.currentView.getFactory().createView(bundle);
        this.stage.setTitle(bundle.getString("title"));
        this.stage.setScene(new Scene(root, WIDTH, HEIGHT));
        this.stage.show();
    }

    /**
     * getInstance() method.
     *
     * @return instance of the class
     */
    public static ProjectTwo getInstance() {
        return instance;
    }

    /**
     * getStage() method.
     *
     * @return the stage of the application
     */
    public final Stage getStage() {
        return this.stage;
    }

    /**
     * getCurrentView() method.
     *
     * @return the current view type
     */
    public final ViewType getCurrentView() {
        return this.currentView;
    }

    /**
     * setCurrentView() method.
     *
     * @param argView the view type to set
     */
    public final void setCurrentView(final ViewType argView) {
        this.currentView = argView;
    }

    /**
     * setLanguage() method.
     *
     * @param language the language to set
     */
    public final void setLanguage(final String language) {
        properties.setProperty("language", language);
        LanguageUtil.setSelectedLanguage(language);
        final ResourceBundle bundle = LanguageUtil.getSelectedLanguageBundle();
        this.stage.setTitle(bundle.getString("title"));
        this.reloadView();
    }

    /**
     * reloadView() method.
     */
    public final void reloadView() {
        final ResourceBundle bundle = LanguageUtil.getSelectedLanguageBundle();
        final Parent root = this.currentView.getFactory().createView(bundle);
        this.stage.getScene().setRoot(root);
    }

    /**
     * main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }

}
