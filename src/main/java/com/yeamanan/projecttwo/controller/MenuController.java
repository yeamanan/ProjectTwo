package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.Mission;
import com.yeamanan.projecttwo.service.MissionService;
import com.yeamanan.projecttwo.service.MissionServiceImpl;
import com.yeamanan.projecttwo.util.LanguageUtil;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import org.apache.log4j.Logger;

/**
 * MenuController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class MenuController implements Initializable {

    /**
     * Logger.
     */
//    private static final Logger LOGGER = Logger.getLogger(MenuController.class);

    /**
     * Menu of missions.
     */
    @FXML
    private Menu missionsMenu;

    /**
     * Menu of languages.
     */
    @FXML
    private Menu languagesMenu;

    /**
     * Event handler for the language menu.
     */
    private final EventHandler<ActionEvent> languageHandler =
            new EventHandler<ActionEvent>() {
                @Override public void handle(final ActionEvent evt) {
                    changeLanguage((CheckMenuItem) evt.getSource());
                }
            };

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
        for (String language : LanguageUtil.getLanguages()) {
            final CheckMenuItem item = new CheckMenuItem(language);
            if (language.matches(LanguageUtil.getSelectedLanguage())) {
                item.setSelected(true);
            }
            item.setOnAction(languageHandler);
            languagesMenu.getItems().add(item);
        }
    }

    /**
     * changeLanguage() method.
     *
     * @param cmi the check menu item clicked
     */
    public final void changeLanguage(final CheckMenuItem cmi) {
        final String language = cmi.getText();
        for (MenuItem item : cmi.getParentMenu().getItems()) {
            final CheckMenuItem cmi2 = (CheckMenuItem) item;
            if (!cmi.equals(cmi2)) {
                cmi2.setSelected(false);
            }
        }
        ProjectTwo.getInstance().changeLanguage(language);
    }

    /**
     * handleExitAction() method.
     *
     * @param event the event
     */
    @FXML
    protected final void handleExitAction(final ActionEvent event) {
        System.exit(0);
    }

}
