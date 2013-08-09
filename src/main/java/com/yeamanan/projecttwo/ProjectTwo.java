package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.util.LanguageUtil;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
    private static final int width = 800, height = 600;
    
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
        changeLanguage(LanguageUtil.DEFAULT_LANGUAGE);
        this.stage.show();
    }

    /**
     * changeLanguage() method.
     *
     * @param language the language to set
     */
    public final void changeLanguage(final String language) {
        LanguageUtil.setSelectedLanguage(language);
        final ResourceBundle bundle = LanguageUtil.getLanguageBundle(language);
        this.stage.setTitle(bundle.getString("title"));
        final URL main = getClass().getClassLoader().getResource("main.fxml");
        try {
            final Parent root = FXMLLoader.load(main, bundle);
            if (this.stage.getScene() == null) {
                this.stage.setScene(new Scene(root, width, height));
            } else {
                this.stage.getScene().setRoot(root);
            }
        } catch (IOException e) {
            LOGGER.error("Error loading main.fxml", e);
        }
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
     * main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }

}
