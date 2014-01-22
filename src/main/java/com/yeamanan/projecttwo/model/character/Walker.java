package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Walker class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Walker.XML_NAME)
@XmlRootElement(name = Walker.XML_NAME)
public class Walker extends Zombie {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "Walker";

    /**
     * Constructor.
     */
    public Walker() {
        super(ZombieType.WALKER);
    }

}
