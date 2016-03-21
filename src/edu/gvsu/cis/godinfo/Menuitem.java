
package edu.gvsu.cis.godinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Menuitem {

    private String description;
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Menuitem() {
    }

    /**
     * 
     * @param description
     * @param value
     */
    public Menuitem(String description, String value) {
        this.description = description;
        this.value = value;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
