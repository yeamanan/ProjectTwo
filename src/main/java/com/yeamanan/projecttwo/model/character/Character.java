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
@XmlType(name = "Character")
@XmlRootElement(name = "Character")
public class Character extends Element {

    /**
     * Number of action of the character.
     */
    @XmlTransient
    protected int nbAction;

    /**
     * Constructor.
     */
    public Character() {
        this(0);
    }

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    public Character(final int argNbAction) {
        super();
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
