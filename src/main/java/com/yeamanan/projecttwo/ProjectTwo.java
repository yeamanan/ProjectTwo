package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.card.Equipment;
import com.yeamanan.projecttwo.model.card.Invasion;
import com.yeamanan.projecttwo.model.card.Weapon;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.model.mission.Tile;
import com.yeamanan.projecttwo.service.card.EquipmentIOService;
import com.yeamanan.projecttwo.service.card.EquipmentIOServiceImpl;
import com.yeamanan.projecttwo.service.character.SurvivorIOService;
import com.yeamanan.projecttwo.service.character.SurvivorIOServiceImpl;
import com.yeamanan.projecttwo.service.card.InvasionIOService;
import com.yeamanan.projecttwo.service.card.InvasionIOServiceImpl;
import com.yeamanan.projecttwo.service.card.WeaponIOService;
import com.yeamanan.projecttwo.service.card.WeaponIOServiceImpl;
import com.yeamanan.projecttwo.service.mission.MissionIOService;
import com.yeamanan.projecttwo.service.mission.MissionIOServiceImpl;
import com.yeamanan.projecttwo.service.mission.TileIOService;
import com.yeamanan.projecttwo.service.mission.TileIOServiceImpl;
import com.yeamanan.projecttwo.util.PropertiesUtil;
import com.yeamanan.projecttwo.view.ViewFactory;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

/**
 * ProjectTwo class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ProjectTwo extends Application {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(ProjectTwo.class);

    /**
     * Size of the box.
     */
    private static final int SCENE_WIDTH = 1024, SCENE_HEIGHT = 768;

    /**
     * Instance of the main class.
     */
    private static ProjectTwo instance;

    /**
     * Context.
     */
    private transient Context context;

    /**
     * getInstance() method.
     *
     * @return instance of the class
     */
    public static ProjectTwo getInstance() {
        return instance;
    }

    /**
     * getContext() method.
     *
     * @return the context of the application
     */
    public final Context getContext() {
        return this.context;
    }

    /**
     * Stage of the application.
     */
    private transient Stage stage;

    /**
     * start() method.
     *
     * @param primaryStage the stage of the application
     */
    @Override
    public final void start(final Stage primaryStage) {
        instance = this;
        this.context = new Context();
        this.stage = primaryStage;
        this.stage.setTitle(this.context.getLanguage().getString("title"));
        final ViewFactory factory = this.context.getCurrentView().getFactory();
        final Parent root = factory.createView(this.context.getLanguage());
        this.stage.setScene(new Scene(root, SCENE_WIDTH, SCENE_HEIGHT));
        this.stage.setResizable(false);
        final ClassLoader loader = this.getClass().getClassLoader();
        final Image image =
                new Image(loader.getResourceAsStream("images/Dice.png"));
        this.stage.getIcons().add(image);
        this.stage.show();
    }

    /**
     * stop() method.
     */
    @Override
    public final void stop() {
        if (!PropertiesUtil.saveProperties(this.context.getProperties())) {
            LOG.error("Error saving config file");
        }
    }

    /**
     * getStage() method.
     *
     * @return the stage of the application
     */
    public final Stage getStage() {
        return this.stage;
    }

    /**
     * reloadView() method.
     */
    public final void reloadView() {
        final ViewFactory factory = this.context.getCurrentView().getFactory();
        final Parent root = factory.createView(this.context.getLanguage());
        this.stage.setTitle(this.context.getLanguage().getString("title"));
        this.stage.getScene().setRoot(root);
    }

    /**
     * main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        check();
        launch(args);
    }

    /**
     * Check.
     */
    public static void check() {
        final SurvivorIOService sService = new SurvivorIOServiceImpl();
        final List<Survivor> survivors = sService.loadAll();
        LOG.info(survivors.size() + " survivors loaded :");
        for (Survivor survivor : survivors) {
            LOG.info("\t" + survivor);
        }
        final InvasionIOService iService = new InvasionIOServiceImpl();
        final List<Invasion> iCards = iService.loadAll();
        LOG.info(iCards.size() + " zombie cards loaded :");
        for (Invasion iCard : iCards) {
            LOG.info("\t" + iCard.getName());
        }
        final EquipmentIOService eService = new EquipmentIOServiceImpl();
        final List<Equipment> eCards = eService.loadAll();
        LOG.info(eCards.size() + " equipment cards loaded :");
        for (Equipment eCard : eCards) {
            LOG.info("\t" + eCard.getName());
        }
        final WeaponIOService wService = new WeaponIOServiceImpl();
        final List<Weapon> wCards = wService.loadAll();
        LOG.info(wCards.size() + " weapon cards loaded :");
        for (Weapon wCard : wCards) {
            LOG.info("\t" + wCard.getName());
        }
        final MissionIOService mService = new MissionIOServiceImpl();
        final List<Mission> missions = mService.loadAll();
        LOG.info(missions.size() + " missions loaded :");
        for (Mission mission : missions) {
            LOG.info("\t" + mission.getName());
        }
        final TileIOService tService = new TileIOServiceImpl();
        final List<Tile> tiles = tService.loadAll();
        LOG.info(tiles.size() + " tiles loaded :");
        for (Tile tile : tiles) {
            LOG.info("\t" + tile.getName());
        }
    }

}
