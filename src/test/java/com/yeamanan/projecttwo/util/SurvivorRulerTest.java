package com.yeamanan.projecttwo.util;

import com.yeamanan.projecttwo.model.character.*;
import com.yeamanan.projecttwo.service.ruler.SurvivorRuler;
import com.yeamanan.projecttwo.service.ruler.SurvivorRulerImpl;
import junit.framework.TestCase;
import org.junit.Test;

public class SurvivorRulerTest extends TestCase {

    private final SurvivorRuler ruler;

    public SurvivorRulerTest() {
        ruler = new SurvivorRulerImpl();
    }

    @Test
    public void testExperienceEarnedWhenSurvivorKillWalker() {
        final Survivor survivor = new Survivor();
        final Zombie zombie = new Zombie();
        ruler.killZombie(survivor, zombie);
        assertEquals(1, survivor.getExperience());
    }

    @Test
    public void testExperienceEarnedWhenSurvivorKillFatty() {
        final Survivor survivor = new Survivor();
        final Zombie zombie = new Zombie(ZombieType.FATTY);
        ruler.killZombie(survivor, zombie);
        assertEquals(1, survivor.getExperience());
    }

    @Test
    public void testExperienceEarnedWhenSurvivorKillRunner() {
        final Survivor survivor = new Survivor();
        final Zombie zombie = new Zombie(ZombieType.RUNNER);
        ruler.killZombie(survivor, zombie);
        assertEquals(1, survivor.getExperience());
    }

    @Test
    public void testExperienceEarnedWhenSurvivorKillAbomination() {
        final Survivor survivor = new Survivor();
        final Zombie zombie = new Zombie(ZombieType.ABOMINATION);
        ruler.killZombie(survivor, zombie);
        assertEquals(5, survivor.getExperience());
    }

    @Test
    public void testExperienceEarnedWhenSurvivorKillZombieDog() {
        final Survivor survivor = new Survivor();
        final Zombie zombie = new Zombie(ZombieType.ZOMBIE_DOG);
        ruler.killZombie(survivor, zombie);
        assertEquals(1, survivor.getExperience());
    }

    @Test
    public void testLevel() {

    }
}
