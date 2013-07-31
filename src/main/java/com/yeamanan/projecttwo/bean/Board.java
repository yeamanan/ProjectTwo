package com.yeamanan.projecttwo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Board class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Board {

    private Zone startZone;

    Board() {
        this.startZone = new Zone();
    }

    public Zone getStartZone() {
        return this.startZone;
    }

    public void setStartZone(Zone argStartZone) {
        this.startZone = argStartZone;
    }

}
