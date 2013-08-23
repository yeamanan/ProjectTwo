package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.util.LanguagesUtil;
import com.yeamanan.projecttwo.view.ViewType;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

/**
 * LanguageSelectionViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class LanguageSelectionViewController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(LanguageSelectionViewController.class);

    /**
     * handleChoiceLanguageAction() method.
     *
     * @param event the event
     */
    @FXML
    protected final void handleChoiceLanguageAction(final MouseEvent event) {
        final ImageView view = (ImageView) event.getSource();
        final String sLanguage = view.getId();
        final ResourceBundle language = LanguagesUtil.loadLanguage(sLanguage);
        final ProjectTwo instance = ProjectTwo.getInstance();
        instance.getContext().setLanguage(language);
        instance.getContext().setCurrentView(ViewType.MainView);
        instance.reloadView();
    }

}
