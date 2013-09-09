package com.yeamanan.projecttwo.model.mission;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * TileRow class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "")
public class TileRow {

    /**
     * Tiles.
     */
    private List<Tile> tiles;

    /**
     * Constructor.
     */
    public TileRow() {
        this.tiles = new ArrayList();
    }

    /**
     * getTiles() method.
     *
     * @return a list of tiles
     */
    @XmlElement(name = "Tile", required = true)
    public final List<Tile> getTiles() {
        return this.tiles;
    }

    /**
     * setTiles() method.
     *
     * @param argTiles the new list of tiles
     */
    public final void setTiles(final List<Tile> argTiles) {
        this.tiles = argTiles;
    }

}
