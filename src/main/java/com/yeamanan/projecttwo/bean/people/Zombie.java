package com.yeamanan.projecttwo.bean.people;

import com.yeamanan.projecttwo.bean.rule.Constants;

/**
 * Zombie class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Zombie extends Character {

    /**
     * Constructor.
     */
    public Zombie() {
        super(Constants.ZOMBIE_ACTION);
    }

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public Zombie(final int argNbAction) {
        super(argNbAction);
    }

    /**
     * toString() method.
     *
     * @return the zombie in string format
     */
    @Override
    public String toString() {
        return "Zombie{" + "nbAction=" + this.nbAction + '}';
    }

}
