package com.yeamanan.projecttwo.model.token;

/**
 * Color enum.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public enum Color {

    /**
     * Red color.
     */
    RED("Red"),

    /**
     * Blue color.
     */
    BLUE("Blue"),

    /**
     * Green color.
     */
    GREEN("Green");
    
    private String name;
    
    private Color(final String argName) {
        this.name = argName;
    }
    
    public final String getName() {
        return this.name;
    }

}
