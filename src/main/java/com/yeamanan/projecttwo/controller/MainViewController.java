package com.yeamanan.projecttwo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.apache.log4j.Logger;

/**
 * MainController class.
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
     * handleSubmitButtonAction() method.
     *
     * @param event the event handled
     */
    @FXML
    protected final void handleSubmitButtonAction(final ActionEvent event) {
        LOGGER.info("Salut");
    }

}
