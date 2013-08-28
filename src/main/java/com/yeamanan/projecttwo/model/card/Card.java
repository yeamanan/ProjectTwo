package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

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
    @XmlElement(name = "Name", required = true)
    private String name;

    /**
     * Constructor.
     */
    public Card() {
        this.name = "";
    }

    /**
     * Constructor.
     *
     * @param argName the new name of the card
     */
    public Card(final String argName) {
        this.name = argName;
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
        this.name = argName;
    }

}
