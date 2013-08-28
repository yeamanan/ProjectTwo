package com.yeamanan.projecttwo.model.card;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * EquipmentCard class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EquipmentCard")
public class EquipmentCard extends InventoryCard {

    /**
     * Is the equipment a weapon ?
     */
    @XmlElement(name = "Weapon", required = false)
    private boolean weapon;

    /**
     * Is the equipment a dual weapon ?
     */
    @XmlElement(name = "Dual", required = false)
    private boolean dual;

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
     * Can this weapon open door ?
     */
    @XmlElement(name = "OpenDoor", required = false)
    private boolean openDoor;

    /**
     * Do this weapon produce noise when open door ?
     */
    @XmlElement(name = "DoorNoise", required = false)
    private boolean doorNoise;

    /**
     * Do this weapon produce noise when use to attack ?
     */
    @XmlElement(name = "CombatNoise", required = false)
    private boolean combatNoise;

    /**
     * Constructor.
     */
    public EquipmentCard() {
        this("");
    }

    /**
     * Constructor.
     *
     * @param argName the name of the equipment card
     */
    public EquipmentCard(final String argName) {
        super(argName);
        this.weapon = false;
        this.dual = false;
        this.minRange = 0;
        this.maxRange = 0;
        this.numberOfDice = 0;
        this.accuracy = 0;
        this.damage = 0;
        this.openDoor = false;
        this.doorNoise = false;
        this.combatNoise = false;
    }

    /**
     * isWeapon() method.
     *
     * @return a boolean
     */
    public final boolean isWeapon() {
        return weapon;
    }

    /**
     * setWeapon() method.
     *
     * @param argWeapon the new weapon value
     */
    public final void setWeapon(final boolean argWeapon) {
        this.weapon = argWeapon;
    }

    /**
     * isDual() method.
     *
     * @return a boolean
     */
    public final boolean isDual() {
        return dual;
    }

    /**
     * setDual() method.
     *
     * @param argDual the new dual value
     */
    public final void setDual(final boolean argDual) {
        this.dual = argDual;
    }

    /**
     * getMinRange() method.
     *
     * @return the minimum range of the weapon
     */
    public final int getMinRange() {
        return minRange;
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
        return maxRange;
    }

    /**
     * setMaxRange() method.
     *
     * @param argMaxRange the maximum range of the weapon
     */
    public final void setMaxRange(final int argMaxRange) {
        this.maxRange = argMaxRange;
    }

    /**
     * getNumberOfDice() method.
     *
     * @return the number of dice to roll
     */
    public final int getNumberOfDice() {
        return numberOfDice;
    }

    /**
     * setNumberOfDice() method.
     *
     * @param argNumberOfDice the new number of dice
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
        return accuracy;
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
        return damage;
    }

    /**
     * setDamage() method.
     *
     * @param argDamage the new damage of the weapon
     */
    public final void setDamage(final int argDamage) {
        this.damage = argDamage;
    }

    /**
     * isOpenDoor() method.
     *
     * @return a boolean
     */
    public final boolean isOpenDoor() {
        return openDoor;
    }

    /**
     * setOpenDoor() method.
     *
     * @param argOpenDoor the new value
     */
    public final void setOpenDoor(final boolean argOpenDoor) {
        this.openDoor = argOpenDoor;
    }

    /**
     * isDoorNoise() method.
     *
     * @return a boolean
     */
    public final boolean isDoorNoise() {
        return doorNoise;
    }

    /**
     * setDoorNoise() method.
     *
     * @param argDoorNoise the new value
     */
    public final void setDoorNoise(final boolean argDoorNoise) {
        this.doorNoise = argDoorNoise;
    }

    /**
     * isCombatNoise() method.
     *
     * @return a boolean
     */
    public final boolean isCombatNoise() {
        return combatNoise;
    }

    /**
     * setCombatNoise() method.
     *
     * @param argCombatNoise the new value
     */
    public final void setCombatNoise(final boolean argCombatNoise) {
        this.combatNoise = argCombatNoise;
    }

}
