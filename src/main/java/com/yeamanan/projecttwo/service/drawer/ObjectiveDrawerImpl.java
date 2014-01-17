package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.token.Objective;
//import org.apache.log4j.Logger;

/**
 * ObjectiveDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ObjectiveDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
//    private static final Logger LOG = Logger.getLogger(ObjectiveDrawerImpl.class);

    @Override
    protected final String buildFileName(final Element argElement) {
        final Objective objective = (Objective) argElement;
        String fileName = objective.getClass().getSimpleName();
        fileName += "_" + objective.getColor().getName();
        return  fileName;
    }

}
