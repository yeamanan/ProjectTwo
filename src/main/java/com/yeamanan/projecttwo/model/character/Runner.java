package com.yeamanan.projecttwo.model.character;

import com.yeamanan.projecttwo.model.Constants;

/**
 * Runner class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Runner extends Zombie {

    /**
     * Number of actions.
     */
    private static final int NB_ACTION = 2;

    /**
     * Constructor.
     */
    public Runner() {
        super(NB_ACTION);
    }

    /**
     * toString() method.
     *
     * @return the runner in string format
     */
    @Override
    public final String toString() {
        return "Runner{" + "nbAction=" + this.getNbAction() + '}';
    }

}
