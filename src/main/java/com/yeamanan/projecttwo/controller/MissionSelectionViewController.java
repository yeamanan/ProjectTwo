package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.game.Mission;
import com.yeamanan.projecttwo.service.MissionService;
import com.yeamanan.projecttwo.service.MissionServiceImpl;
import com.yeamanan.projecttwo.view.ViewType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.apache.log4j.Logger;

/**
 * MissionSelectionViewController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MissionSelectionViewController implements Initializable {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(MissionSelectionViewController.class);

    /**
     * Graphic constants.
     */
    private static final int START_X = 10, START_Y = 200, X_PADDING = 100,
            Y_PADDING = 35;

    /**
     * Main Anchor Pane.
     */
    @FXML
    private AnchorPane mainPane;

    /**
     * Event handler of all mission button.
     */
    private final EventHandler<ActionEvent> handler =
        new EventHandler<ActionEvent>() {
            @Override
            public final void handle(final ActionEvent event) {
                final Button button = (Button) event.getSource();
                final String missionName = button.getText();
                final MissionService service = new MissionServiceImpl();
                final Mission mission =
                        service.loadMissionFromResource(missionName);
                final ProjectTwo instance = ProjectTwo.getInstance();
                instance.getContext().getGame().setMission(mission);
                instance.getContext()
                        .setCurrentView(ViewType.SurvivorSelectionView);
                instance.reloadView();
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
        final MissionService service = new MissionServiceImpl();
        for (String name : service.getMissionNames()) {
            final Button button = new Button(name);
            button.setLayoutX(xPos);
            button.setLayoutY(yPos);
            button.setOnAction(handler);
            mainPane.getChildren().add(button);
            yPos += Y_PADDING;
            if (yPos > mainPane.getPrefHeight()) {
                xPos += X_PADDING;
                yPos = START_Y;
            }
        }
    }

}
