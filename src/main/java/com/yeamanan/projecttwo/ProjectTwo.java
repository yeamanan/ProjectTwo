package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.util.LanguageUtil;
import com.yeamanan.projecttwo.view.LanguageViewFactory;
import com.yeamanan.projecttwo.view.ViewFactoryImpl;
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
     * Stage of the application.
     */
    private Stage stage;

    /**
     * start() method.
     *
     * @param argStage the stage of the application
     */
    @Override
    public final void start(final Stage argStage) {
        this.instance = this;
        this.stage = argStage;
        LanguageUtil.loadLanguages(this.getClass());
        final ResourceBundle bundle = LanguageUtil.getSelectedLanguageBundle();
        final Parent root = LanguageViewFactory.getInstance().create(bundle);
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
     * setLanguage() method.
     *
     * @param language the language to set
     */
    public final void setLanguage(final String language) {
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
        final Parent root = ViewFactoryImpl.getInstance().create(bundle);
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
