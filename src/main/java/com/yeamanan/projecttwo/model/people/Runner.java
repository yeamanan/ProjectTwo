package com.yeamanan.projecttwo.model.people;

import com.yeamanan.projecttwo.model.rule.Constants;

/**
 * Runner class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
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
