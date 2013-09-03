package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.view.ViewType;
import com.yeamanan.projecttwo.view.stage.SurvivorEditorStage;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;
import org.apache.log4j.Logger;

/**
 * MainViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
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
        instance.getContext().setCurrentView(ViewType.MissionSelectionView);
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

    /**
     * handleSurvivorEditorAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleSurvivorEditorAction(final MouseEvent argEvent) {
        final Button button = (Button) argEvent.getSource();
        final Window window = button.getScene().getWindow();
        final ProjectTwo instance = ProjectTwo.getInstance();
        final ResourceBundle bundle = instance.getContext().getLanguage();
        final SurvivorEditorStage stage =
                new SurvivorEditorStage(window, bundle);
    }

}
