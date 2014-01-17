package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.model.Box;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.card.Equipment;
import com.yeamanan.projecttwo.model.card.Spawn;
import com.yeamanan.projecttwo.model.card.Weapon;
import com.yeamanan.projecttwo.model.mission.Mission;
import com.yeamanan.projecttwo.service.loader.BoxLoader;
import com.yeamanan.projecttwo.service.loader.BoxLoaderImpl;
import com.yeamanan.projecttwo.service.loader.EquipmentLoader;
import com.yeamanan.projecttwo.service.loader.EquipmentLoaderImpl;
import com.yeamanan.projecttwo.service.loader.SurvivorLoader;
import com.yeamanan.projecttwo.service.loader.SurvivorLoaderImpl;
import com.yeamanan.projecttwo.service.loader.SpawnLoader;
import com.yeamanan.projecttwo.service.loader.SpawnLoaderImpl;
import com.yeamanan.projecttwo.service.loader.WeaponLoader;
import com.yeamanan.projecttwo.service.loader.WeaponLoaderImpl;
import com.yeamanan.projecttwo.service.loader.MissionLoader;
import com.yeamanan.projecttwo.service.loader.MissionLoaderImpl;
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
        if (PropertiesUtil.saveProperties(this.context.getProperties())) {
            LOG.info("Config file saved");
        } else {
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
    private static void check() {
        final SurvivorLoader sService = new SurvivorLoaderImpl();
        final List<Survivor> survivors = sService.loadAll();
        LOG.info(survivors.size() + " survivors loaded :");
        for (Survivor survivor : survivors) {
            LOG.info("\t" + survivor);
        }
        final SpawnLoader spService = new SpawnLoaderImpl();
        final List<Spawn> sCards = spService.loadAll();
        LOG.info(sCards.size() + " zombie cards loaded :");
        for (Spawn sCard : sCards) {
            LOG.info("\t" + sCard.getName() +
                    " " + sCard.getBlueLevel().size() +
                    " " + sCard.getYellowLevel().size() +
                    " " + sCard.getOrangeLevel().size() +
                    " " + sCard.getRedLevel().size());
        }
        final EquipmentLoader eService = new EquipmentLoaderImpl();
        final List<Equipment> eCards = eService.loadAll();
        LOG.info(eCards.size() + " equipment cards loaded :");
        for (Equipment eCard : eCards) {
            LOG.info("\t" + eCard.getName());
        }
        final WeaponLoader wService = new WeaponLoaderImpl();
        final List<Weapon> wCards = wService.loadAll();
        LOG.info(wCards.size() + " weapon cards loaded :");
        for (Weapon wCard : wCards) {
            LOG.info("\t" + wCard.getName());
        }
        final MissionLoader mService = new MissionLoaderImpl();
        final List<Mission> missions = mService.loadAll();
        LOG.info(missions.size() + " missions loaded :");
        for (Mission mission : missions) {
            LOG.info("\t" + mission.getName());
        }
        final BoxLoader bService = new BoxLoaderImpl();
        final List<Box> boxes = bService.loadAll();
        LOG.info(boxes.size() + " boxes loaded :");
        for (Box box : boxes) {
            LOG.info("\t" + box.getName());
        }
    }

}
