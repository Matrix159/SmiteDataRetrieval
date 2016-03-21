
package edu.gvsu.cis.godinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Description {

    private ItemDescription itemDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param itemDescription
     */
    public Description(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * 
     * @return
     *     The itemDescription
     */
    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    /**
     * 
     * @param itemDescription
     *     The itemDescription
     */
    public void setItemDescription(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }

}
