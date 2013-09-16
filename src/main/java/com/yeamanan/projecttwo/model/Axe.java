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
    NORTH(Constants.NORTH_SHORT_CODE, 0.0d),

    /**
     * East.
     */
    EAST(Constants.EAST_SHORT_CODE, 90.0d),

    /**
     * South.
     */
    SOUTH(Constants.SOUTH_SHORT_CODE, 180.0d),

    /**
     * West.
     */
    WEST(Constants.WEST_SHORT_CODE, 270.0d);

    /**
     * Short code of the axe.
     */
    private String shortCode;

    /**
     * Angle of the axe.
     */
    private double angle;

    /**
     * Constructor.
     *
     * @param argShortCode the new short code of the axe
     */
    private Axe(final String argShortCode, final double argAngle) {
        this.shortCode = argShortCode;
        this.angle = argAngle;
    }

    /**
     * getShortCode() method.
     *
     * @return the short code of the axe
     */
    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * getAngle() method.
     *
     * @return the angle of the axe
     */
    public double getAngle() {
        return this.angle;
    }

}
