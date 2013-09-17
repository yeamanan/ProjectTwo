package com.yeamanan.projecttwo.model.mission;

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
     * Name of a tile.
     */
    @XmlAttribute(name = "x", required = true)
    private int x;

    /**
     * Name of a tile.
     */
    @XmlAttribute(name = "y", required = true)
    private int y;

    /**
     * Axe of a tile.
     */
    @XmlAttribute(name = "direction", required = false)
    private Direction axe;

    /**
     * Constructor.
     */
    public Tile() {
        this.name = "";
        this.x = 0;
        this.y = 0;
        this.axe = Direction.NORTH;
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

    public final int getX() {
        return x;
    }

    public final void setX(final int argX) {
        this.x = argX;
    }

    public final int getY() {
        return y;
    }

    public final void setY(final int argY) {
        this.y = argY;
    }

    /**
     * getAxe() method.
     *
     * @return the axe of the tile
     */
    public final Direction getAxe() {
        return this.axe;
    }

    /**
     * setAxe() method.
     *
     * @param argAxe the new axe of the tile
     */
    public final void setAxe(final Direction argAxe) {
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
