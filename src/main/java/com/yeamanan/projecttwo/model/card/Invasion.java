package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * InvasionCard class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Invasion")
@XmlRootElement(name = "Invasion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Invasion extends Card {

    /**
     * Is the card a turn zombie card.
     */
    @XmlElement(name = "Turn", required = true)
    private boolean turnCard;

    /**
     * Is the case a sewer zombie card.
     */
    @XmlElement(name = "Sewer", required = true)
    private boolean sewerCard;

    /**
     * Red level invasion.
     */
    @XmlElement(name = "Red", required = true)
    private String redLevel;

    /**
     * Orange level invasion.
     */
    @XmlElement(name = "Orange", required = true)
    private String orangeLevel;

    /**
     * Yellow level invasion.
     */
    @XmlElement(name = "Yellow", required = true)
    private String yellowLevel;

    /**
     * Blue level invasion.
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
     * @return the red level invasion
     */
    public final String getRedLevel() {
        return this.redLevel;
    }

    /**
     * setRedLevel() method.
     *
     * @param argRedLevel the new red level invasion
     */
    public final void setRedLevel(final String argRedLevel) {
        this.redLevel = argRedLevel;
    }

    /**
     * getOrangeLevel() method.
     *
     * @return the orange level invasion
     */
    public final String getOrangeLevel() {
        return this.orangeLevel;
    }

    /**
     * setOrangeLevel() method.
     *
     * @param argOrangeLevel the new orange level invasion
     */
    public final void setOrangeLevel(final String argOrangeLevel) {
        this.orangeLevel = argOrangeLevel;
    }

    /**
     * getYellowLevel method().
     *
     * @return the yellow level invasion
     */
    public final String getYellowLevel() {
        return this.yellowLevel;
    }

    /**
     * setYellowLevel() method.
     *
     * @param argYellowLevel the new yellow level invasion
     */
    public final void setYellowLevel(final String argYellowLevel) {
        this.yellowLevel = argYellowLevel;
    }

    /**
     * getBlueLevel() method.
     *
     * @return the blue level invasion
     */
    public final String getBlueLevel() {
        return this.blueLevel;
    }

    /**
     * setBlueLevel() method.
     *
     * @param argBlueLevel the new blue level invasion
     */
    public final void setBlueLevel(final String argBlueLevel) {
        this.blueLevel = argBlueLevel;
    }

}
