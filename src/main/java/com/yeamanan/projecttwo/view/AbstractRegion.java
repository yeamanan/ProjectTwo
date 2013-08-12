package com.yeamanan.projecttwo.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import org.apache.log4j.Logger;

/**
 * AbstractRegion abstract class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public abstract class AbstractRegion extends Region {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(AbstractRegion.class);

    /**
     * Resource path.
     */
    private static final  String resourcePath = "%s.fxml";

    /**
     * Constructor.
     *
     * @param bundle the resource bundle to construct the FXML
     */
    public AbstractRegion(final ResourceBundle bundle) {
        super();
        this.loadFXML(bundle);
    }

    /**
     * loadFXML() method.
     *
     * @param bundle the resource bundle to construct the FXML
     */
    private void loadFXML(final ResourceBundle bundle) {
        final FXMLLoader loader = new FXMLLoader();
        //loader.setController(this);
        loader.setLocation(this.getViewURL());
        loader.setResources(bundle);
        try {
            final Node root = (Node) loader.load();
            this.getChildren().add(root);
        } catch (IOException ex) {
            LOGGER.error(null, ex);
        }
    }

    /**
     * getViewPath() method.
     *
     * @return the path of the view
     */
    private String getViewPath() {
        return String.format(resourcePath, this.getClass().getSimpleName());
    }

    /**
     * getViewURL() method.
     *
     * @return the URL of the view
     */
    private URL getViewURL() {
        return this.getClass().getClassLoader().getResource(this.getViewPath());
    }

}
