package com.yeamanan.projecttwo.model.card;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Abomination;
import com.yeamanan.projecttwo.model.character.Fatty;
import com.yeamanan.projecttwo.model.character.Runner;
import com.yeamanan.projecttwo.model.character.Walker;
import com.yeamanan.projecttwo.model.character.ZombieDog;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
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

    public static final String WALKER = "Walker";
    public static final String FATTY = "Fatty";
    public static final String RUNNER = "Runner";
    public static final String ABOMINATION = "Abomination";
    public static final String ZOMBIE_DOG = "ZombieDog";

    /**
     * Is the card a turn spawn card.
     */
    @XmlElement(name = "Turn", required = false)
    private boolean turnCard;

    /**
     * Is the case a sewer spawn card.
     */
    @XmlElement(name = "Sewer", required = false)
    private boolean sewerCard;

    /**
     * Red level spawn.
     */
    @XmlElementWrapper(name = "Red", required = false)
    @XmlElements({
        @XmlElement(name = WALKER, type = Walker.class),
        @XmlElement(name = FATTY, type = Fatty.class),
        @XmlElement(name = RUNNER, type = Runner.class),
        @XmlElement(name = ABOMINATION, type = Abomination.class),
        @XmlElement(name = ZOMBIE_DOG, type = ZombieDog.class)
    })
    private List<Element> redLevel;

    /**
     * Orange level spawn.
     */
    @XmlElementWrapper(name = "Orange", required = false)
    @XmlElements({
        @XmlElement(name = WALKER, type = Walker.class),
        @XmlElement(name = FATTY, type = Fatty.class),
        @XmlElement(name = RUNNER, type = Runner.class),
        @XmlElement(name = ABOMINATION, type = Abomination.class),
        @XmlElement(name = ZOMBIE_DOG, type = ZombieDog.class)
    })
    private List<Element> orangeLevel;

    /**
     * Yellow level spawn.
     */
    @XmlElementWrapper(name = "Yellow", required = false)
    @XmlElements({
        @XmlElement(name = WALKER, type = Walker.class),
        @XmlElement(name = FATTY, type = Fatty.class),
        @XmlElement(name = RUNNER, type = Runner.class),
        @XmlElement(name = ABOMINATION, type = Abomination.class),
        @XmlElement(name = ZOMBIE_DOG, type = ZombieDog.class)
    })
    private List<Element> yellowLevel;

    /**
     * Blue level spawn.
     */
    @XmlElementWrapper(name = "Blue", required = false)
    @XmlElements({
        @XmlElement(name = WALKER, type = Walker.class),
        @XmlElement(name = FATTY, type = Fatty.class),
        @XmlElement(name = RUNNER, type = Runner.class),
        @XmlElement(name = ABOMINATION, type = Abomination.class),
        @XmlElement(name = ZOMBIE_DOG, type = ZombieDog.class)
    })
    private List<Element> blueLevel;

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
    public final List<Element> getRedLevel() {
        return this.redLevel;
    }

    /**
     * setRedLevel() method.
     *
     * @param argRedLevel the new red level spawn
     */
    public final void setRedLevel(final List<Element> argRedLevel) {
        this.redLevel = argRedLevel;
    }

    /**
     * getOrangeLevel() method.
     *
     * @return the orange level spawn
     */
    public final List<Element> getOrangeLevel() {
        return this.orangeLevel;
    }

    /**
     * setOrangeLevel() method.
     *
     * @param argOrangeLevel the new orange level spawn
     */
    public final void setOrangeLevel(final List<Element> argOrangeLevel) {
        this.orangeLevel = argOrangeLevel;
    }

    /**
     * getYellowLevel method().
     *
     * @return the yellow level spawn
     */
    public final List<Element> getYellowLevel() {
        return this.yellowLevel;
    }

    /**
     * setYellowLevel() method.
     *
     * @param argYellowLevel the new yellow level spawn
     */
    public final void setYellowLevel(final List<Element> argYellowLevel) {
        this.yellowLevel = argYellowLevel;
    }

    /**
     * getBlueLevel() method.
     *
     * @return the blue level spawn
     */
    public final List<Element> getBlueLevel() {
        return this.blueLevel;
    }

    /**
     * setBlueLevel() method.
     *
     * @param argBlueLevel the new blue level spawn
     */
    public final void setBlueLevel(final List<Element> argBlueLevel) {
        this.blueLevel = argBlueLevel;
    }

}
