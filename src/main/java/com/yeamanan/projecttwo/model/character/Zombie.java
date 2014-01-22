package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Zombie class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Zombie.XML_NAME)
@XmlRootElement(name = Zombie.XML_NAME)
public class Zombie extends Character {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "Zombie";

    /**
     * Type of zombie.
     */
    private ZombieType type;

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
    public Zombie() {
        this(ZombieType.WALKER);
    }

    /**
     * Constructor.
     */
    public Zombie(final ZombieType argType) {
        type = argType;
        toxic = false;
        berserk = false;
    }

    public ZombieType getType() {
        return type;
    }

    public void setType(ZombieType type) {
        this.type = type;
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

}
