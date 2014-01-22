package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Fatty class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Fatty.XML_NAME)
@XmlRootElement(name = Fatty.XML_NAME)
public class Fatty extends Zombie {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "Fatty";

    /**
     * Constructor.
     */
    public Fatty() {
        super(ZombieType.FATTY);
    }

}
