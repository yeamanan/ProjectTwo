package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Abomination class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Abomination.NAME)
@XmlRootElement(name = Abomination.NAME)
public class Abomination extends Zombie {

    /**
     * Name.
     */
    protected static final String NAME = "Abomination";

    /**
     * Experience given.
     */
    private static final int EXPERIENCE_GIVEN = 5;

}
