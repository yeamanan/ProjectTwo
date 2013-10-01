package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.Context;
import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.service.loader.MissionLoader;
import com.yeamanan.projecttwo.service.loader.MissionLoaderImpl;
import com.yeamanan.projecttwo.view.ViewType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
//import org.apache.log4j.Logger;

/**
 * MissionSelectionViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class MissionSelectionViewController implements Initializable {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(MissionSelectionViewController.class);

    /**
     * Graphic constants.
     */
    private static final int START_X = 10, START_Y = 200, X_PADDING = 100,
            Y_PADDING = 35;

    /**
     * Main Anchor Pane.
     */
    @FXML
    private transient AnchorPane mainPane;

    /**
     * Event handler of all mission button.
     */
    private final transient EventHandler<ActionEvent> handler =
        new EventHandler<ActionEvent>() {
            @Override
            public final void handle(final ActionEvent argEvent) {
                final Button button = (Button) argEvent.getSource();
                final String missionName = button.getText();
                final MissionLoader service = new MissionLoaderImpl();
                final Mission mission =
                        service.load(missionName);
                final ProjectTwo instance = ProjectTwo.getInstance();
                final Context context = instance.getContext();
                context.setMission(mission);
                context.setCurrentView(ViewType.SurvivorSelectionView);
                instance.reloadView();
            }
        };

    /**
     * initialize() method.
     *
     * @param argLocation the location which to init
     * @param argBundle the resource bundle which to init
     */
    @Override
    public final void initialize(final URL argLocation,
                                final ResourceBundle argBundle) {
        double xPos = START_X, yPos = START_Y;
        final MissionLoader service = new MissionLoaderImpl();
        for (String name : service.getFileNames()) {
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
