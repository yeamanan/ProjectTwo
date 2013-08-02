package com.yeamanan.projecttwo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Mission class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class Mission {

    /**
     * Id of the mission.
     */
    private String id;

    /**
     * Name of the mission.
     */
    private String name;

    private List<List<Tile>> grid;

    /**
     * Constructor.
     */
    public Mission() {
        this.id = "";
        this.name = "";
        this.grid = new ArrayList<>();
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
     * getGrid() method.
     *
     * @return the grid of tiles of the mission
     */
    public final List<List<Tile>> getGrid() {
        return this.grid;
    }

    /**
     * setGrid() method.
     *
     * @param argGrid the new grid of tiles of the mission
     */
    public final void setGrid(final List<List<Tile>> argGrid) {
        this.grid = argGrid;
    }

    /**
     * toString() method.
     *
     * @return the mission in String format
     */
    @Override
    public final String toString() {
        String str = "Mission{" + "id=" + this.id + ", name=" + this.name;
        str += ", grid=[";
        for(List<Tile> row : grid) {
            str += "[";
            for(Tile tile : row) {
                str += tile.toString();
            }
            str += "]";
        }
        return str + "]}";
    }

}
