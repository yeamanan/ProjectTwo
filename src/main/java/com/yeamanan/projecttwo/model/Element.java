package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.mission.Direction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Element class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlTransient
@XmlAccessorType(XmlAccessType.FIELD)
public class Element {

    /**
     * Axe of a tile.
     */
    @XmlAttribute(name = "direction", required = false)
    private Direction direction;

    /**
     * Constructor.
     */
    public Element() {
        this.direction = Direction.NORTH;
    }

    /**
     * getDirection() method.
     *
     * @return the direction of the tile
     */
    public final Direction getDirection() {
        return this.direction;
    }

    /**
     * setDirection() method.
     *
     * @param argDirection the new direction of the tile
     */
    public final void setDirection(final Direction argDirection) {
        this.direction = argDirection;
    }

}
