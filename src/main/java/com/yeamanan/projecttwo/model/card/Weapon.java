package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Weapon class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Weapon")
@XmlRootElement(name = "Weapon")
@XmlAccessorType(XmlAccessType.FIELD)
public class Weapon extends Equipment {

    /**
     * Can this weapon open door ?
     */
    @XmlElement(name = "DoorOpener", required = false)
    private boolean doorOpener;

    /**
     * Is the weapon dual ?
     */
    @XmlElement(name = "DualWeapon", required = false)
    private boolean dualWeapon;

    /**
     * Is the weapon need to be reloaded after use ?
     */
    @XmlElement(name = "ReloadWeapon", required = false)
    private boolean reloadWeapon;

    /**
     * Is the weapon noisy when open a door ?
     */
    @XmlElement(name = "NoisyOpener", required = false)
    private boolean noisyOpener;

    /**
     * Is the weapon noisy when attack a zombie ?
     */
    @XmlElement(name = "NoisyAttacker", required = false)
    private boolean noisyAttacker;

    /**
     * Minimum range of the weapon.
     */
    @XmlElement(name = "MinimumRange", required = false)
    private int minRange;

    /**
     * Maximum range of the weapon.
     */
    @XmlElement(name = "MaximumRange", required = false)
    private int maxRange;

    /**
     * Number dice to roll.
     */
    @XmlElement(name = "NumberOfDice", required = false)
    private int numberOfDice;

    /**
     * Accuracy for a success dice result.
     */
    @XmlElement(name = "Accuracy", required = false)
    private int accuracy;

    /**
     * Damage of the weapon.
     */
    @XmlElement(name = "Damage", required = false)
    private int damage;

    /**
     * Constructor.
     */
    public Weapon() {
        this("");
    }

    /**
     * Constructor.
     *
     * @param argName the name of the equipment card
     */
    public Weapon(final String argName) {
        super(argName);
        this.doorOpener = false;
        this.dualWeapon = false;
        this.reloadWeapon = false;
        this.noisyOpener = false;
        this.noisyAttacker = false;
        this.minRange = 0;
        this.maxRange = 0;
        this.numberOfDice = 0;
        this.accuracy = 0;
        this.damage = 0;
    }

    /**
     * isDoorOpener() method.
     *
     * @return a boolean
     */
    public final boolean isDoorOpener() {
        return this.doorOpener;
    }

    /**
     * setDoorOpener() method.
     *
     * @param argDoorOpener the new door opener value
     */
    public final void setDoorOpener(final boolean argDoorOpener) {
        this.doorOpener = argDoorOpener;
    }

    /**
     * isDualWeapon() method.
     *
     * @return a boolean
     */
    public final boolean isDualWeapon() {
        return this.dualWeapon;
    }

    /**
     * setDualWeapon() method.
     *
     * @param argDualWeapon the new dual weapon value
     */
    public final void setDualWeapon(final boolean argDualWeapon) {
        this.dualWeapon = argDualWeapon;
    }

    /**
     * isReloadWeapon() method.
     *
     * @return a boolean
     */
    public final boolean isReloadWeapon() {
        return reloadWeapon;
    }

    /**
     * setReloadWeapon() method.
     *
     * @param argReloadWeapon the new reload weapon value
     */
    public final void setReloadWeapon(final boolean argReloadWeapon) {
        this.reloadWeapon = argReloadWeapon;
    }

    /**
     * isNoisyOpener() method.
     *
     * @return a boolean
     */
    public final boolean isNoisyOpener() {
        return noisyOpener;
    }

    /**
     * setNoisyOpener() method.
     *
     * @param argNoisyOpener the new noisy opener value
     */
    public final void setNoisyOpener(final boolean argNoisyOpener) {
        this.noisyOpener = argNoisyOpener;
    }

    /**
     * isNoisyAttacker() method.
     *
     * @return a boolean
     */
    public final boolean isNoisyAttacker() {
        return noisyAttacker;
    }

    /**
     * setNoisyAttacker() method.
     *
     * @param argNoisyAttacker the new noisy attacker value
     */
    public final void setNoisyAttacker(final boolean argNoisyAttacker) {
        this.noisyAttacker = argNoisyAttacker;
    }

    /**
     * getMinRange() method.
     *
     * @return the minimum range of the weapon
     */
    public final int getMinRange() {
        return this.minRange;
    }

    /**
     * setMinRange() method.
     *
     * @param argMinRange the new mininum range of the weapon
     */
    public final void setMinRange(final int argMinRange) {
        this.minRange = argMinRange;
    }

    /**
     * getMaxRange() method.
     *
     * @return the maximum range of the weapon
     */
    public final int getMaxRange() {
        return this.maxRange;
    }

    /**
     * setMaxRange() method.
     *
     * @param argMaxRange the new maximum range of the weapon
     */
    public final void setMaxRange(final int argMaxRange) {
        this.maxRange = argMaxRange;
    }

    /**
     * getNumberOfDice() method.
     *
     * @return the number of dice to roll when using the weapon
     */
    public final int getNumberOfDice() {
        return this.numberOfDice;
    }

    /**
     * setNumberOfDice() method.
     *
     * @param argNumberOfDice the new number of dice when using the weapon
     */
    public final void setNumberOfDice(final int argNumberOfDice) {
        this.numberOfDice = argNumberOfDice;
    }

    /**
     * getAccuracy() method.
     *
     * @return the accuracy needed for the weapon
     */
    public final int getAccuracy() {
        return this.accuracy;
    }

    /**
     * setAccuracy() method.
     *
     * @param argAccuracy the new accuracy needed for the weapon
     */
    public final void setAccuracy(final int argAccuracy) {
        this.accuracy = argAccuracy;
    }

    /**
     * getDamage() method.
     *
     * @return the damage of the weapon
     */
    public final int getDamage() {
        return this.damage;
    }

    /**
     * setDamage() method.
     *
     * @param argDamage the new damage of the weapon
     */
    public final void setDamage(final int argDamage) {
        this.damage = argDamage;
    }

}
