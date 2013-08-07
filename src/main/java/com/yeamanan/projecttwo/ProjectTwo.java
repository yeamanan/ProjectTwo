package com.yeamanan.projecttwo;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
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
     * start() method.
     *
     * @param stage the stage of the application
     */
    @Override
    public final void start(final Stage stage) {
        final Locale locale = Locale.getDefault();
        final ResourceBundle bundle =
                ResourceBundle.getBundle("bundles.Language", locale);
        stage.setTitle(bundle.getString("title"));
        final URL main = getClass().getClassLoader().getResource("main.fxml");
        try {
            final Parent root = FXMLLoader.load(main, bundle);
            final Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
        } catch (IOException e) {
            LOGGER.error("ERROR", e);
        }
        stage.show();
    }

    /**
     * main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }

    /**
     * write() method.
     *
     * @return some text
     */
    public static String write() {
        return "This is a sample project";
    }

}
