
package edu.gvsu.cis.playerinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FriendsInfo {

    private String accountId;
    private String avatarUrl;
    private String name;
    private String playerId;
    private Object retMsg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FriendsInfo() {
    }

    /**
     * 
     * @param accountId
     * @param playerId
     * @param retMsg
     * @param name
     * @param avatarUrl
     */
    public FriendsInfo(String accountId, String avatarUrl, String name, String playerId, Object retMsg) {
        this.accountId = accountId;
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.playerId = playerId;
        this.retMsg = retMsg;
    }

    /**
     * 
     * @return
     *     The accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The account_id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The playerId
     */
    public String getPlayerId() {
        return playerId;
    }

    /**
     * 
     * @param playerId
     *     The player_id
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * Should return null on good response
     * @return
     *     The retMsg
     */
    public Object getRetMsg() {
        return retMsg;
    }

    /**
     *
     * @param retMsg
     *     The ret_msg
     */
    public void setRetMsg(Object retMsg) {
        this.retMsg = retMsg;
    }

}
