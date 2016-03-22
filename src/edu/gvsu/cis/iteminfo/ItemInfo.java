
package edu.gvsu.cis.iteminfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ItemInfo {

    private int ChildItemId;
    private String DeviceName;
    private int IconId;
    private edu.gvsu.cis.iteminfo.ItemDescription ItemDescription;
    private int ItemId;
    private int ItemTier;
    private int Price;
    private int RootItemId;
    private String ShortDesc;
    private boolean StartingItem;
    private String Type;
    private String itemIconURL;
    private String retMsg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemInfo() {
    }

    /**
     * 
     * @param DeviceName
     * @param ItemId
     * @param IconId
     * @param Type
     * @param RootItemId
     * @param ShortDesc
     * @param StartingItem
     * @param retMsg
     * @param Price
     * @param itemIconURL
     * @param ItemTier
     * @param ChildItemId
     * @param ItemDescription
     */
    public ItemInfo(int ChildItemId, String DeviceName, int IconId, edu.gvsu.cis.iteminfo.ItemDescription ItemDescription, int ItemId, int ItemTier, int Price, int RootItemId, String ShortDesc, boolean StartingItem, String Type, String itemIconURL, String retMsg) {
        this.ChildItemId = ChildItemId;
        this.DeviceName = DeviceName;
        this.IconId = IconId;
        this.ItemDescription = ItemDescription;
        this.ItemId = ItemId;
        this.ItemTier = ItemTier;
        this.Price = Price;
        this.RootItemId = RootItemId;
        this.ShortDesc = ShortDesc;
        this.StartingItem = StartingItem;
        this.Type = Type;
        this.itemIconURL = itemIconURL;
        this.retMsg = retMsg;
    }

    /**
     * 
     * @return
     *     The ChildItemId
     */
    public int getChildItemId() {
        return ChildItemId;
    }

    /**
     * 
     * @param ChildItemId
     *     The ChildItemId
     */
    public void setChildItemId(int ChildItemId) {
        this.ChildItemId = ChildItemId;
    }

    /**
     * 
     * @return
     *     The DeviceName
     */
    public String getDeviceName() {
        return DeviceName;
    }

    /**
     * 
     * @param DeviceName
     *     The DeviceName
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 
     * @return
     *     The IconId
     */
    public int getIconId() {
        return IconId;
    }

    /**
     * 
     * @param IconId
     *     The IconId
     */
    public void setIconId(int IconId) {
        this.IconId = IconId;
    }

    /**
     * 
     * @return
     *     The ItemDescription
     */
    public edu.gvsu.cis.iteminfo.ItemDescription getItemDescription() {
        return ItemDescription;
    }

    /**
     * 
     * @param ItemDescription
     *     The ItemDescription
     */
    public void setItemDescription(edu.gvsu.cis.iteminfo.ItemDescription ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    /**
     * 
     * @return
     *     The ItemId
     */
    public int getItemId() {
        return ItemId;
    }

    /**
     * 
     * @param ItemId
     *     The ItemId
     */
    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * 
     * @return
     *     The ItemTier
     */
    public int getItemTier() {
        return ItemTier;
    }

    /**
     * 
     * @param ItemTier
     *     The ItemTier
     */
    public void setItemTier(int ItemTier) {
        this.ItemTier = ItemTier;
    }

    /**
     * 
     * @return
     *     The Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * 
     * @param Price
     *     The Price
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * 
     * @return
     *     The RootItemId
     */
    public int getRootItemId() {
        return RootItemId;
    }

    /**
     * 
     * @param RootItemId
     *     The RootItemId
     */
    public void setRootItemId(int RootItemId) {
        this.RootItemId = RootItemId;
    }

    /**
     * 
     * @return
     *     The ShortDesc
     */
    public String getShortDesc() {
        return ShortDesc;
    }

    /**
     * 
     * @param ShortDesc
     *     The ShortDesc
     */
    public void setShortDesc(String ShortDesc) {
        this.ShortDesc = ShortDesc;
    }

    /**
     * 
     * @return
     *     The StartingItem
     */
    public boolean isStartingItem() {
        return StartingItem;
    }

    /**
     * 
     * @param StartingItem
     *     The StartingItem
     */
    public void setStartingItem(boolean StartingItem) {
        this.StartingItem = StartingItem;
    }

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The itemIconURL
     */
    public String getItemIconURL() {
        return itemIconURL;
    }

    /**
     * 
     * @param itemIconURL
     *     The itemIcon_URL
     */
    public void setItemIconURL(String itemIconURL) {
        this.itemIconURL = itemIconURL;
    }

    /**
     * 
     * @return
     *     The retMsg
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * 
     * @param retMsg
     *     The ret_msg
     */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

}
