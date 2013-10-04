package com.yeamanan.projecttwo.model.mission;

import com.yeamanan.projecttwo.model.Element;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Mission class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
@XmlType(name = "Mission")
@XmlRootElement(name = "Mission")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mission extends Element {

    /**
     * Id of the mission.
     */
    @XmlElement(name = "Id", required = true)
    private String id;

    /**
     * Name of the mission.
     */
    @XmlElement(name = "Name", required = true)
    private String name;

    /**
     * Tiles of the mission.
     */
    @XmlElementWrapper(name = "Tiles", required = false)
    @XmlElements({
        @XmlElement(name = "Tile", type = Tile.class)
    })
    private List<Tile> tiles;

    /**
     * Board of the mission.
     */
    @XmlElementWrapper(name = "Zones", required = false)
    @XmlElements({
        @XmlElement(name = "Zone", type = Zone.class),
        @XmlElement(name = "Building", type = Building.class),
        @XmlElement(name = "Street", type = Street.class)
    })
    private List<Zone> zones;

    /**
     * Constructor.
     */
    public Mission() {
        this.id = "";
        this.name = "";
        this.tiles = new ArrayList<>();
        this.zones = new ArrayList<>();
    }

    /**
     * getId() method.
     *
     * @return the id of the mission
     */
    public final String getId() {
        return this.id;
    }

    /**
     * setId() method.
     *
     * @param argId the new id of the mission
     */
    public final void setId(final String argId) {
        this.id = argId;
    }

    /**
     * getName() method.
     *
     * @return the name of the mission
     */
    public final String getName() {
        return this.name;
    }

    /**
     * setName() method.
     *
     * @param argName the new name of the mission
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * getTiles() method.
     *
     * @return the list of tiles of the mission
     */
    public final List<Tile> getTiles() {
        return this.tiles;
    }

    /**
     * setTiles() method.
     *
     * @param argTiles the new list of tiles of the mission
     */
    public final void setTiles(final List<Tile> argTiles) {
        this.tiles = argTiles;
    }

    /**
     * getZones() method.
     *
     * @return a list of zone representing the board
     */
    public final List<Zone> getZones() {
        return zones;
    }

    /**
     * setZones() method.
     *
     * @param argZones a new list of zone representing the board
     */
    public final void setBoard(final List<Zone> argZones) {
        this.zones = argZones;
    }

    /**
     * toString() method.
     *
     * @return the mission in String format
     */
    @Override
    public final String toString() {
        String str = "Mission{" + "id=" + this.id + ", name=" + this.name;
        str += ", board=[";
        for (Tile tile : tiles) {
            str += tile.toString();
        }
        return str + "]}";
    }

}
