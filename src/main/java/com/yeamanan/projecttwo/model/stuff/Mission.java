package com.yeamanan.projecttwo.model.stuff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Mission class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Mission")
public class Mission {

    /**
     * Id of the mission.
     */
    @XmlElement(name = "Id", required = true)
    private String id;

    /**
     * Name of the mission.
     */
    @XmlElement(name = "Name", required = true)
    private String name;

    /**
     * Board of the mission.
     */
    @XmlElement(name = "Tiles", required = true)
    private Tiles board;

    /**
     * Constructor.
     */
    public Mission() {
        this.id = "";
        this.name = "";
        this.board = new Tiles();
    }

    /**
     * getId() method.
     *
     * @return the id of the mission
     */
    public final String getId() {
        return this.id;
    }

    /**
     * setId() method.
     *
     * @param argId the new id of the mission
     */
    public final void setId(final String argId) {
        this.id = argId;
    }

    /**
     * getName() method.
     *
     * @return the name of the mission
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the mission
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * getBoard() method.
     *
     * @return the board of the mission
     */
    public final Tiles getBoard() {
        return this.board;
    }

    /**
     * setBoard() method.
     *
     * @param argBoard the new board of the mission
     */
    public final void setBoard(final Tiles argBoard) {
        this.board = argBoard;
    }

    /**
     * toString() method.
     *
     * @return the mission in String format
     */
    @Override
    public final String toString() {
        String str = "Mission{" + "id=" + this.id + ", name=" + this.name;
        str += ", board=[";
        for(TileRow row : board.getRows()) {
            str += "[";
            for(Tile tile : row.getTiles()) {
                str += tile.toString();
            }
            str += "]";
        }
        return str + "]}";
    }

}
