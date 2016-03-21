
package edu.gvsu.cis.godinfo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ItemDescription {

    private String cooldown;
    private String cost;
    private String description;
    private List<Menuitem> menuitems = new ArrayList<Menuitem>();
    private List<Rankitem> rankitems = new ArrayList<Rankitem>();
    private String secondaryDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemDescription() {
    }

    /**
     * 
     * @param description
     * @param secondaryDescription
     * @param menuitems
     * @param cost
     * @param cooldown
     * @param rankitems
     */
    public ItemDescription(String cooldown, String cost, String description, List<Menuitem> menuitems, List<Rankitem> rankitems, String secondaryDescription) {
        this.cooldown = cooldown;
        this.cost = cost;
        this.description = description;
        this.menuitems = menuitems;
        this.rankitems = rankitems;
        this.secondaryDescription = secondaryDescription;
    }

    /**
     * 
     * @return
     *     The cooldown
     */
    public String getCooldown() {
        return cooldown;
    }

    /**
     * 
     * @param cooldown
     *     The cooldown
     */
    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * 
     * @return
     *     The cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * 
     * @param cost
     *     The cost
     */
    public void setCost(String cost) {
        this.cost = cost;
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
     *     The menuitems
     */
    public List<Menuitem> getMenuitems() {
        return menuitems;
    }

    /**
     * 
     * @param menuitems
     *     The menuitems
     */
    public void setMenuitems(List<Menuitem> menuitems) {
        this.menuitems = menuitems;
    }

    /**
     * 
     * @return
     *     The rankitems
     */
    public List<Rankitem> getRankitems() {
        return rankitems;
    }

    /**
     * 
     * @param rankitems
     *     The rankitems
     */
    public void setRankitems(List<Rankitem> rankitems) {
        this.rankitems = rankitems;
    }

    /**
     * 
     * @return
     *     The secondaryDescription
     */
    public String getSecondaryDescription() {
        return secondaryDescription;
    }

    /**
     * 
     * @param secondaryDescription
     *     The secondaryDescription
     */
    public void setSecondaryDescription(String secondaryDescription) {
        this.secondaryDescription = secondaryDescription;
    }

}
