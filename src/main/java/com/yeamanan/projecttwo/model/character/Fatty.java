package com.yeamanan.projecttwo.model.character;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Fatty class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = Fatty.NAME)
@XmlRootElement(name = Fatty.NAME)
public class Fatty extends Zombie {

    protected static final String NAME = "Fatty";

}
