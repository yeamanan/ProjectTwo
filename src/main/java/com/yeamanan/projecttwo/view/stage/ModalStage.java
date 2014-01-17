package com.yeamanan.projecttwo.view.stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.apache.log4j.Logger;

/**
 * ModalStage class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
class ModalStage extends Stage {

    /**
     * Log.
     */
    private static final Logger LOG = Logger.getLogger(ModalStage.class);

    /**
     * Resource path.
     */
    private static final String RESOURCE_PATH = "%s.fxml";

    /**
     * Constructor.
     *
     * @param argWindow the parent owner of the modal stage
     * @param argWidth the width of the modal stage
     * @param argHeight the height of the modal stage
     * @param argBundle the resource bundle to load the stage
     */
    ModalStage(final Window argWindow, final int argWidth,
               final int argHeight, final ResourceBundle argBundle) {
        super();
        this.initOwner(argWindow);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setTitle("A Template Window");
        this.setResizable(false);
        Parent root = null;
        try {
            root = FXMLLoader.load(getViewURL(), argBundle);
        } catch (IOException ex) {
           LOG.error("Can't load fxml file", ex);
        }
        this.setScene(new Scene(root, argWidth, argHeight));
    }

    /**
     * getViewPath() method.
     *
     * @return the path of the view
     */
    private String getViewPath() {
        final String className = this.getClass().getSimpleName();
        final String viewName = className.replaceFirst("Stage", "View");
        return String.format(RESOURCE_PATH, viewName);
    }

    /**
     * getViewURL() method.
     *
     * @return the URL of the view
     */
    private URL getViewURL() {
        return this.getClass().getClassLoader().getResource(getViewPath());
    }

}
