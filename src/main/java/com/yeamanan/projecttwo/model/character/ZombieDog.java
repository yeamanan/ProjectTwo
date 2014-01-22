package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ZombieDog class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = ZombieDog.XML_NAME)
@XmlRootElement(name = ZombieDog.XML_NAME)
public class ZombieDog extends Zombie {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "ZombieDog";

    /**
     * Constructor.
     */
    public ZombieDog() {
        super(ZombieType.ZOMBIE_DOG);
    }

}
