package com.yeamanan.projecttwo.view;

import java.util.ResourceBundle;
import javafx.scene.Parent;

/**
 * ViewFactory interface.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public interface ViewFactory {

    /**
     * create() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return the Parent object created
     */
    Parent create(final ResourceBundle bundle);

}
