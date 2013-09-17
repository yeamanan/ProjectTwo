package com.yeamanan.projecttwo.model;

/**
 * Box class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Box {

    /**
     * Name of the box.
     */
    private String name;

    /**
     * Constructor.
     */
    public Box() {
        this.name = "";
    }

    /**
     * getName() method.
     *
     * @return the name of the box
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the box
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

}
