
package edu.gvsu.cis.iteminfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Menuitem {

    private String Description;
    private String Value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Menuitem() {
    }

    /**
     * 
     * @param Value
     * @param Description
     */
    public Menuitem(String Description, String Value) {
        this.Description = Description;
        this.Value = Value;
    }

    /**
     * 
     * @return
     *     The Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * 
     * @param Description
     *     The Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 
     * @return
     *     The Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * 
     * @param Value
     *     The Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

}
