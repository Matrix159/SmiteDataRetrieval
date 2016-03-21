package edu.gvsu.cis.playerinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PlayerGodInfo {

    private int Assists;
    private int Deaths;
    private int Kills;
    private int Losses;
    private int MinionKills;
    private int Rank;
    private int Wins;
    private int Worshippers;
    private String god;
    private String godId;
    private String playerId;
    private Object retMsg;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlayerGodInfo() {
    }

    /**
     *
     * @param Wins
     * @param Kills
     * @param godId
     * @param god
     * @param Rank
     * @param playerId
     * @param retMsg
     * @param Losses
     * @param Assists
     * @param Deaths
     * @param Worshippers
     * @param MinionKills
     */
    public PlayerGodInfo(int Assists, int Deaths, int Kills, int Losses, int MinionKills, int Rank, int Wins, int Worshippers, String god, String godId, String playerId, Object retMsg) {
        this.Assists = Assists;
        this.Deaths = Deaths;
        this.Kills = Kills;
        this.Losses = Losses;
        this.MinionKills = MinionKills;
        this.Rank = Rank;
        this.Wins = Wins;
        this.Worshippers = Worshippers;
        this.god = god;
        this.godId = godId;
        this.playerId = playerId;
        this.retMsg = retMsg;
    }

    /**
     *
     * @return
     * The Assists
     */
    public int getAssists() {
        return Assists;
    }

    /**
     *
     * @param Assists
     * The Assists
     */
    public void setAssists(int Assists) {
        this.Assists = Assists;
    }

    /**
     *
     * @return
     * The Deaths
     */
    public int getDeaths() {
        return Deaths;
    }

    /**
     *
     * @param Deaths
     * The Deaths
     */
    public void setDeaths(int Deaths) {
        this.Deaths = Deaths;
    }

    /**
     *
     * @return
     * The Kills
     */
    public int getKills() {
        return Kills;
    }

    /**
     *
     * @param Kills
     * The Kills
     */
    public void setKills(int Kills) {
        this.Kills = Kills;
    }

    /**
     *
     * @return
     * The Losses
     */
    public int getLosses() {
        return Losses;
    }

    /**
     *
     * @param Losses
     * The Losses
     */
    public void setLosses(int Losses) {
        this.Losses = Losses;
    }

    /**
     *
     * @return
     * The MinionKills
     */
    public int getMinionKills() {
        return MinionKills;
    }

    /**
     *
     * @param MinionKills
     * The MinionKills
     */
    public void setMinionKills(int MinionKills) {
        this.MinionKills = MinionKills;
    }

    /**
     *
     * @return
     * The Rank
     */
    public int getRank() {
        return Rank;
    }

    /**
     *
     * @param Rank
     * The Rank
     */
    public void setRank(int Rank) {
        this.Rank = Rank;
    }

    /**
     *
     * @return
     * The Wins
     */
    public int getWins() {
        return Wins;
    }

    /**
     *
     * @param Wins
     * The Wins
     */
    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    /**
     *
     * @return
     * The Worshippers
     */
    public int getWorshippers() {
        return Worshippers;
    }

    /**
     *
     * @param Worshippers
     * The Worshippers
     */
    public void setWorshippers(int Worshippers) {
        this.Worshippers = Worshippers;
    }

    /**
     *
     * @return
     * The god
     */
    public String getGod() {
        return god;
    }

    /**
     *
     * @param god
     * The god
     */
    public void setGod(String god) {
        this.god = god;
    }

    /**
     *
     * @return
     * The godId
     */
    public String getGodId() {
        return godId;
    }

    /**
     *
     * @param godId
     * The god_id
     */
    public void setGodId(String godId) {
        this.godId = godId;
    }

    /**
     *
     * @return
     * The playerId
     */
    public String getPlayerId() {
        return playerId;
    }

    /**
     *
     * @param playerId
     * The player_id
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     *
     * @return
     * The retMsg
     */
    public Object getRetMsg() {
        return retMsg;
    }

    /**
     *
     * @param retMsg
     * The ret_msg
     */
    public void setRetMsg(Object retMsg) {
        this.retMsg = retMsg;
    }

}