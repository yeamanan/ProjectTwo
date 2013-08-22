package com.yeamanan.projecttwo.model.game;

import com.yeamanan.projecttwo.model.rule.Token;
import com.yeamanan.projecttwo.model.people.Character;
import java.util.ArrayList;
import java.util.List;

/**
 * Zone class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Zone {

    /**
     * List of tokens in the zone.
     */
    private List<Token> tokens;

    /**
     * List of survivors in the zone.
     */
    private List<Character> survivors;

    /**
     * List of zombies in the zone.
     */
    private List<Character> zombies;

    /**
     * Constructor.
     */
    public Zone() {
        this.tokens = new ArrayList<>();
        this.survivors = new ArrayList<>();
        this.zombies = new ArrayList<>();
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
    public final List<Character> getSurvivors() {
        return this.survivors;
    }

    /**
     * setSurvivors() method.
     *
     * @param argSurvivors the new list of survivors in the zone
     */
    public final void setSurvivors(final List<Character> argSurvivors) {
        this.survivors = argSurvivors;
    }

    /**
     * getZombies() method.
     *
     * @return the list of zombies in the zone
     */
    public final List<Character> getZombies() {
        return this.zombies;
    }

    /**
     * setZombies() method.
     *
     * @param argZombies the new list of survivors in the zone
     */
    public final void setZombies(final List<Character> argZombies) {
        this.zombies = argZombies;
    }

}
