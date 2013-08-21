package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.view.ViewType;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import org.apache.log4j.Logger;

/**
 * MainViewController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MainViewController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(MainViewController.class);

    /**
     * handleStartAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleStartAction(final MouseEvent event) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.setCurrentView(ViewType.MissionSelectionView);
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
