package com.yeamanan.projecttwo.util;

import com.yeamanan.projecttwo.model.rule.Constants;
import com.yeamanan.projecttwo.model.rule.State;

/**
 * StateUtil class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public final class StateUtil {

    /**
     * Constructor.
     */
    private StateUtil() { }

    /**
     * convertToState() method.
     *
     * @param sState the zone's state to treat
     * @return the state converted from the argument
     */
    public static State convertToState(final String sState) {
        State state;
        switch (sState) {
            case Constants.OUTDOOR_SHORT_CODE :
                state = State.OUTDOOR;
                break;
            case Constants.INDOOR_SHORT_CODE :
                state = State.INDOOR;
                break;
            default :
                state = State.OUTDOOR;
                break;
        }
        return state;
    }

}
