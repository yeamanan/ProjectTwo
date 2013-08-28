package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.service.SurvivorService;
import com.yeamanan.projecttwo.service.SurvivorServiceImpl;
import com.yeamanan.projecttwo.view.ViewType;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
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
     * Survivors Tile Pane.
     */
    @FXML
    private transient TilePane survivors;

    /**
     * Description Tile Pane.
     */
//    @FXML
//    private Pane description;

    /**
     * Click event handler of all character image.
     */
    private final transient EventHandler<MouseEvent> clickHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final ProjectTwo instance = ProjectTwo.getInstance();
                final Pane pane = (Pane) event.getSource();
                if (pane.getStyleClass().contains("selected")) {
                    final SurvivorService service = new SurvivorServiceImpl();
                    pane.getStyleClass().remove("selected");
                    instance.getContext().getGame().getSurvivors()
                            .remove(service.load(pane.getId()));
                } else {
                    final int nbSurvivors =
                        instance.getContext().getGame().getSurvivors().size();
                    if (nbSurvivors < 6) {
                        final SurvivorService service =
                                new SurvivorServiceImpl();
                        pane.getStyleClass().add("selected");
                        instance.getContext().getGame().getSurvivors()
                                .add(service.load(pane.getId()));
                    }
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
                final Pane pane = (Pane) event.getSource();
                final String sName = pane.getId();
                final String sPath = "images/" + sName + "_pz.jpg";
                pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            }
        };

    /**
     * Exit event handler of all character image.
     */
    private final EventHandler<MouseEvent> exitHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent event) {
                final Pane pane = (Pane) event.getSource();
                final String sName = pane.getId();
                final String sPath = "images/" + sName + "_p.jpg";
                pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
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
        final List<String> sNames = service.getFileNames();
        for (String sName : sNames) {
            final Pane pane = new Pane();
            pane.setId(sName);
            pane.setPrefSize(90, 90);
            final String sPath = "images/" + sName + "_p.jpg";
            pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            pane.getStyleClass().add("survivorPortrait");
            pane.setOnMouseClicked(clickHandler);
            //pane.setOnMouseEntered(enterHandler);
            //pane.setOnMouseExited(exitHandler);
            survivors.getChildren().add(pane);
        }
//        final String sPath = "images/" + sNames.get(0) + "_f.jpg";
//        description.setStyle("-fx-background-image: url(\"" + sPath + "\")");
//        description.getStyleClass().add("survivorDescription");
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
