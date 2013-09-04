package com.yeamanan.projecttwo.model;

import com.yeamanan.projecttwo.model.stuff.Mission;
import com.yeamanan.projecttwo.model.people.Survivor;
import java.util.ArrayList;
import java.util.List;

/**
 * Board class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class Game {

    /**
     * Mission of the game.
     */
    private Mission mission;

    /**
     * List of survivors.
     */
    private List<Survivor> survivors;

    /**
     * Board of the game.
     */
    private Board board;

//    private int turn;

    /**
     * Constructor.
     */
    public Game() {
        this.mission = new Mission();
        this.survivors = new ArrayList<>();
        this.board = new Board();
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
     * @param argMission the new board of the game
     */
    public final void setMission(final Mission argMission) {
        this.mission = argMission;
    }

    /**
     * getSurvivors() method.
     *
     * @return the survivors list of the game
     */
    public final List<Survivor> getSurvivors() {
        return this.survivors;
    }

    /**
     * setSurvivors() method.
     *
     * @param argSurvivors the new survivors list of the game
     */
    public final void setSurvivors(final List<Survivor> argSurvivors) {
        this.survivors = argSurvivors;
    }

    /**
     * getBoard() method.
     *
     * @return the board of the game
     */
    public final Board getBoard() {
        return this.board;
    }

    /**
     * setBoard() method.
     *
     * @param argBoard the new board of the game
     */
    public final void setBoard(final Board argBoard) {
        this.board = argBoard;
    }

}
