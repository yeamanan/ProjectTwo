package com.yeamanan.projecttwo.model.game;

import com.yeamanan.projecttwo.model.rule.Axe;
import com.yeamanan.projecttwo.model.rule.State;
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
     * Zones of the tile.
     */
    private List<List<String>> zones;

    /**
     * States of the zones.
     */
    private List<List<State>> zonesStates;

    /**
     * Constructor.
     */
    public Tile() {
        this.name = "";
        this.axe = Axe.NORTH;
        this.zones = new ArrayList<>();
        this.zonesStates = new ArrayList<>();
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
        this.zones = new ArrayList<>();
        this.zonesStates = new ArrayList<>();
    }

    /**
     * getName() method.
     * @return the name of the tile
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     * @param argName the new name of the tile
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * getAxe() method.
     *
     * @return the axe of the tile
     */
    public final Axe getAxe() {
        return this.axe;
    }

    /**
     * setAxe() method.
     *
     * @param argAxe the new axe of the tile
     */
    public final void setAxe(final Axe argAxe) {
        this.axe = argAxe;
    }

    /**
     * getZones() method.
     *
     * @return the zones of the tile
     */
    public final List<List<String>> getZones() {
        return this.zones;
    }

    /**
     * setZones() method.
     *
     * @param argAxe the new zones of the tiles
     */
    public final void setZones(final List<List<String>> argZones) {
        this.zones = argZones;
    }

    /**
     * getZonesStates() method.
     *
     * @return the states' zones of the tile
     */
    public final List<List<State>> getZonesStates() {
        return this.zonesStates;
    }

    /**
     * setAxe() method.
     *
     * @param argZonesStates the new states' zones of the tile
     */
    public final void setAxe(final List<List<State>> argZonesStates) {
        this.zonesStates = argZonesStates;
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
