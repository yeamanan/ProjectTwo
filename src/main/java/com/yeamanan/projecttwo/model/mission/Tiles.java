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
@XmlType(name = "")
public class Tiles {

    /**
     * Rows.
     */
    private List<TileRow> rows;

    /**
     * Constructor.
     */
    public Tiles() {
        this.rows = new ArrayList();
    }

    /**
     * getRows() method.
     *
     * @return a list of tile rows
     */
    @XmlElement(name = "Row", required = true)
    public final List<TileRow> getRows() {
        return this.rows;
    }

    /**
     * setRows() method.
     *
     * @param argRows the new list of tile rows
     */
    public final void setRows(final List<TileRow> argRows) {
        this.rows = argRows;
    }

}
