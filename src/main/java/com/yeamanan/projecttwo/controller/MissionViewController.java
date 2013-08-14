package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.view.ViewType;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import org.apache.log4j.Logger;

/**
 * MainController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MissionViewController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(MissionViewController.class);

    /**
     * handleStartAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleStartAction(final MouseEvent event) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.setCurrentView(ViewType.MissionView);
        instance.reloadView();
    }

    /**
     * handleOptionsAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleOptionsAction(final MouseEvent event) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        //instance.setCurrentView(ViewType.OptionsView);
        instance.reloadView();
    }

}
