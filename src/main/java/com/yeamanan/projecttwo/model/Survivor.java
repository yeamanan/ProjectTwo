package com.yeamanan.projecttwo.model;

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
@XmlType(name = "", propOrder = { "name" })
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
     * Constructor.
     */
    public Survivor() {
        super(Constants.SURVIVOR_ACTION);
        this.name = "";
        this.experience = 0;
        this.level = Level.BLUE;
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
