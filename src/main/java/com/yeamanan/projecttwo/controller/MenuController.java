package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.model.Mission;
import com.yeamanan.projecttwo.service.MissionService;
import com.yeamanan.projecttwo.service.MissionServiceImpl;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * MenuController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MenuController implements Initializable {

    @FXML private Menu missionsMenu;
    @FXML private Menu languagesMenu;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final MissionService ms = new MissionServiceImpl();
        final List<Mission> missions = ms.loadMissionsAsRessources();
        for (Mission mission : missions) {
            final String tmp = mission.getId() + " - " + mission.getName();
            missionsMenu.getItems().add(new MenuItem(tmp));
        }
    }

    @FXML protected void handleExitAction(ActionEvent event) {
        System.exit(0);
    }

}
