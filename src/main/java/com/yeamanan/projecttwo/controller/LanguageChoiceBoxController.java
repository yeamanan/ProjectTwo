package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.util.LanguageUtil;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import org.apache.log4j.Logger;

/**
 * LanguageChoiceBoxController class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class LanguageChoiceBoxController implements Initializable {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(LanguageChoiceBoxController.class);

    /**
     * Language choice box.
     */
    @FXML
    private ChoiceBox languageBox;

    /**
     * Change listener of the language box.
     */
    private final ChangeListener<Number> listener =
        new ChangeListener<Number>() {
            @Override
            public void changed(final ObservableValue val, final Number value,
                                final Number newValue) {
                final int index = newValue.intValue();
                final String language =
                        (String) languageBox.getItems().get(index);
                final ProjectTwo instance = ProjectTwo.getInstance();
                instance.setLanguage(language);
                instance.reloadView();
            }
        };

    /**
     * initialize() method.
     *
     * @param location the location which to init
     * @param resources the resource bundle which to init
     */
    @Override
    public final void initialize(final URL location,
                                final ResourceBundle resources) {
        for (String language : LanguageUtil.getLanguages()) {
            languageBox.getItems().add(language);
        }
        languageBox.setValue(LanguageUtil.getSelectedLanguage());
        languageBox.getSelectionModel().selectedIndexProperty()
                .addListener(listener);
    }

}
