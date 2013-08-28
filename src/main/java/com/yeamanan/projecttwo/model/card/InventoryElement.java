package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlTransient;

/**
 * InventoryElement class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlTransient
public class InventoryElement extends Card {

    /**
     * Constructor.
     */
    public InventoryElement() {
        this("");
    }

    /**
     * Constructor.
     *
     * @param argName the name of the inventory card
     */
    public InventoryElement(final String argName) {
        super(argName);
    }

}
