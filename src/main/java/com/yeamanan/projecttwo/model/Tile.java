package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.game.Zone;
import com.yeamanan.projecttwo.model.rule.Axe;
import java.util.ArrayList;
import java.util.List;

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
     * Places of a tile.
     */
    private List<Zone> places;

    /**
     * Constructor.
     */
    public Tile() {
        name = "";
        axe = Axe.NORTH;
        places = new ArrayList<Zone>();
    }

    /**
     * Constructor.
     *
     * @param name new name
     */
    public Tile(final String argName) {
        name = argName;
        axe = Axe.NORTH;
        places = new ArrayList<Zone>();
    }

    /**
     * getName() method.
     * @return name
     */
    public final String getName() {
        return name;
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
        return axe;
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
     * getPlaces() method.
     *
     * @return places
     */
    public final List<Zone> getPlaces() {
        return places;
    }

    /**
     * setPlaces() method.
     *
     * @param argPlaces new places
     */
    public final void setPlaces(List<Zone> argPlaces) {
        this.places = argPlaces;
    }

}
