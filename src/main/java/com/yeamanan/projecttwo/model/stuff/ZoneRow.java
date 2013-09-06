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
public class ZoneRow {

    private List<Tile> tiles;

    public ZoneRow() {
        this.tiles = new ArrayList<>();
    }

    @XmlElement(name = "Zone", required = true)
    public List<Tile> getTiles(){
        return this.tiles;
    }

    public void setTiles(List<Tile> tiles){
        this.tiles = tiles;
    }

}
