package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.*;

/**
 * Card class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlTransient
public class Card {

    /**
     * Name of the card.
     */
    @XmlAttribute(name = "name", required = true)
    private String name;

    /**
     * Constructor.
     */
    Card() {
        name = "";
    }

    /**
     * Constructor.
     *
     * @param argName the new name of the card
     */
    Card(final String argName) {
        name = argName;
    }

    /**
     * getName() method.
     *
     * @return the name of the card
     */
    public final String getName() {
        return name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the card
     */
    public final void setName(final String argName) {
        name = argName;
    }

}
