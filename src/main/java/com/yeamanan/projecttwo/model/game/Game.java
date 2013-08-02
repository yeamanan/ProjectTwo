package com.yeamanan.projecttwo.model.game;

/**
 * Board class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Game {

    /**
     * Board of the game.
     */
    private Board board;

    private int turn;

    /**
     * Constructor.
     */
    public Game() {
        this.board = new Board();
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
     * @param board the new board of the game
     */
    public final void setBoard(final Board board) {
        this.board = board;
    }

}
