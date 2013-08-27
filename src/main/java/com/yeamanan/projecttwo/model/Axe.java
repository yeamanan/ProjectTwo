package com.yeamanan.projecttwo.model;

/**
 * Axe enumeration.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public enum Axe {

    /**
     * North.
     */
    NORTH(Constants.NORTH_SHORT_CODE),

    /**
     * East.
     */
    EAST(Constants.EAST_SHORT_CODE),

    /**
     * South.
     */
    SOUTH(Constants.SOUTH_SHORT_CODE),

    /**
     * West.
     */
    WEST(Constants.WEST_SHORT_CODE);

    /**
     * Short code of the axe.
     */
    private String shortCode;

    /**
     * Constructor.
     *
     * @param argShortCode the new short code of the axe
     */
    private Axe(final String argShortCode) {
        this.shortCode = argShortCode;
    }

    /**
     * getShortCode() method.
     *
     * @return the short code of the axe
     */
    public String getShortCode() {
        return this.shortCode;
    }

}
