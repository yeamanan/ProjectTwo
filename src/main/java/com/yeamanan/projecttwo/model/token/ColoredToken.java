package com.yeamanan.projecttwo.model.token;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 * ColoredToken class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlTransient
@XmlAccessorType(XmlAccessType.FIELD)
public class ColoredToken extends Token {

    private static final Color DEFAULT_COLOR = Color.RED;

    /**
     * Color of token.
     */
    @XmlAttribute(name = "color", required = false)
    private Color color;

    /**
     * Constructor.
     */
    ColoredToken() {
        this(DEFAULT_COLOR);
    }

    /**
     * Constructor.
     *
     * @param argColor the new color of the token
     */
    private ColoredToken(final Color argColor) {
        super();
        this.color = argColor;
    }

    /**
     * getColor() method.
     *
     * @return the color of the token
     */
    public final Color getColor() {
        return color;
    }

    /**
     * setColor() method.
     *
     * @param argColor the new color of the token
     */
    public final void setColor(final Color argColor) {
        this.color = argColor;
    }

}
