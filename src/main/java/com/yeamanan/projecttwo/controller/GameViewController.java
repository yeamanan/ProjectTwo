package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.Context;
import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.stuff.Mission;
import com.yeamanan.projecttwo.model.stuff.Tile;
import com.yeamanan.projecttwo.model.stuff.TileRow;
import com.yeamanan.projecttwo.service.people.SurvivorService;
import com.yeamanan.projecttwo.service.people.SurvivorServiceImpl;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import org.apache.log4j.Logger;

/**
 * GameViewController class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class GameViewController  implements Initializable {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(GameViewController.class);

    /**
     * Board Tile Pane.
     */
    @FXML
    private transient TilePane board;

    /**
     * initialize() method.
     *
     * @param location the location which to init
     * @param resources the resource bundle which to init
     */
    @Override
    public final void initialize(final URL location,
                                final ResourceBundle resources) {
        final ProjectTwo instance = ProjectTwo.getInstance();
        final Context context = instance.getContext();
        final Mission mission = context.getGame().getMission();
        for (TileRow row : mission.getTiles().getRows()) {
            for (Tile tile : row.getTiles()) {
                final String tPath = "images/" + tile.getName() + ".jpg";
                final Pane pane = new Pane();
                pane.setPrefSize(250, 250);
                pane.setStyle("-fx-background-image: url(\"" + tPath + "\")");
                pane.setId(tile.getName());
                switch (tile.getAxe()) {
                    case EAST :
                        pane.setRotate(90.0);
                    case SOUTH :
                        pane.setRotate(180.0);
                    case WEST :
                        pane.setRotate(270.0);
                }
                board.getChildren().add(pane);
            }
        }
    }
}
