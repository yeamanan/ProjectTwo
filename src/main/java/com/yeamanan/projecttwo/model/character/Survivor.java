package com.yeamanan.projecttwo.model.character;

import com.yeamanan.projecttwo.model.Constants;
import com.yeamanan.projecttwo.model.card.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Survivor class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Survivor.NAME)
@XmlRootElement(name = Survivor.NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class Survivor extends Character {

    /**
     * Number of action.
     */
    private static final int NB_ACTION = 3;

    /**
     * .
     */
    protected static final String NAME = "Survivor";

    /**
     * Name of the character.
     */
    @XmlElement(name = "Name", required = true)
    private String name;

    /**
     * Experience of the survivor.
     */
    @XmlTransient
    private int experience;

    /**
     * Level of the survivor.
     */
    @XmlTransient
    private Level level;

    /**
     * List of the skill in blue danger level.
     */
    @XmlElement(name = "BlueSkills", required = true)
    @XmlList
    private List<Skill> blueSkills;

    /**
     * List of the skill in yellow danger level.
     */
    @XmlElement(name = "YellowSkills", required = true)
    @XmlList
    private List<Skill> yellowSkills;

    /**
     * List of the skill in orange danger level.
     */
    @XmlElement(name = "OrangeSkills", required = true)
    @XmlList
    private List<Skill> orangeSkills;

    /**
     * List of the skill in red danger level.
     */
    @XmlElement(name = "RedSkills", required = true)
    @XmlList
    private List<Skill> redSkills;

    /**
     * Skills of the survivor.
     */
    @XmlTransient
    private List<Skill> skills;

    /**
     * Equipments in inventory.
     */
    @XmlTransient
    private List<Card> inventory;

    /**
     * Equipments in hands.
     */
    @XmlTransient
    private List<Card> hands;

    /**
     * Constructor.
     */
    public Survivor() {
        this(NAME);
    }

    /**
     * Constructor.
     *
     * @param argName the new name of the survivor
     */
    public Survivor(final String argName) {
        super(NB_ACTION);
        this.name = argName;
        this.experience = 0;
        this.level = Level.BLUE;
        this.blueSkills = new ArrayList<>();
        this.yellowSkills = new ArrayList<>();
        this.orangeSkills = new ArrayList<>();
        this.redSkills = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.hands = new ArrayList<>();
    }

    /**
     * getName() method.
     *
     * @return the name of the character
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the character
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * getExperience() method.
     *
     * @return the experience of the survivor
     */
    public final int getExperience() {
        return this.experience;
    }

    /**
     * setExperience() method.
     *
     * @param argExperience the new experience of the survivor
     */
    public final void setExperience(final int argExperience) {
        this.experience = argExperience;
    }

    /**
     * getLevel() method.
     *
     * @return the level of the survivor
     */
    public final Level getLevel() {
        return this.level;
    }

    /**
     * setLevel() method.
     *
     * @param argLevel the new level of the survivor
     */
    public final void setLevel(final Level argLevel) {
        this.level = argLevel;
    }

    /**
     * getBlueSkills() method.
     *
     * @return the blue danger level list of skills
     */
    public final List<Skill> getBlueSkills() {
        return this.blueSkills;
    }

    /**
     * setBlueSkills() method.
     *
     * @param argBlueSkills the new blue danger level list of skills
     */
    public final void setBlueSkills(final List<Skill> argBlueSkills) {
        this.blueSkills = argBlueSkills;
    }

    /**
     * getYellowSkills() method.
     *
     * @return the yellow danger level list of skills
     */
    public final List<Skill> getYellowSkills() {
        return this.yellowSkills;
    }

    /**
     * setYellowSkills() method.
     *
     * @param argYellowSkills the new yellow danger level list of skills
     */
    public final void setYellowSkills(final List<Skill> argYellowSkills) {
        this.yellowSkills = argYellowSkills;
    }

    /**
     * getOrangeSkills() method.
     *
     * @return the orange danger level list of skills
     */
    public final List<Skill> getOrangeSkills() {
        return this.orangeSkills;
    }

    /**
     * setOrangeSkills() method.
     *
     * @param argOrangeSkills the new orange danger level list of skills
     */
    public final void setOrangeSkills(final List<Skill> argOrangeSkills) {
        this.orangeSkills = argOrangeSkills;
    }

    /**
     * getRedSkills() method.
     *
     * @return the red danger level list of skills
     */
    public final List<Skill> getRedSkills() {
        return this.redSkills;
    }

    /**
     * setRedSkills() method.
     *
     * @param argRedSkills the new red danger level list of skills
     */
    public final void setRedSkills(final List<Skill> argRedSkills) {
        this.redSkills = argRedSkills;
    }

    /**
     * getSkills() method.
     *
     * @return the list of skills
     */
    public final List<Skill> getSkills() {
        return this.skills;
    }

    /**
     * setSkills() method.
     *
     * @param argSkills the new list of skills
     */
    public final void setSkills(final List<Skill> argSkills) {
        this.skills = argSkills;
    }

    /**
     * getInventory() method.
     *
     * @return the list of equipment for the inventory
     */
    public final List<Card> getInventory() {
        return inventory;
    }

    /**
     * setInventory() method.
     *
     * @param argInventory the new list of equipment in the inventory
     */
    public final void setInventory(final List<Card> argInventory) {
        this.inventory = argInventory;
    }

    /**
     * getHands() method.
     *
     * @return the list of equipment in the hands
     */
    public final List<Card> getHands() {
        return hands;
    }

    /**
     * setHands() method.
     *
     * @param argHands the new list of equipment in the hands
     */
    public final void setHands(final List<Card> argHands) {
        this.hands = argHands;
    }

    /**
     * equals() methods.
     *
     * @param obj the object to compare to
     * @return the boolean
     */
    @Override
    public final boolean equals(final Object obj) {
        final Survivor other = (Survivor) obj;
        return obj != null &&
                getClass() == obj.getClass() &&
                Objects.equals(this.name, other.name) &&
                this.experience == other.experience &&
                this.level == other.level;
    }

    /**
     * hashCode() method.
     *
     * @return the hash code of the object
     */
    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.experience;
        hash = 83 * hash + Objects.hashCode(this.level);
        return hash;
    }

    /**
     * toString() method.
     *
     * @return the survivor in string format
     */
    @Override
    public final String toString() {
        return "Survivor{" + "name=" + name + ", experience=" + experience
                + ", level=" + level + ", blueSkills=" + blueSkills
                + ", yellowSkills=" + yellowSkills + ", orangeSkills="
                + orangeSkills + ", redSkills=" + redSkills + ", skills="
                + skills + ", inventory=" + inventory + ", hands=" + hands
                + '}';
    }

    /**
     * toString() method.
     *
     * @return the survivor in string format
     */
//    @Override
//    public final String toString() {
//        return "Survivor{" + "nbAction=" + this.nbAction +  ", name="
//                + this.name + ", experience=" + this.experience + ", level="
//                + this.level + '}';
//    }

}
