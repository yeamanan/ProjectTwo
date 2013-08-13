package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.util.LanguageUtil;
import com.yeamanan.projecttwo.view.MainViewFactory;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

/**
 * MenuController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class LanguageViewController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(LanguageViewController.class);

    /**
     * handleChoiceLanguageAction() method.
     *
     * @param event the event
     */
    @FXML
    protected final void handleChoiceLanguageAction(final MouseEvent event) {
        final ImageView view = (ImageView) event.getSource();
        final String language = view.getId();
        ProjectTwo instance = ProjectTwo.getInstance();
        instance.setLanguage(language);
        MainViewFactory.setInstance();
        instance.reloadView();
    }

}
