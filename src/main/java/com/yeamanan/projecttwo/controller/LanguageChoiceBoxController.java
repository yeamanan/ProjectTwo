package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.util.LanguagesUtil;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
//import org.apache.log4j.Logger;

/**
 * LanguageChoiceBoxController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class LanguageChoiceBoxController implements Initializable {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(LanguageChoiceBoxController.class);

    /**
     * Map of language and locale translation.
     */
    private transient Map<String, String> locales;

    /**
     * Language choice box.
     */
    @FXML
    private transient ChoiceBox languageBox;

    /**
     * Change listener of the language box.
     */
    private final transient ChangeListener<Number> listener =
        new ChangeListener<Number>() {
            @Override
            public void changed(final ObservableValue observable,
                    final Number value, final Number newValue) {
                final int index = newValue.intValue();
                final String sLanguage =
                        (String) languageBox.getItems().get(index);
                final ProjectTwo instance = ProjectTwo.getInstance();
                final String sLocale = locales.get(sLanguage);
                final ResourceBundle language =
                        LanguagesUtil.loadLanguage(sLocale);
                instance.getContext().setLanguage(language);
                instance.reloadView();
            }
        };

    /**
     * initialize() method.
     *
     * @param argLocation the location which to init
     * @param argBundle the resource bundle which to init
     */
    @Override
    public final void initialize(final URL argLocation,
            final ResourceBundle argBundle) {
        locales = new HashMap();
        final List<ResourceBundle> languages =
                LanguagesUtil.loadLanguages(this.getClass());
        for (ResourceBundle language : languages) {
            final String sLanguage = language.getString("language");
            languageBox.getItems().add(sLanguage);
            locales.put(sLanguage, language.getString("locale"));
        }
        final ProjectTwo instance = ProjectTwo.getInstance();
        final ResourceBundle language = instance.getContext().getLanguage();
        languageBox.setValue(language.getString("language"));
        languageBox.getSelectionModel().selectedIndexProperty()
                .addListener(listener);
    }

}
