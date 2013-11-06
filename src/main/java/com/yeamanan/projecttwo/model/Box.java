package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.card.Card;
import com.yeamanan.projecttwo.model.card.Equipment;
import com.yeamanan.projecttwo.model.card.Weapon;
import com.yeamanan.projecttwo.model.card.Wounded;
import com.yeamanan.projecttwo.model.token.Spawn;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Box class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Box")
@XmlRootElement(name = "Box")
@XmlAccessorType(XmlAccessType.FIELD)
public class Box {

    /**
     * Name of the box.
     */
    @XmlAttribute(name = "name", required = true)
    private String name;

    /**
     * Cards of the box.
     */
    @XmlElementWrapper(name = "Cards", required = false)
    @XmlElements({
        @XmlElement(name = "Equipment", type = Equipment.class),
        @XmlElement(name = "Spawn", type = Spawn.class),
        @XmlElement(name = "Weapon", type = Weapon.class),
        @XmlElement(name = "Wounded", type = Wounded.class)
    })
    private List<Card> cards;

    /**
     * Constructor.
     */
    public Box() {
        this.name = "";
        this.cards = new ArrayList<>();
    }

    /**
     * getName() method.
     *
     * @return the name of the box
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the box
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    public final List<Card> getCards() {
        return cards;
    }

    public final void setCards(final List<Card> argCards) {
        this.cards = argCards;
    }

}
