package com.yeamanan.projecttwo.model.stuff;

import com.yeamanan.projecttwo.model.Axe;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Tile class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="")
@XmlRootElement(name = "Tile")
public class Tile {

    /**
     * Name of a tile.
     */
    @XmlAttribute(name = "name", required = true)
    private String name;

    /**
     * Axe of a tile.
     */
    @XmlAttribute(name = "direction", required = false)
    private Axe axe;

    /**
     * Zones of the tile.
     */
    @XmlTransient
    private List<Zone> zones;

    /**
     * Constructor.
     */
    public Tile() {
        this.name = "";
        this.axe = Axe.NORTH;
        this.zones = new ArrayList<>();
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
    public final List<Zone> getZones() {
        return this.zones;
    }

    /**
     * setZones() method.
     *
     * @param argZones the new zones of the tiles
     */
    public final void setZones(final List<Zone> argZones) {
        this.zones = argZones;
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
