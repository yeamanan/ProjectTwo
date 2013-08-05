package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.model.Mission;
import com.yeamanan.projecttwo.model.people.Abomination;
import com.yeamanan.projecttwo.model.people.Character;
import com.yeamanan.projecttwo.model.people.Fatty;
import com.yeamanan.projecttwo.model.people.Runner;
import com.yeamanan.projecttwo.model.people.Survivor;
import com.yeamanan.projecttwo.model.people.Walker;
import com.yeamanan.projecttwo.model.people.Zombie;
import com.yeamanan.projecttwo.service.MissionService;
import com.yeamanan.projecttwo.service.MissionServiceImpl;
import java.io.InputStream;
import org.apache.log4j.Logger;

/**
 * ProjectTwo class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class ProjectTwo {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ProjectTwo.class);

    /**
     * Main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) throws Exception {
//        LOGGER.info(new Character(0));
//        LOGGER.info(new Survivor());
//        LOGGER.info(new Zombie());
//        LOGGER.info(new Walker());
//        LOGGER.info(new Fatty());
//        LOGGER.info(new Runner());
//        LOGGER.info(new Abomination());
//        LOGGER.info(write());
        final MissionService missionService = new MissionServiceImpl();
        missionService.loadMissionsAsRessources();
//        final Class cls = Class.forName("com.yeamanan.projecttwo.ProjectTwo");
//        final InputStream input =
//                cls.getClassLoader()
//                .getResourceAsStream("Missions/00 - Tutorial.mis");
//        final Mission mission = missionService.loadFile(input);
////        final Mission mission = missionService.loadFile("C:\\Users\\ggl\\Documents\\NetBeansProjects\\ProjectTwo\\src\\main\\resources\\Missions\\00 - Tutorial.mis");
//        LOGGER.info(mission);
    }

    /**
     * write() method.
     *
     * @return some text
     */
    public static String write() {
        return "This is a sample project";
    }

}
