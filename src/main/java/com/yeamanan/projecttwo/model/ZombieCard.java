package com.yeamanan.projecttwo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "turnCard", "sewerCard", "redLevel",
    "orangeLevel", "yellowLevel", "blueLevel" })
@XmlRootElement(name = "ZombieCard")
public class ZombieCard {

    /**
     * .
     */
    @XmlElement(name = "Id", required = true)
    private String id;

    /**
     * .
     */
    @XmlElement(name = "Turn", required = true)
    private boolean turnCard;

    /**
     * .
     */
    @XmlElement(name = "Sewer", required = true)
    private boolean sewerCard;

    /**
     * .
     */
    @XmlElement(name = "Red", required = true)
    private String redLevel;

    /**
     * .
     */
    @XmlElement(name = "Orange", required = true)
    private String orangeLevel;

    /**
     * .
     */
    @XmlElement(name = "Yellow", required = true)
    private String yellowLevel;

    /**
     * .
     */
    @XmlElement(name = "Blue", required = true)
    private String blueLevel;

    /**
     * .
     * @return a
     */
    public final String getId() {
        return this.id;
    }

    /**
     * .
     * @param argId a
     */
    public final void setId(final String argId) {
        this.id = argId;
    }

    /**
     * .
     * @return a
     */
    public final boolean isTurnCard() {
        return this.turnCard;
    }

    /**
     * .
     * @param argTurnCard a
     */
    public final void setTurnCard(final boolean argTurnCard) {
        this.turnCard = argTurnCard;
    }

    /**
     * .
     * @return a
     */
    public final boolean isSewerCard() {
        return this.sewerCard;
    }

    /**
     * .
     * @param argSewerCard a
     */
    public final void setSewerCard(final boolean argSewerCard) {
        this.sewerCard = argSewerCard;
    }

    /**
     * .
     * @return a
     */
    public final String getRedLevel() {
        return this.redLevel;
    }

    /**
     * .
     * @param argRedLevel a
     */
    public final void setRedLevel(final String argRedLevel) {
        this.redLevel = argRedLevel;
    }

    /**
     * .
     * @return a
     */
    public final String getOrangeLevel() {
        return this.orangeLevel;
    }

    /**
     * .
     * @param argOrangeLevel a
     */
    public final void setOrangeLevel(final String argOrangeLevel) {
        this.orangeLevel = argOrangeLevel;
    }

    /**
     * .
     * @return a
     */
    public final String getYellowLevel() {
        return this.yellowLevel;
    }

    /**
     * .
     * @param argYellowLevel a
     */
    public final void setYellowLevel(final String argYellowLevel) {
        this.yellowLevel = argYellowLevel;
    }

    /**
     * .
     * @return a
     */
    public final String getBlueLevel() {
        return this.blueLevel;
    }

    /**
     * .
     * @param argBlueLevel a
     */
    public final void setBlueLevel(final String argBlueLevel) {
        this.blueLevel = argBlueLevel;
    }

}
