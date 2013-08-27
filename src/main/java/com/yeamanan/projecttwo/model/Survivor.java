package com.yeamanan.projecttwo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Survivor class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "blueSkills", "yellowSkills",
    "orangeSkills", "redSkills" })
@XmlRootElement(name = "Survivor")
public class Survivor extends Character {

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
    private List<Skill> blueSkills;

    /**
     * List of the skill in yellow danger level.
     */
    @XmlElement(name = "YellowSkills", required = true)
    private List<Skill> yellowSkills;

    /**
     * List of the skill in orange danger level.
     */
    @XmlElement(name = "OrangeSkills", required = true)
    private List<Skill> orangeSkills;

    /**
     * List of the skill in red danger level.
     */
    @XmlElement(name = "RedSkills", required = true)
    private List<Skill> redSkills;

    /**
     * Skills of the survivor.
     */
    @XmlTransient
    private List<Skill> skills;

    /**
     * Constructor.
     */
    public Survivor() {
        super(Constants.SURVIVOR_ACTION);
        this.name = "";
        this.experience = 0;
        this.level = Level.BLUE;
        this.blueSkills = new ArrayList<>();
        this.yellowSkills = new ArrayList<>();
        this.orangeSkills = new ArrayList<>();
        this.redSkills = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    /**
     * Constructor.
     *
     * @param argName the new name of the survivor
     */
    public Survivor(final String argName) {
        super(Constants.SURVIVOR_ACTION);
        this.name = argName;
        this.experience = 0;
        this.level = Level.BLUE;
        this.blueSkills = new ArrayList<>();
        this.yellowSkills = new ArrayList<>();
        this.orangeSkills = new ArrayList<>();
        this.redSkills = new ArrayList<>();
        this.skills = new ArrayList<>();
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
    public List<Skill> getBlueSkills() {
        return this.blueSkills;
    }

    /**
     * setBlueSkills() method.
     *
     * @param argBlueSkills the new blue danger level list of skills
     */
    public void setBlueSkills(final List<Skill> argBlueSkills) {
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
     * equals() methods.
     *
     * @param obj the object to compare to
     * @return the boolean
     */
    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Survivor other = (Survivor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        return true;
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
        return "Survivor{" + "nbAction=" + this.nbAction +  ", name="
                + this.name + ", experience=" + this.experience + ", level="
                + this.level + '}';
    }

}
