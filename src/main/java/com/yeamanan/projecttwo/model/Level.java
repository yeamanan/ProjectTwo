package com.yeamanan.projecttwo.model;

/**
 * Level enumeration.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public enum Level {

    /**
     * Blue level.
     */
    BLUE(Constants.MIN_XP_BLUE),

    /**
     * Yellow level.
     */
    YELLOW(Constants.MIN_XP_YELLOW),

    /**
     * Orange level.
     */
    ORANGE(Constants.MIN_XP_ORANGE),

    /**
     * Red level.
     */
    RED(Constants.MIN_XP_RED);

    /**
     * Minimum experience.
     */
    private final int minXp;

    /**
     * Constructor.
     *
     * @param argMinXp the minimum experience to reach the level
     */
    Level(final int argMinXp) {
        this.minXp = argMinXp;
    }

    /**
     * getMinXp() method.
     *
     * @return the minimum experience to reach the level
     */
    public final int getMinXp() {
        return this.minXp;
    }

}
