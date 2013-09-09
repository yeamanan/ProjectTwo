package com.yeamanan.projecttwo.view.stage;

import java.util.ResourceBundle;
import javafx.stage.Window;
//import org.apache.log4j.Logger;

/**
 * ModalStage class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class SurvivorEditorStage extends ModalStage {

    /**
     * Log.
     */
//    private static final Logger LOG =
//            Logger.getLogger(SurvivorEditorStage.class);

    /**
     * Size of the box.
     */
    private static final int WIDTH = 600, HEIGHT = 640;

    /**
     * Constructor.
     *
     * @param argWindow the parent owner of the modal stage
     * @param argBundle the resource bundle to load the stage
     */
    public SurvivorEditorStage(final Window argWindow,
            final ResourceBundle argBundle) {
        super(argWindow, WIDTH, HEIGHT, argBundle);
    }

}
