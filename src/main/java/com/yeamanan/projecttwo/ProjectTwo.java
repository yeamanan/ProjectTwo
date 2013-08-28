package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.model.Survivor;
import com.yeamanan.projecttwo.model.card.EquipmentCard;
import com.yeamanan.projecttwo.model.card.ZombieCard;
import com.yeamanan.projecttwo.service.card.EquipmentCardService;
import com.yeamanan.projecttwo.service.card.EquipmentCardServiceImpl;
import com.yeamanan.projecttwo.service.SurvivorService;
import com.yeamanan.projecttwo.service.SurvivorServiceImpl;
import com.yeamanan.projecttwo.service.card.ZombieCardService;
import com.yeamanan.projecttwo.service.card.ZombieCardServiceImpl;
import com.yeamanan.projecttwo.util.PropertiesUtil;
import com.yeamanan.projecttwo.view.ViewFactory;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private static final Logger LOGGER = Logger.getLogger(ProjectTwo.class);

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
        this.stage.show();
    }

    /**
     * stop() method.
     */
    @Override
    public final void stop() {
        if (!PropertiesUtil.saveProperties(this.context.getProperties())) {
            LOGGER.error("Error saving config file");
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
        test();
        
        launch(args);
    }

    /**
     * Test.
     */
    public static void test() {
        final SurvivorService sService = new SurvivorServiceImpl();
        final List<Survivor> survivors = sService.loadAll();
        LOGGER.info(survivors.size() + " survivors loaded :");
        for (Survivor survivor : survivors) LOGGER.info("\t" + survivor);
        final ZombieCardService zcService = new ZombieCardServiceImpl();
        final List<ZombieCard> zCards = zcService.loadAll();
        LOGGER.info(zCards.size() + " zombie cards loaded :");
        for (ZombieCard zCard : zCards) LOGGER.info("\t" + zCard.getName());
        final EquipmentCardService ecService = new EquipmentCardServiceImpl();
        final List<EquipmentCard> eCards = ecService.loadAll();
        LOGGER.info(eCards.size() + " equipment cards loaded :");
        for (EquipmentCard eCard : eCards) LOGGER.info("\t" + eCard.getName());
    }
}
