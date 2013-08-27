package com.yeamanan.projecttwo.model;

/**
 * Board class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Board {

    /**
     * Start zone.
     */
    private Zone startZone;

    /**
     * Constructor.
     */
    Board() {
        this.startZone = new Zone();
    }

    /**
     * getStartZone() method.
     *
     * @return the start zone
     */
    public final Zone getStartZone() {
        return this.startZone;
    }

    /**
     * setStartZone() method.
     *
     * @param argStartZone the new start zone
     */
    public final void setStartZone(final Zone argStartZone) {
        this.startZone = argStartZone;
    }

}