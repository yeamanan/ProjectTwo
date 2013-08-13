package com.yeamanan.projecttwo.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.apache.log4j.Logger;

/**
 * ViewFactoryImpl class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class ViewFactoryImpl {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(ViewFactoryImpl.class);

    /**
     * Instance.
     */
    protected static ViewFactoryImpl instance;

    /**
     * Resource path.
     */
    private static final String RESOURCE_PATH = "%s.fxml";

    /**
     * getInstance() method.
     *
     * @return instance of the FXMLFactoryImpl
     */
    public static ViewFactoryImpl getInstance() {
        if (instance == null) {
            instance = new ViewFactoryImpl();
        }
        return instance;
    }

    /**
     * create() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return 
     */
    public Parent create(final ResourceBundle bundle) {
         return loadFXML(bundle);
    }

    /**
     * loadFXML() method.
     *
     * @param bundle the resource bundle to construct the FXML
     */
    protected Parent loadFXML(final ResourceBundle bundle) {
        final FXMLLoader loader = new FXMLLoader();
        //loader.setController(this);
        loader.setLocation(getViewURL());
        loader.setResources(bundle);
        Parent root = null;
        try {
            root = (Parent) loader.load();
            //region.getChildren().add(root);
        } catch (IOException ex) {
            LOGGER.error(null, ex);
        }
        return root;
    }

    /**
     * getViewPath() method.
     *
     * @return the path of the view
     */
    private String getViewPath() {
        final String className = this.getClass().getSimpleName();
        final String viewName = className.replaceFirst("Factory", "");
        return String.format(RESOURCE_PATH, viewName);
    }

    /**
     * getViewURL() method.
     *
     * @return the URL of the view
     */
    private URL getViewURL() {
        return this.getClass().getClassLoader().getResource(getViewPath());
    }

}
