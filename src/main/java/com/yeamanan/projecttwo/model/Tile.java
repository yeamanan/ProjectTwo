package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.rule.Axe;

/**
 * Tile class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Tile {

    /**
     * Name of a tile.
     */
    private String name;

    /**
     * Axe of a tile.
     */
    private Axe axe;

    /**
     * Constructor.
     */
    public Tile() {
        this.name = "";
        this.axe = Axe.NORTH;
    }

    /**
     * Constructor.
     *
     * @param argName the new name of the tile
     * @param argAxe the new axe of the tile
     */
    public Tile(final String argName, final Axe argAxe) {
        this.name = argName;
        this.axe = argAxe;
    }

    /**
     * getName() method.
     * @return name
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     * @param argName new name
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * getAxe() method.
     *
     * @return axe
     */
    public final Axe getAxe() {
        return this.axe;
    }

    /**
     * setAxe() method.
     *
     * @param argAxe new axe
     */
    public final void setAxe(final Axe argAxe) {
        this.axe = argAxe;
    }

    /**
     * toString() method.
     *
     * @return the tile in String format
     */
    @Override
    public final String toString() {
        return "Tile{" + "name=" + this.name + ", axe="
                + this.axe.getShortCode() + '}';
    }

}
