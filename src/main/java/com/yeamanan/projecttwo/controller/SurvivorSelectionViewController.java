package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.people.Survivor;
import com.yeamanan.projecttwo.service.SurvivorService;
import com.yeamanan.projecttwo.service.SurvivorServiceImpl;
import com.yeamanan.projecttwo.view.ViewType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import org.apache.log4j.Logger;

/**
 * CharacterSelectionViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorSelectionViewController implements Initializable {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(SurvivorSelectionViewController.class);

    /**
     * Main Anchor Pane.
     */
    @FXML
    private TilePane survivorPane;

    /**
     * Click event handler of all character image.
     */
    private final EventHandler<MouseEvent> clickHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final Region view = (Region) event.getSource();
                final SurvivorService service = new SurvivorServiceImpl();
                final Survivor survivor = service.loadSurvivor(view.getId());
                final ProjectTwo instance = ProjectTwo.getInstance();
                if (view.getStyleClass().contains("selected")) {
                    view.getStyleClass().remove("selected");
                    view.getStyleClass().add("unselected");
                    instance.getContext().getGame().getSurvivors()
                            .remove(survivor);
                } else {
                    view.getStyleClass().remove("unselected");
                    view.getStyleClass().add("selected");
                    instance.getContext().getGame().getSurvivors()
                            .add(survivor);
                }
            }
        };

    /**
     * Enter event handler of all character image.
     */
    private final EventHandler<MouseEvent> enterHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final Region view = (Region) event.getSource();
                final String sName = view.getId();
                final String sPath = "images/survivors/p_" + sName + "_z.jpg";
                view.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            }
        };

    /**
     * Exit event handler of all character image.
     */
    private final EventHandler<MouseEvent> exitHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final Region view = (Region) event.getSource();
                final String sName = view.getId();
                final String sPath = "images/survivors/p_" + sName + ".jpg";
                view.setStyle("-fx-background-image: url(\"" + sPath + "\")");
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
        final SurvivorService service = new SurvivorServiceImpl();
        for (String sName : service.getSurvivorNames()) {
            final Region portrait = new Region();
            portrait.setId(sName);
            portrait.setPrefSize(90, 90);
            final String sPath = "images/survivors/p_" + sName + ".jpg";
            portrait.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            portrait.getStyleClass().add("survivorPortrait");
            portrait.getStyleClass().add("unselected");
            portrait.setOnMouseClicked(clickHandler);
            portrait.setOnMouseEntered(enterHandler);
            portrait.setOnMouseExited(exitHandler);
            survivorPane.getChildren().add(portrait);
        }
    }

    /**
     * handleGoAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleGoAction(final MouseEvent event) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.getContext().setCurrentView(ViewType.GameView);
        instance.reloadView();
    }

}
