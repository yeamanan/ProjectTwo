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
 * Zones class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name="")
public class Zones {

    private List<ZoneRow> rows;

    public Zones() {
        this.rows = new ArrayList<>();
    }

    @XmlElement(name = "Row", required = true)
    public List<ZoneRow> getRows(){
        return this.rows;
    }

    public void setRows(List<ZoneRow> rows){
        this.rows = rows;
    }

}
