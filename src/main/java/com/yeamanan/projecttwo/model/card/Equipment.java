package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Equipment class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Equipment.NAME)
@XmlRootElement(name = Equipment.NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class Equipment extends Card {

    protected static final String NAME = "Equipment";

    /**
     * Constructor.
     */
    public Equipment() {
        super(NAME);
    }

    /**
     * Constructor.
     *
     * @param argName the name of the equipment
     */
    public Equipment(final String argName) {
        super(argName);
    }

}
