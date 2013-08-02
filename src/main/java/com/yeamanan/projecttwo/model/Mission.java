package com.yeamanan.projecttwo.model;

/**
 * Mission class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class Mission {

    /**
     * Id of the mission.
     */
    private String id;

    /**
     * Name of the mission.
     */
    private String name;

    /**
     * Constructor.
     */
    public Mission() {
        this.id = "";
        this.name = "";
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
     * toString() method.
     *
     * @return the mission in String format
     */
    @Override
    public final String toString() {
        return "Mission{" + "id=" + id + ", name=" + name + '}';
    }

}
