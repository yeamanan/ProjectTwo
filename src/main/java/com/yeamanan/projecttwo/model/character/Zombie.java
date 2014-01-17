package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Zombie class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */

@XmlType(name = Zombie.NAME)
@XmlRootElement(name = Zombie.NAME)
public class Zombie extends Character {

    /**
     * Name.
     */
    protected static final String NAME = "Zombie";

    /**
     * Number of action.
     */
    private static final int NB_ACTION = 1;

    /**
     * Experience given when killed.
     */
    private static final int EXPERIENCE_GIVEN = 1;

    /**
     * Toxic boolean.
     */
    private boolean toxic;

    /**
     * Berserk boolean.
     */
    private boolean berserk;

    /**
     * Constructor.
     */
    Zombie() {
        this(NB_ACTION);
    }

    /**
     * Constructor.
     *
     * @param argNbAction the new number of action that can do the character
     */
    Zombie(final int argNbAction) {
        super(argNbAction);
        toxic = false;
        berserk = false;
    }

    /**
     * isToxic() method.
     *
     * @return
     */
    public final boolean isToxic() {
        return toxic;
    }

    /**
     * setToxic() method.
     *
     * @param argToxic
     */
    public final void setToxic(final boolean argToxic) {
        toxic = argToxic;
    }

    /**
     * isBerserk() method.
     *
     * @return
     */
    public final boolean isBerserk() {
        return berserk;
    }

    /**
     * setBerserk() method.
     *
     * @param argBerserk
     */
    public final void setBerserk(final boolean argBerserk) {
        berserk = argBerserk;
    }

    /**
     * toString() method.
     *
     * @return the character in string format
     */
    @Override
    public String toString() {
        return super.toString() + "\n{" + "toxic=" + toxic + "}\n{" + "berserk=" + berserk + "}";
    }

}
