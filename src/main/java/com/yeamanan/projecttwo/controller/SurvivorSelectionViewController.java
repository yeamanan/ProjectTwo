package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.mission.Zone;
import com.yeamanan.projecttwo.model.token.Start;
import com.yeamanan.projecttwo.service.loader.SurvivorLoader;
import com.yeamanan.projecttwo.service.loader.SurvivorLoaderImpl;
import com.yeamanan.projecttwo.view.ViewType;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
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
//    private static final Logger LOG =
//            Logger.getLogger(SurvivorSelectionViewController.class);

    /**
     * Survivors Tile Pane.
     */
    @FXML
    private transient ScrollPane survivorsScrollPane;

    /**
     * Survivors Tile Pane.
     */
    @FXML
    private transient TilePane survivorsTilePane;

    /**
     * Description Tile Pane.
     */
    @FXML
    private transient Pane survivorDescription;

    /**
     * List of selected survivors.
     */
    private transient List<Survivor> selectedSurvivors;

    /**
     * Click event handler of all character image.
     */
    private final transient EventHandler<MouseEvent> clickHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent argEvent) {
                final Pane pane = (Pane) argEvent.getSource();
                if (pane.getStyleClass().contains("selected")) {
                    final SurvivorLoader service = new SurvivorLoaderImpl();
                    pane.getStyleClass().remove("selected");
                    selectedSurvivors.remove(service.load(pane.getId()));
                } else {
                    final SurvivorLoader service =
                            new SurvivorLoaderImpl();
                    pane.getStyleClass().add("selected");
                    final Survivor survivor = service.load(pane.getId());
                    selectedSurvivors.add(survivor);
                }
            }
        };

    /**
     * Enter event handler of all character image.
     */
    private final transient EventHandler<MouseEvent> enterHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent argEvent) {
                final Pane pane = (Pane) argEvent.getSource();
                final String sName = pane.getId();
                String sPath = "images/" + sName + "_pz.jpg";
                pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
                sPath = "images/" + sName + "_sic.jpg";
                survivorDescription.setStyle("-fx-background-image: url(\"" + sPath + "\")");
                survivorDescription.setUserData(sName);
                survivorDescription.setOnMouseEntered(descriptionEnterHandler);
                survivorDescription.setOnMouseExited(descriptionExitHandler);
            }
        };

    /**
     * Exit event handler of all character image.
     */
    private final transient EventHandler<MouseEvent> exitHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent argEvent) {
                final Pane pane = (Pane) argEvent.getSource();
                final String sName = pane.getId();
                final String sPath = "images/" + sName + "_p.jpg";
                pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            }
        };

    /**
     * Click event handler of the description image.
     */
    private final transient EventHandler<MouseEvent> descriptionEnterHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent argEvent) {
                final String sName = (String) survivorDescription.getUserData();
                final String sPath = "images/" + sName + "_sicz.jpg";
                survivorDescription.setStyle("-fx-background-image: url(\"" + sPath + "\")");
                
            }
        };

    /**
     * Click event handler of the description image.
     */
    private final transient EventHandler<MouseEvent> descriptionExitHandler =
        new EventHandler<MouseEvent>() {
            @Override
            public final void handle(final MouseEvent argEvent) {
                final String sName = (String) survivorDescription.getUserData();
                final String sPath = "images/" + sName + "_sic.jpg";
                survivorDescription.setStyle("-fx-background-image: url(\"" + sPath + "\")");
                
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
        this.selectedSurvivors = new ArrayList<>();
        final SurvivorLoader service = new SurvivorLoaderImpl();
        final List<String> sNames = service.getFileNames();
        for (String sName : sNames) {
            final Pane pane = new Pane();
            pane.setId(sName);
            pane.setPrefSize(90, 90);
            final String sPath = "images/" + sName + "_p.jpg";
            pane.setStyle("-fx-background-image: url(\"" + sPath + "\")");
            pane.getStyleClass().add("survivorPortrait");
            pane.setOnMouseClicked(clickHandler);
            pane.setOnMouseEntered(enterHandler);
            pane.setOnMouseExited(exitHandler);
            survivorsTilePane.getChildren().add(pane);
        }
//        final ProjectTwo instance = ProjectTwo.getInstance();
//        final List<Zone> zones =
//                instance.getContext().getMission().getZones();
//        for (Zone zone : zones) {
//            for (Element element : zone.getElements()) {
//                if (element.getClass().equals(Start.class)) {
//                    this.startZone = zone;
//                }
//            }
//        }
    }

    /**
     * handlePreviousAction() method.
     *
     * @param argEvent the event handled
     */
    @FXML
    protected final void handlePreviousAction(final MouseEvent argEvent) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.getContext().setCurrentView(ViewType.MissionSelectionView);
        instance.reloadView();
    }

    /**
     * handleNextAction() method.
     *
     * @param argEvent the event handled
     */
    @FXML
    protected final void handleNextAction(final MouseEvent argEvent) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.getContext().setCurrentView(ViewType.GameView);
        instance.reloadView();
    }

}
