package com.yeamanan.projecttwo.model.people;

import com.yeamanan.projecttwo.model.Constants;
import com.yeamanan.projecttwo.model.people.Zombie;

/**
 * Runner class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Runner extends Zombie {

    /**
     * Constructor.
     */
    public Runner() {
        super(Constants.RUNNER_ACTION);
    }

    /**
     * toString() method.
     *
     * @return the walker in string format
     */
    @Override
    public final String toString() {
        return "Runner{" + "nbAction=" + this.nbAction + '}';
    }

}