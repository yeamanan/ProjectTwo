package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.model.Mission;
import com.yeamanan.projecttwo.service.MissionService;
import com.yeamanan.projecttwo.service.MissionServiceImpl;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.apache.log4j.Logger;

/**
 * CharacterSelectionViewController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class CharacterSelectionViewController implements Initializable {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(CharacterSelectionViewController.class);

    private static final int START_X = 10, START_Y = 200, X_PADDING = 100,
            Y_PADDING = 35;

    @FXML
    private AnchorPane mainPane;

    /**
     * Click event handler of all mission button.
     */
    private final EventHandler<MouseEvent> clickHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final ImageView view = (ImageView) event.getSource();
                if (view.getStyleClass().contains("selected")) {
                    view.getStyleClass().remove("selected");
                    view.getStyleClass().add("unselected");
                } else {
                    view.getStyleClass().remove("unselected");
                    view.getStyleClass().add("selected");
                }
            }
        };

    private final EventHandler<MouseEvent> enterHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final ImageView view = (ImageView) event.getSource();
                view.setStyle("-fx-image: url(\"images/characters/p_Amy_z.jpg\")");
            }
        };

    private final EventHandler<MouseEvent> exitHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final ImageView view = (ImageView) event.getSource();
                view.setStyle("-fx-image: url(\"images/characters/p_Amy.jpg\")");
            }
        };      

    /**
     * initialize() method.
     *
     * @param location the location which to init
     * @param resources the resource bundle which to init
     */
    @Override
    public final void initialize(final URL location,
                                final ResourceBundle resources) {
        double xPos = START_X, yPos = START_Y;
        final ClassLoader loader = this.getClass().getClassLoader();
        final ImageView portrait = new ImageView();
        portrait.setStyle("-fx-image: url(\"images/characters/p_Amy.jpg\")");
        portrait.getStyleClass().add("survivorPortrait");
        portrait.getStyleClass().add("unselected");
        portrait.setLayoutX(xPos);
        portrait.setLayoutY(yPos);
        portrait.setOnMouseClicked(clickHandler);
        portrait.setOnMouseEntered(enterHandler);
        portrait.setOnMouseExited(exitHandler);
        mainPane.getChildren().add(portrait);
    }

}
