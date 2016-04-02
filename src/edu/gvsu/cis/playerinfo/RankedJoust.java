package edu.gvsu.cis.playerinfo;

import javax.annotation.Generated;

/**
 * Created by Eldridge on 4/2/2016.
 */
@Generated("org.jsonschema2pojo")
public class RankedJoust {

    private int Leaves;
    private int Losses;
    private String Name;
    private int Points;
    private int PrevRank;
    private int Rank;
    private Object Rank_Stat_Conquest;
    private Object Rank_Stat_Duel;
    private Object Rank_Stat_Joust;
    private int Season;
    private int Tier;
    private int Trend;
    private int Wins;
    private Object player_id;
    private Object ret_msg;

    /**
     * No args constructor for use in serialization
     *
     */
    public RankedJoust() {
    }

    /**
     *
     * @param Wins
     * @param Rank_Stat_Joust
     * @param Rank
     * @param ret_msg
     * @param Leaves
     * @param Season
     * @param Rank_Stat_Conquest
     * @param Points
     * @param Name
     * @param PrevRank
     * @param Tier
     * @param Losses
     * @param player_id
     * @param Rank_Stat_Duel
     * @param Trend
     */
    public RankedJoust(int Leaves, int Losses, String Name, int Points, int PrevRank, int Rank, Object Rank_Stat_Conquest, Object Rank_Stat_Duel, Object Rank_Stat_Joust, int Season, int Tier, int Trend, int Wins, Object player_id, Object ret_msg) {
        this.Leaves = Leaves;
        this.Losses = Losses;
        this.Name = Name;
        this.Points = Points;
        this.PrevRank = PrevRank;
        this.Rank = Rank;
        this.Rank_Stat_Conquest = Rank_Stat_Conquest;
        this.Rank_Stat_Duel = Rank_Stat_Duel;
        this.Rank_Stat_Joust = Rank_Stat_Joust;
        this.Season = Season;
        this.Tier = Tier;
        this.Trend = Trend;
        this.Wins = Wins;
        this.player_id = player_id;
        this.ret_msg = ret_msg;
    }

    /**
     *
     * @return
     * The Leaves
     */
    public int getLeaves() {
        return Leaves;
    }

    /**
     *
     * @param Leaves
     * The Leaves
     */
    public void setLeaves(int Leaves) {
        this.Leaves = Leaves;
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
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The Points
     */
    public int getPoints() {
        return Points;
    }

    /**
     *
     * @param Points
     * The Points
     */
    public void setPoints(int Points) {
        this.Points = Points;
    }

    /**
     *
     * @return
     * The PrevRank
     */
    public int getPrevRank() {
        return PrevRank;
    }

    /**
     *
     * @param PrevRank
     * The PrevRank
     */
    public void setPrevRank(int PrevRank) {
        this.PrevRank = PrevRank;
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
     * The Rank_Stat_Conquest
     */
    public Object getRank_Stat_Conquest() {
        return Rank_Stat_Conquest;
    }

    /**
     *
     * @param Rank_Stat_Conquest
     * The Rank_Stat_Conquest
     */
    public void setRank_Stat_Conquest(Object Rank_Stat_Conquest) {
        this.Rank_Stat_Conquest = Rank_Stat_Conquest;
    }

    /**
     *
     * @return
     * The Rank_Stat_Duel
     */
    public Object getRank_Stat_Duel() {
        return Rank_Stat_Duel;
    }

    /**
     *
     * @param Rank_Stat_Duel
     * The Rank_Stat_Duel
     */
    public void setRank_Stat_Duel(Object Rank_Stat_Duel) {
        this.Rank_Stat_Duel = Rank_Stat_Duel;
    }

    /**
     *
     * @return
     * The Rank_Stat_Joust
     */
    public Object getRank_Stat_Joust() {
        return Rank_Stat_Joust;
    }

    /**
     *
     * @param Rank_Stat_Joust
     * The Rank_Stat_Joust
     */
    public void setRank_Stat_Joust(Object Rank_Stat_Joust) {
        this.Rank_Stat_Joust = Rank_Stat_Joust;
    }

    /**
     *
     * @return
     * The Season
     */
    public int getSeason() {
        return Season;
    }

    /**
     *
     * @param Season
     * The Season
     */
    public void setSeason(int Season) {
        this.Season = Season;
    }

    /**
     *
     * @return
     * The Tier
     */
    public int getTier() {
        return Tier;
    }

    /**
     *
     * @param Tier
     * The Tier
     */
    public void setTier(int Tier) {
        this.Tier = Tier;
    }

    /**
     *
     * @return
     * The Trend
     */
    public int getTrend() {
        return Trend;
    }

    /**
     *
     * @param Trend
     * The Trend
     */
    public void setTrend(int Trend) {
        this.Trend = Trend;
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
     * The player_id
     */
    public Object getPlayer_id() {
        return player_id;
    }

    /**
     *
     * @param player_id
     * The player_id
     */
    public void setPlayer_id(Object player_id) {
        this.player_id = player_id;
    }

    /**
     *
     * @return
     * The ret_msg
     */
    public Object getRet_msg() {
        return ret_msg;
    }

    /**
     *
     * @param ret_msg
     * The ret_msg
     */
    public void setRet_msg(Object ret_msg) {
        this.ret_msg = ret_msg;
    }

}
