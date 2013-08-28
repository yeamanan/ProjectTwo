package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlTransient;

/**
 * InventoryCard class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlTransient
public class InventoryCard extends Card {

    /**
     * Constructor.
     */
    public InventoryCard() {
        this("");
    }

    /**
     * Constructor.
     *
     * @param argName the name of the inventory card
     */
    public InventoryCard(final String argName) {
        super(argName);
    }

}
