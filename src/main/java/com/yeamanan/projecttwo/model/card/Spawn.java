package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Spawn class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Spawn")
@XmlRootElement(name = "Spawn")
@XmlAccessorType(XmlAccessType.FIELD)
public class Spawn extends Card {

    /**
     * Is the card a turn spawn card.
     */
    @XmlElement(name = "Turn", required = true)
    private boolean turnCard;

    /**
     * Is the case a sewer spawn card.
     */
    @XmlElement(name = "Sewer", required = true)
    private boolean sewerCard;

    /**
     * Red level spawn.
     */
    @XmlElement(name = "Red", required = true)
    private String redLevel;

    /**
     * Orange level spawn.
     */
    @XmlElement(name = "Orange", required = true)
    private String orangeLevel;

    /**
     * Yellow level spawn.
     */
    @XmlElement(name = "Yellow", required = true)
    private String yellowLevel;

    /**
     * Blue level spawn.
     */
    @XmlElement(name = "Blue", required = true)
    private String blueLevel;

    /**
     * isTurnCard() method.
     *
     * @return a boolean
     */
    public final boolean isTurnCard() {
        return this.turnCard;
    }

    /**
     * setTurnCard() method.
     *
     * @param argTurnCard the new value
     */
    public final void setTurnCard(final boolean argTurnCard) {
        this.turnCard = argTurnCard;
    }

    /**
     * isSewerCard() method.
     *
     * @return a boolean
     */
    public final boolean isSewerCard() {
        return this.sewerCard;
    }

    /**
     * setSewerCard() method.
     *
     * @param argSewerCard the new value
     */
    public final void setSewerCard(final boolean argSewerCard) {
        this.sewerCard = argSewerCard;
    }

    /**
     * getRedLevel() method.
     *
     * @return the red level spawn
     */
    public final String getRedLevel() {
        return this.redLevel;
    }

    /**
     * setRedLevel() method.
     *
     * @param argRedLevel the new red level spawn
     */
    public final void setRedLevel(final String argRedLevel) {
        this.redLevel = argRedLevel;
    }

    /**
     * getOrangeLevel() method.
     *
     * @return the orange level spawn
     */
    public final String getOrangeLevel() {
        return this.orangeLevel;
    }

    /**
     * setOrangeLevel() method.
     *
     * @param argOrangeLevel the new orange level spawn
     */
    public final void setOrangeLevel(final String argOrangeLevel) {
        this.orangeLevel = argOrangeLevel;
    }

    /**
     * getYellowLevel method().
     *
     * @return the yellow level spawn
     */
    public final String getYellowLevel() {
        return this.yellowLevel;
    }

    /**
     * setYellowLevel() method.
     *
     * @param argYellowLevel the new yellow level spawn
     */
    public final void setYellowLevel(final String argYellowLevel) {
        this.yellowLevel = argYellowLevel;
    }

    /**
     * getBlueLevel() method.
     *
     * @return the blue level spawn
     */
    public final String getBlueLevel() {
        return this.blueLevel;
    }

    /**
     * setBlueLevel() method.
     *
     * @param argBlueLevel the new blue level spawn
     */
    public final void setBlueLevel(final String argBlueLevel) {
        this.blueLevel = argBlueLevel;
    }

}
