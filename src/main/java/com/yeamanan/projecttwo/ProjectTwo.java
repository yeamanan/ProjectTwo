package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.view.ViewFactory;
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
     * Context.
     */
    private Context context;

    /**
     * start() method.
     *
     * @param argStage the stage of the application
     */
    @Override
    public final void start(final Stage argStage) {
        this.instance = this;
        this.stage = argStage;
        this.context = new Context();
        this.context.getCurrentView().getFactory();
        final ViewFactory factory = this.context.getCurrentView().getFactory();
        final Parent root = factory.createView(this.context.getLanguage());
        this.stage.setTitle(this.context.getLanguage().getString("title"));
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
     * getContext() method.
     *
     * @return the context of the application
     */
    public final Context getContext() {
        return this.context;
    }

    /**
     * reloadView() method.
     */
    public final void reloadView() {
        final ViewFactory factory = this.context.getCurrentView().getFactory();
        final Parent root = factory.createView(this.context.getLanguage());
        this.stage.setTitle(this.context.getLanguage().getString("title"));
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
