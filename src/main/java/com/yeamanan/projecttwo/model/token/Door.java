package com.yeamanan.projecttwo.model.token;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Door class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Door")
@XmlRootElement(name = "Door")
public class Door extends ColoredToken {

    @XmlAttribute(name = "open", required = false)
    private boolean open;

    public Door() {
        this.open = false;
    }

    public final boolean isOpen() {
        return this.open;
    }

    public final void setOpen(final boolean argOpen) {
        this.open = argOpen;
    }

}
