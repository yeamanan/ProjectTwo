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
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ViewFactoryImpl implements ViewFactory {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(ViewFactoryImpl.class);

    /**
     * Resource path.
     */
    private static final String RESOURCE_PATH = "%s.fxml";

    /**
     * createView() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return the Parent object created
     */
    public final Parent createView(final ResourceBundle bundle) {
         return loadFXML(bundle);
    }

    /**
     * loadFXML() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return the Parent object created
     */
    private Parent loadFXML(final ResourceBundle bundle) {
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getViewURL());
        loader.setResources(bundle);
        Parent root = null;
        try {
            root = (Parent) loader.load();
        } catch (IOException ex) {
            LOG.error("Error loadind fxml file", ex);
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
