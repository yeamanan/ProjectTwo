package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Wounded class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Wounded")
@XmlRootElement(name = "Wounded")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wounded extends Card {

    /**
     * Name of a wounded card.
     */
    private static final String NAME = "Wounded";

    /**
     * Constructor.
     */
    public Wounded() {
        super(NAME);
    }

}
