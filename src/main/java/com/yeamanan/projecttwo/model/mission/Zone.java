package com.yeamanan.projecttwo.model.mission;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Abomination;
import com.yeamanan.projecttwo.model.character.Fatty;
import com.yeamanan.projecttwo.model.character.Runner;
import com.yeamanan.projecttwo.model.character.Walker;
import com.yeamanan.projecttwo.model.token.Door;
import com.yeamanan.projecttwo.model.token.Exit;
import com.yeamanan.projecttwo.model.token.Noise;
import com.yeamanan.projecttwo.model.token.Objective;
import com.yeamanan.projecttwo.model.token.Pimpmobile;
import com.yeamanan.projecttwo.model.token.PoliceCar;
import com.yeamanan.projecttwo.model.token.Start;
import com.yeamanan.projecttwo.model.token.ZombieSpawn;
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
 * Zone class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Zone")
@XmlRootElement(name = "Zone")
@XmlAccessorType(XmlAccessType.FIELD)
public class Zone {

    /**
     * Id.
     */
    @XmlAttribute(name = "id", required = true)
    private int id;

    /**
     * X.
     */
    @XmlAttribute(name = "x", required = true)
    private double x;

    /**
     * Y.
     */
    @XmlAttribute(name = "y", required = true)
    private double y;

    /**
     * Width.
     */
    @XmlAttribute(name = "width", required = true)
    private double width;

    /**
     * Height.
     */
    @XmlAttribute(name = "height", required = true)
    private double height;

    /**
     * List of elements in the zone.
     */
    @XmlElementWrapper(name = "Elements", required = false)
    @XmlElements({
        @XmlElement(name = "Walker", type = Walker.class),
        @XmlElement(name = "Fatty", type = Fatty.class),
        @XmlElement(name = "Runner", type = Runner.class),
        @XmlElement(name = "Abomination", type = Abomination.class),
        @XmlElement(name = "Door", type = Door.class),
        @XmlElement(name = "Exit", type = Exit.class),
        @XmlElement(name = "Noise", type = Noise.class),
        @XmlElement(name = "Objective", type = Objective.class),
        @XmlElement(name = "Pimpmobile", type = Pimpmobile.class),
        @XmlElement(name = "PoliceCar", type = PoliceCar.class),
        @XmlElement(name = "Start", type = Start.class),
        @XmlElement(name = "ZombieSpawn", type = ZombieSpawn.class)
    })
    private List<Element> elements;

    /**
     * Constructor.
     */
    public Zone() {
        this.id = 0;
        this.x = 0.0d;
        this.y = 0.0d;
        this.width = 0.0d;
        this.height = 0.0d;
        this.elements = new ArrayList();
    }

    /**
     * getId() method.
     *
     * @return the id of the zone
     */
    public final int getId() {
        return this.id;
    }

    /**
     * setId() method.
     *
     * @param argId the new id of the zone
     */
    public final void setId(final int argId) {
        this.id = argId;
    }

    /**
     * getX() method.
     *
     * @return the x position of the zone
     */
    public final double getX() {
        return this.x;
    }

    /**
     * setX() method.
     *
     * @param argX the new x position of the zone
     */
    public final void setX(final double argX) {
        this.x = argX;
    }

    /**
     * getY() method.
     *
     * @return the y position of the zone
     */
    public final double getY() {
        return this.y;
    }

    /**
     * setY() method.
     *
     * @param argY the new y position of the zone
     */
    public final void setY(final double argY) {
        this.y = argY;
    }

    /**
     * getWidth() method.
     *
     * @return the width of the zone
     */
    public final double getWidth() {
        return this.width;
    }

    /**
     * setWidth() method.
     *
     * @param argWidth the new width of the zone
     */
    public void setWidth(final double argWidth) {
        this.width = argWidth;
    }

    /**
     * getHeight() method.
     *
     * @return the height of the zone
     */
    public final double getHeight() {
        return this.height;
    }

    /**
     * setHeight() method.
     *
     * @param argHeight the new height of the zone
     */
    public void setHeight(final double argHeight) {
        this.height = argHeight;
    }

    /**
     * getElements() method.
     *
     * @return a list of elements
     */
    public final List<Element> getElements() {
        return this.elements;
    }

    /**
     * setElements() method.
     *
     * @param argElements the new list of elements
     */
    public final void setElements(final List<Element> argElements) {
        this.elements = argElements;
    }

}
