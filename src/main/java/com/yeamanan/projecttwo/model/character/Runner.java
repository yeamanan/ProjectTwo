package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Runner class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Runner.XML_NAME)
@XmlRootElement(name = Runner.XML_NAME)
public class Runner extends Zombie {

    /**
     * XML name.
     */
    protected static final String XML_NAME = "Runner";

    /**
     * Constructor.
     */
    public Runner() {
        super(ZombieType.RUNNER);
    }

}
