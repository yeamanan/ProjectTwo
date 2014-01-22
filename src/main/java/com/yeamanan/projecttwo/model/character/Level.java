package com.yeamanan.projecttwo.model.character;

/**
 * Level enumeration.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public enum Level {

    /**
     * Blue level.
     */
    BLUE(Level.MIN_XP_FOR_BLUE_LEVEL),

    /**
     * Yellow level.
     */
    YELLOW(Level.MIN_XP_FOR_YELLOW_LEVEL),

    /**
     * Orange level.
     */
    ORANGE(Level.MIN_XP_FOR_ORANGE_LEVEL),

    /**
     * Red level.
     */
    RED(Level.MIN_XP_FOR_RED_LEVEL);

    /**
     * Minimum experience to access the blue level.
     */
    private static final int MIN_XP_FOR_BLUE_LEVEL = 0;

    /**
     * Minimum experience to access the yellow level.
     */
    private static final int MIN_XP_FOR_YELLOW_LEVEL = 7;

    /**
     * Minimum experience to access the orange level.
     */
    private static final int MIN_XP_FOR_ORANGE_LEVEL = 19;

    /**
     * Minimum experience to access the red level.
     */
    private static final int MIN_XP_FOR_RED_LEVEL = 43;

    /**
     * Minimum experience.
     */
    private final int minimumExperience;

    /**
     * Constructor.
     *
     * @param argMinXp the minimum experience to reach the level
     */
    Level(final int argMinimumExperience) {
        minimumExperience = argMinimumExperience;
    }

    /**
     * getMinXp() method.
     *
     * @return the minimum experience to reach the level
     */
    public final int getMinimumExperience() {
        return this.minimumExperience;
    }

}
