package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.Context;
import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.service.drawer.Drawer;
import com.yeamanan.projecttwo.service.drawer.MissionDrawerImpl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
//import org.apache.log4j.Logger;

/**
 * GameViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class GameViewController  implements Initializable {

    /**
     * Logger.
     */
//    private static final Logger LOG =
//            Logger.getLogger(GameViewController.class);

    /**
     * Board Tile Pane.
     */
    @FXML
    private transient AnchorPane board;

    /**
     * initialize() method.
     *
     * @param argLocation the location which to init
     * @param argBundle the resource bundle which to init
     */
    @Override
    public final void initialize(final URL argLocation,
                                final ResourceBundle argBundle) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        final Context context = instance.getContext();
        final Mission mission = context.getMission();
        final Drawer service = new MissionDrawerImpl();
        board.getChildren().add(service.draw(mission, board));
    }

}
