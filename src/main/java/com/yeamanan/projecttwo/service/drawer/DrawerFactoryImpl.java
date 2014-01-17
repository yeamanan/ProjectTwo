package com.yeamanan.projecttwo.service.drawer;

import com.yeamanan.projecttwo.model.Element;
import com.yeamanan.projecttwo.model.character.Abomination;
import com.yeamanan.projecttwo.model.character.Fatty;
import com.yeamanan.projecttwo.model.character.Runner;
import com.yeamanan.projecttwo.model.character.Survivor;
import com.yeamanan.projecttwo.model.character.Walker;
//import com.yeamanan.projecttwo.model.mission.Mission;
//import com.yeamanan.projecttwo.model.mission.Tile;
//import com.yeamanan.projecttwo.model.mission.Zone;
import com.yeamanan.projecttwo.model.token.Door;
import com.yeamanan.projecttwo.model.token.Objective;
import com.yeamanan.projecttwo.model.token.Start;
import com.yeamanan.projecttwo.model.token.Spawn;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * DrawerFactoryImpl class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class DrawerFactoryImpl implements Drawer {

    private final transient Map<Class, Drawer> drawers;

    /**
     * Constructor.
     */
    public DrawerFactoryImpl() {
        drawers = new HashMap<>();
//        drawers.put(Mission.class, new MissionDrawerImpl());
//        drawers.put(Tile.class, new TileDrawerImpl());
//        drawers.put(Zone.class, new ZoneDrawerImpl());
        drawers.put(Start.class, new ImageDrawerImpl());
        drawers.put(Door.class, new DoorDrawerImpl());
        drawers.put(Objective.class, new ObjectiveDrawerImpl());
        drawers.put(Spawn.class, new SpawnDrawerImpl());
        drawers.put(Survivor.class, new SurvivorDrawerImpl());
        drawers.put(Walker.class, new ZombieDrawerImpl());
        drawers.put(Fatty.class, new ZombieDrawerImpl());
        drawers.put(Runner.class, new ZombieDrawerImpl());
        drawers.put(Abomination.class, new ZombieDrawerImpl());
    }

    /**
     * draw() method.
     *
     * @param argElement the element to draw
     * @param argParent the parent to set for the returning node
     * @return the node representing the T object
     */
    @Override
    public final Node draw(final Element argElement, final Pane argParent) {
        final Class aClass = argElement.getClass();
        return drawers.get(aClass).draw(argElement, argParent);
    }

}
