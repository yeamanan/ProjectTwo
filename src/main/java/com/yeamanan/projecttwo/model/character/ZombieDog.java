package com.yeamanan.projecttwo.model.character;

import com.yeamanan.projecttwo.model.Constants;

/**
 * ZombieDog class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZombieDog extends Zombie {

    /**
     * Constructor.
     */
    public ZombieDog() {
        super(Constants.ZOMBIE_DOG_ACTION);
    }

    /**
     * toString() method.
     *
     * @return the zombie dog in string format
     */
    @Override
    public final String toString() {
        return "ZombieDog{" + "nbAction=" + this.getNbAction() + '}';
    }

}
