package com.yeamanan.projecttwo.view;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * LanguageRegion class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class LanguageRegion extends AbstractRegion {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(LanguageRegion.class);

    /**
     * Constructor.
     *
     * @param bundle the resource bundle to construct the FXML
     */
    public LanguageRegion(final ResourceBundle bundle) {
        super(bundle);
    }

}
