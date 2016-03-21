
package edu.gvsu.cis.godinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BasicAttack {

    private ItemDescription itemDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BasicAttack() {
    }

    /**
     * 
     * @param itemDescription
     */
    public BasicAttack(ItemDescription itemDescription) {
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
