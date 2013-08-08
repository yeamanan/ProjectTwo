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

    /**
     * TODO.
     */
    @FXML
    private Menu missionsMenu;

//    /**
//     * TODO.
//     */
//    @FXML
//    private Menu languagesMenu;

    /**
     * TODO.
     *
     * @param url TODO
     * @param bundle TODO
     */
    @Override
    public final void initialize(final URL url, final ResourceBundle bundle) {
        final MissionService service = new MissionServiceImpl();
        final List<Mission> missions = service.loadMissions();
        for (Mission mission : missions) {
            final String tmp = mission.getId() + " - " + mission.getName();
            missionsMenu.getItems().add(new MenuItem(tmp));
        }
    }

    /**
     * TODO.
     *
     * @param event TODO
     */
    @FXML
    protected final void handleExitAction(final ActionEvent event) {
        System.exit(0);
    }

}
