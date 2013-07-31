package com.yeamanan.projecttwo.bean.people;

/**
 * Walker class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Walker extends Zombie {

    /**
     * Constructor.
     */
    public Walker() {
        super();
    }

    /**
     * toString() method.
     *
     * @return the walker in string format
     */
    @Override
    public String toString() {
        return "Walker{" + "nbAction=" + this.nbAction + '}';
    }

}
