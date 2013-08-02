package com.yeamanan.projecttwo.model.rule;

/**
 * Constants class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public abstract class Constants {

    /**
     * Minimum experience to reach a level.
     */
    public static final int MIN_XP_BLUE = 0, MIN_XP_YELLOW = 7,
            MIN_XP_ORANGE = 19, MIN_XP_RED = 43;

    /**
     * Default number of action for each character.
     */
    public static final int CHARACTER_ACTION = 0, SURVIVOR_ACTION = 3,
            ZOMBIE_ACTION = 1, RUNNER_ACTION = 2;

    /**
     * Damage to kill each type of zombie.
     */
    public static final int WALKER_DAMAGE = 1, FATTY_DAMAGE = 1,
            ABOMINATION_DAMAGE = 5, RUNNER_DAMAGE = 1;

    /**
     * Experience won when killing a zombie.
     */
    public static final int WALKER_XP = 1, FATTY_XP = 1, ABOMINATION_XP = 5,
            RUNNER_XP = 1;

}
