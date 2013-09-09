package com.yeamanan.projecttwo.model.mission;

import com.yeamanan.projecttwo.model.Axe;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tile class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Tile")
@XmlRootElement(name = "Tile")
@XmlAccessorType(XmlAccessType.FIELD)
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
     * Constructor.
     */
    public Tile() {
        this("", Axe.NORTH);
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
     * toString() method.
     *
     * @return the tile in String format
     */
    @Override
    public final String toString() {
        return "Tile{" + "name=" + this.name + ", axe=" + this.axe + '}';
    }

}
