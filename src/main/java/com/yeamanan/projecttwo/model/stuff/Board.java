/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeamanan.projecttwo.model.stuff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Board class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name="")
public class Board {

    private List<Row> rows;

    public Board() {
        this.rows = new ArrayList<>();
    }

    @XmlElement(name = "Row", required = true)
    public List<Row> getRows(){
        return this.rows;
    }

    public void setRows(List<Row> rows){
        this.rows = rows;
    }

}
