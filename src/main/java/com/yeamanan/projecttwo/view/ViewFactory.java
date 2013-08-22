package com.yeamanan.projecttwo.view;

import java.util.ResourceBundle;
import javafx.scene.Parent;

/**
 * ViewFactory interface.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public interface ViewFactory {

    /**
     * createView() method.
     *
     * @param bundle the resource bundle to construct the FXML
     * @return the Parent object created
     */
    Parent createView(final ResourceBundle bundle);

}
