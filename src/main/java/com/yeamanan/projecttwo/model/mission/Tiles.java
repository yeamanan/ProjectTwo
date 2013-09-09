package com.yeamanan.projecttwo.model.mission;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tiles class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name="")
public class Tiles {

    private List<TileRow> rows;

    public Tiles() {
        this.rows = new ArrayList<>();
    }

    @XmlElement(name = "Row", required = true)
    public List<TileRow> getRows(){
        return this.rows;
    }

    public void setRows(List<TileRow> rows){
        this.rows = rows;
    }

}
