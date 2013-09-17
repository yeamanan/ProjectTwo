package com.yeamanan.projecttwo.model.mission;

/**
 * Direction enumeration.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public enum Direction {

    /**
     * North.
     */
    NORTH(0.0d),

    /**
     * East.
     */
    EAST(90.0d),

    /**
     * South.
     */
    SOUTH(180.0d),

    /**
     * West.
     */
    WEST(270.0d);

    /**
     * Angle of the axe.
     */
    private double angle;

    /**
     * Constructor.
     *
     * @param argAngle the angle of the direction
     */
    private Direction(final double argAngle) {
        this.angle = argAngle;
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
