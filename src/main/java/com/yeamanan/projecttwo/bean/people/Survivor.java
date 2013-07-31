package com.yeamanan.projecttwo.bean.people;

import com.yeamanan.projecttwo.bean.rule.Level;
import com.yeamanan.projecttwo.bean.rule.Constants;

/**
 * Survivor class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Survivor extends Character {

    /**
     * Name of the character.
     */
    private String name;

    /**
     * Experience of the survivor.
     */
    private int experience;

    /**
     * Level of the survivor.
     */
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
