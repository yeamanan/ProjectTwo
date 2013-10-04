package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Zombie;
import org.apache.log4j.Logger;

/**
 * ZombieDrawerImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class ZombieDrawerImpl extends ImageDrawerImpl {

    /**
     * Logger.
     */
    private static final Logger LOG = Logger.getLogger(ZombieDrawerImpl.class);

    @Override
    public String buildFileName(final Element argElement) {
        final Zombie zombie = (Zombie) argElement;
        String fileName = "Zombie";
        fileName += "_" + zombie.getClass().getSimpleName();
//        if (zombie.isToxic()) {
//            fileName += "_Toxic";
//        }
//        if (zombie.isBerserk()) {
//            fileName += "_Berserk";
//        }
        return  fileName;
    }

}
