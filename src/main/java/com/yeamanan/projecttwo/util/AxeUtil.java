package com.yeamanan.projecttwo.util;

import com.yeamanan.projecttwo.model.rule.Axe;
import com.yeamanan.projecttwo.model.rule.Constants;

/**
 * AxeUtil class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public final class AxeUtil {

    /**
     * treatAxe() method.
     * @param sAxe the tile's axe to treat
     */
    public final static Axe treatAxe(final String sAxe) {
        Axe axe;
        switch (sAxe) {
            case Constants.NORTH_SHORT_CODE :
                axe = Axe.NORTH;
                break;
            case Constants.EAST_SHORT_CODE :
                axe = Axe.EAST;
                break;
            case Constants.SOUTH_SHORT_CODE :
                axe = Axe.SOUTH;
                break;
            case Constants.WEST_SHORT_CODE :
                axe = Axe.WEST;
                break;
            default :
                axe = Axe.NORTH;
                break;
        }
        return axe;
    }

}
