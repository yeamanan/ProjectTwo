package com.yeamanan.projecttwo.bean.rule;

/**
 * Level enumeration.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public enum Level {

    /**
     * Blue level.
     */
    BLUE(),

    /**
     * Yellow level.
     */
    YELLOW(),

    /**
     * Orange level.
     */
    ORANGE(),

    /**
     * Red level.
     */
    RED();

    /**
     * Minimum experimen
     */
    private final int minXp;

    public Level(final int argMinXp) {
    }
}
