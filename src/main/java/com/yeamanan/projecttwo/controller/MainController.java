package com.yeamanan.projecttwo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * MainController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MainController {

    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }

}
