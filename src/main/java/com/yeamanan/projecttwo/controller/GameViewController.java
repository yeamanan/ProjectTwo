package com.yeamanan.projecttwo.controller;

import com.yeamanan.projecttwo.Context;
import com.yeamanan.projecttwo.ProjectTwo;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.model.mission.Zone;
import com.yeamanan.projecttwo.service.mission.MissionDrawerService;
import com.yeamanan.projecttwo.service.mission.MissionDrawerServiceImpl;
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
        final MissionDrawerService service = new MissionDrawerServiceImpl();
//        int y = 0;
//        for (Tile tile : mission.getTiles()) {
//            int x = 0;
//            for (Tile tile : row.getTiles()) {
//                final String tPath = "images/" + tile.getName() + ".jpg";
//                final Pane pane = new Pane();
//                pane.setLayoutX(x);
//                pane.setLayoutY(y);
//                pane.setPrefSize(250.0d, 250.0d);
//                pane.setStyle("-fx-background-image: url(\"" + tPath + "\")");
//                pane.setId(tile.getName());
//                pane.setRotate(tile.getAxe().getAngle());
//                board.getChildren().add(pane);
//                x += 250;
//            }
//            y += 250;
////            if (maxRowSize < row.getTiles().size()) {
////                maxRowSize = row.getTiles().size();
////            }
//        }
        board.getChildren().add(service.draw(mission));
        //board.setPrefColumns(maxRowSize);
        //board.setPrefRows(mission.getTiles().getRows().size());
        /*for (Zone zone : mission.getBoard()) {
            board.getChildren().add(zone.draw());
        }*/
    }

}
