package com.yeamanan.projecttwo.service.ruler;

import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.character.Zombie;

/**
 * Created by yeamanan on 20/01/2014.
 */
public interface SurvivorRuler {

    void killZombie(Survivor argSurvivor, Zombie argZombie);

    void checkSurvivorLevel(Survivor argSurvivor);

}
