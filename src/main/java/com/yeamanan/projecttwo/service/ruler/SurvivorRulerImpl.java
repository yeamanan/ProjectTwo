package com.yeamanan.projecttwo.service.ruler;

import com.yeamanan.projecttwo.model.character.Level;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.character.Zombie;

public class SurvivorRulerImpl implements SurvivorRuler {

    public void killZombie(final Survivor argSurvivor, final Zombie argZombie) {
        argSurvivor.setExperience(argSurvivor.getExperience() + argZombie.getType().getExperienceGiven());
    }

    public void checkSurvivorLevel(final Survivor argSurvivor) {
        if(argSurvivor.getExperience() >= Level.RED.getMinimumExperience()) {
            argSurvivor.setLevel(Level.RED);
        } else if(argSurvivor.getExperience() >= Level.ORANGE.getMinimumExperience()) {
            argSurvivor.setLevel(Level.ORANGE);
        } else if(argSurvivor.getExperience() >= Level.YELLOW.getMinimumExperience()) {
            argSurvivor.setLevel(Level.YELLOW);
        }
    }
}
