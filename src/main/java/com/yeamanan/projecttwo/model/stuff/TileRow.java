package com.yeamanan.projecttwo.model.stuff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * TileRow class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name="")
public class TileRow {

    private List<Tile> tiles;

    public TileRow() {
        this.tiles = new ArrayList<>();
    }

    @XmlElement(name = "Tile", required = true)
    public List<Tile> getTiles(){
        return this.tiles;
    }

    public void setTiles(List<Tile> tiles){
        this.tiles = tiles;
    }

}
