package com.yeamanan.projecttwo.model.character;

import com.yeamanan.projecttwo.model.Constants;

/**
 * Zombie class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Zombie extends Character {

    /**
     * Toxic boolean.
     */
    private final boolean toxic;

    /**
     * Berserker boolean.
     */
    private final boolean berserker;

    /**
     * Constructor.
     */
    public Zombie() {
        this(Constants.ZOMBIE_ACTION);
    }

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public Zombie(final int argNbAction) {
        super(argNbAction);
        this.toxic = false;
        this.berserker = false;
    }

    /**
     * toString() method.
     *
     * @return the zombie in string format
     */
    @Override
    public String toString() {
        return "Zombie{" + "nbAction=" + this.getNbAction() + '}';
    }

}
