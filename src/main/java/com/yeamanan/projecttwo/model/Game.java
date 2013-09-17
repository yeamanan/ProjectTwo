package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.mission.Mission;

/**
 * Game class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Game {

    /**
     * Mission of the game.
     */
    private Mission mission;

    /**
     * Constructor.
     */
    public Game() {
        this.mission = new Mission();
    }

    /**
     * getMission() method.
     *
     * @return the mission of the game
     */
    public final Mission getMission() {
        return this.mission;
    }

    /**
     * setMission() method.
     *
     * @param argMission the new mission of the game
     */
    public final void setMission(final Mission argMission) {
        this.mission = argMission;
    }

}
