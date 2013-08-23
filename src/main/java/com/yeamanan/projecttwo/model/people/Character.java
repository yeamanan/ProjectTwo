package com.yeamanan.projecttwo.model.people;

/**
 * Character class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Character {

    /**
     * Number of action of the character.
     */
    protected int nbAction;

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public Character(final int argNbAction) {
        this.nbAction = argNbAction;
    }

    /**
     * getNbAction() method.
     *
     * @return the number of action that can do the character.
     */
    public final int getNbAction() {
        return this.nbAction;
    }

    /**
     * setNbAction() method.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public final void setNbAction(final int argNbAction) {
        this.nbAction = argNbAction;
    }

    /**
     * toString() method.
     *
     * @return the character in string format
     */
    @Override
    public String toString() {
        return "Character{" + "nbAction=" + this.nbAction + '}';
    }

}
