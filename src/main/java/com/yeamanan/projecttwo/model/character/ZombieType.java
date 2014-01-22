package com.yeamanan.projecttwo.model.character;

public enum ZombieType {

    WALKER(ZombieType.DEFAULT_NB_ACTION, ZombieType.DEFAULT_EXPERIENCE_GIVEN),

    RUNNER(ZombieType.RUNNER_NB_ACTION, ZombieType.DEFAULT_EXPERIENCE_GIVEN),

    FATTY(ZombieType.DEFAULT_NB_ACTION, ZombieType.DEFAULT_EXPERIENCE_GIVEN),

    ABOMINATION(ZombieType.DEFAULT_NB_ACTION, ZombieType.ABOMINATION_EXPERIENCE_GIVEN),

    ZOMBIE_DOG(ZombieType.ZOMBIE_DOG_NB_ACTION, ZombieType.DEFAULT_EXPERIENCE_GIVEN);

    private static final int DEFAULT_NB_ACTION = 1;

    private static final int RUNNER_NB_ACTION = 1;

    private static final int ZOMBIE_DOG_NB_ACTION = 1;

    private static final int DEFAULT_EXPERIENCE_GIVEN = 1;

    private static final int ABOMINATION_EXPERIENCE_GIVEN = 5;

    private int nbAction;

    private int experienceGiven;

    private ZombieType(final int argNbAction, final int argExperienceGiven) {
        nbAction = argNbAction;
        experienceGiven = argExperienceGiven;
    }

    public int getNbAction() {
        return nbAction;
    }

    public int getExperienceGiven() {
        return experienceGiven;
    }

}
