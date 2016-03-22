
package edu.gvsu.cis.iteminfo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ItemDescription {

    private String Description;
    private List<Menuitem> Menuitems = new ArrayList<Menuitem>();
    private String SecondaryDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemDescription() {
    }

    /**
     * 
     * @param Description
     * @param SecondaryDescription
     * @param Menuitems
     */
    public ItemDescription(String Description, List<Menuitem> Menuitems, String SecondaryDescription) {
        this.Description = Description;
        this.Menuitems = Menuitems;
        this.SecondaryDescription = SecondaryDescription;
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
     *     The Menuitems
     */
    public List<Menuitem> getMenuitems() {
        return Menuitems;
    }

    /**
     * 
     * @param Menuitems
     *     The Menuitems
     */
    public void setMenuitems(List<Menuitem> Menuitems) {
        this.Menuitems = Menuitems;
    }

    /**
     * 
     * @return
     *     The SecondaryDescription
     */
    public String getSecondaryDescription() {
        return SecondaryDescription;
    }

    /**
     * 
     * @param SecondaryDescription
     *     The SecondaryDescription
     */
    public void setSecondaryDescription(String SecondaryDescription) {
        this.SecondaryDescription = SecondaryDescription;
    }

}
