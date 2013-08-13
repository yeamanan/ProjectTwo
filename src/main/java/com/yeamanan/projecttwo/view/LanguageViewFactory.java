package com.yeamanan.projecttwo.view;

import static com.yeamanan.projecttwo.view.ViewFactoryImpl.instance;
import java.util.ResourceBundle;
import javafx.scene.Parent;
import org.apache.log4j.Logger;

/**
 * LanguageViewFactory class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class LanguageViewFactory extends ViewFactoryImpl {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(LanguageViewFactory.class);

    /**
     * getInstance() method.
     *
     * @return instance of the FXMLFactoryImpl
     */
    public static ViewFactoryImpl getInstance() {
        if (instance == null) {
            instance = new LanguageViewFactory();
        }
        return instance;
    }

    /**
     * setInstance() method.
     */
    public static void setInstance() {
        if (!instance.getClass().equals(LanguageViewFactory.getInstance())) {
            instance = new LanguageViewFactory();
        }
    }

    /**
     * create() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return the Parent object created
     */
    @Override
    public final Parent create(final ResourceBundle bundle) {
        return loadFXML(bundle);
    }

}
