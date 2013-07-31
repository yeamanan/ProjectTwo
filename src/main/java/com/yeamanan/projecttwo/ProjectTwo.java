package com.yeamanan.projecttwo;

import com.yeamanan.projecttwo.bean.people.Character;
import com.yeamanan.projecttwo.bean.people.Survivor;
import com.yeamanan.projecttwo.bean.people.Zombie;
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
    public static void main(final String[] args) {
        LOGGER.info(new Character(0));
        LOGGER.info(new Survivor());
        LOGGER.info(new Zombie());
        LOGGER.info(write());
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
