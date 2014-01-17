package com.yeamanan.projecttwo.model.character;

import com.yeamanan.projecttwo.model.Element;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Character class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Character.NAME)
@XmlRootElement(name = Character.NAME)
class Character extends Element {

    /**
     * Name.
     */
    public static final String NAME = "Character";

    /**
     * Number of action.
     */
    private static final int NB_ACTION = 0;

    /**
     * Number of action of the character.
     */
    @XmlTransient
    private int nbAction;

    /**
     * Constructor.
     */
    Character() {
        this(NB_ACTION);
    }

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    Character(final int argNbAction) {
        nbAction = argNbAction;
    }

    /**
     * getNbAction() method.
     *
     * @return the number of action that can do the character.
     */
    public final int getNbAction() {
        return nbAction;
    }

    /**
     * setNbAction() method.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public final void setNbAction(final int argNbAction) {
        nbAction = argNbAction;
    }

    /**
     * toString() method.
     *
     * @return the character in string format
     */
    @Override
    public String toString() {
        return NAME + "\n{" + "nbAction=" + nbAction + '}';
    }

}
