package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Abomination class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Abomination.XML_NAME)
@XmlRootElement(name = Abomination.XML_NAME)
public class Abomination extends Zombie {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "Abomination";

    /**
     * Constructor.
     */
    public Abomination() {
        super(ZombieType.ABOMINATION);
    }

}
