package com.yeamanan.projecttwo.model.stuff;

import com.yeamanan.projecttwo.model.Token;
import com.yeamanan.projecttwo.model.people.Survivor;
import com.yeamanan.projecttwo.model.people.Zombie;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Zone class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="")
@XmlRootElement(name = "Zone")
public class Zone {

    /**
     * Id.
     */
    @XmlAttribute(name = "id", required = true)
    private int id;

    /**
     * outdoor zones.
     */
    @XmlAttribute(name = "outdoor", required = false)
    private boolean outdoorZone;

    /**
     * List of tokens in the zone.
     */
    @XmlTransient
    private List<Token> tokens;

    /**
     * List of survivors in the zone.
     */
    @XmlTransient
    private List<Survivor> survivors;

    /**
     * List of zombies in the zone.
     */
    @XmlTransient
    private List<Zombie> zombies;

    /**
     * Constructor.
     */
    public Zone() {
        this.id = 0;
        this.outdoorZone = false;
        this.tokens = new ArrayList<>();
        this.survivors = new ArrayList<>();
        this.zombies = new ArrayList<>();
    }

    /**
     * getId() method.
     *
     * @return the id of the zone
     */
    public int getId() {
        return id;
    }

    /**
     * setId() method.
     *
     * @param argId the new id of the zone
     */
    public void setId(int argId) {
        this.id = argId;
    }

    /**
     * isOutdoorZone() method.
     *
     * @return a boolean
     */
    public boolean isOutdoorZone() {
        return outdoorZone;
    }

    /**
     * setOutdoorZone() method.
     *
     * @param argOutdoorZone the new value of the outdoor zone
     */
    public void setOutdoorZone(boolean argOutdoorZone) {
        this.outdoorZone = argOutdoorZone;
    }

    /**
     * getTokens() method.
     *
     * @return the list of tokens in the zone
     */
    public final List<Token> getTokens() {
        return this.tokens;
    }

    /**
     * setTokens() method.
     *
     * @param argTokens the new list of tokens in the zone
     */
    public final void setTokens(final List<Token> argTokens) {
        this.tokens = argTokens;
    }

    /**
     * getSurvivors() method.
     *
     * @return the list of survivors in the zone
     */
    public final List<Survivor> getSurvivors() {
        return this.survivors;
    }

    /**
     * setSurvivors() method.
     *
     * @param argSurvivors the new list of survivors in the zone
     */
    public final void setSurvivors(final List<Survivor> argSurvivors) {
        this.survivors = argSurvivors;
    }

    /**
     * getZombies() method.
     *
     * @return the list of zombies in the zone
     */
    public final List<Zombie> getZombies() {
        return this.zombies;
    }

    /**
     * setZombies() method.
     *
     * @param argZombies the new list of survivors in the zone
     */
    public final void setZombies(final List<Zombie> argZombies) {
        this.zombies = argZombies;
    }

}
