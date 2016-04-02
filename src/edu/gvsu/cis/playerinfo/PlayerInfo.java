package edu.gvsu.cis.playerinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PlayerInfo {

    private String Avatar_URL;
    private String Created_Datetime;
    private int Id;
    private String Last_Login_Datetime;
    private int Leaves;
    private int Level;
    private int Losses;
    private int MasteryLevel;
    private String Name;
    private int Rank_Stat_Conquest;
    private int Rank_Stat_Duel;
    private int Rank_Stat_Joust;
    private edu.gvsu.cis.playerinfo.RankedConquest RankedConquest;
    private edu.gvsu.cis.playerinfo.RankedDuel RankedDuel;
    private edu.gvsu.cis.playerinfo.RankedJoust RankedJoust;
    private int TeamId;
    private String Team_Name;
    private int Tier_Conquest;
    private int Tier_Duel;
    private int Tier_Joust;
    private int Total_Achievements;
    private int Total_Worshippers;
    private int Wins;
    private Object ret_msg;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlayerInfo() {
    }

    /**
     *
     * @param Wins
     * @param Tier_Joust
     * @param Rank_Stat_Joust
     * @param ret_msg
     * @param Leaves
     * @param Rank_Stat_Conquest
     * @param Total_Achievements
     * @param MasteryLevel
     * @param Tier_Duel
     * @param Avatar_URL
     * @param Name
     * @param Tier_Conquest
     * @param Team_Name
     * @param Created_Datetime
     * @param Last_Login_Datetime
     * @param TeamId
     * @param RankedJoust
     * @param RankedDuel
     * @param Losses
     * @param Id
     * @param Level
     * @param RankedConquest
     * @param Total_Worshippers
     * @param Rank_Stat_Duel
     */
    public PlayerInfo(String Avatar_URL, String Created_Datetime, int Id, String Last_Login_Datetime, int Leaves, int Level, int Losses, int MasteryLevel, String Name, int Rank_Stat_Conquest, int Rank_Stat_Duel, int Rank_Stat_Joust, edu.gvsu.cis.playerinfo.RankedConquest RankedConquest, edu.gvsu.cis.playerinfo.RankedDuel RankedDuel, edu.gvsu.cis.playerinfo.RankedJoust RankedJoust, int TeamId, String Team_Name, int Tier_Conquest, int Tier_Duel, int Tier_Joust, int Total_Achievements, int Total_Worshippers, int Wins, Object ret_msg) {
        this.Avatar_URL = Avatar_URL;
        this.Created_Datetime = Created_Datetime;
        this.Id = Id;
        this.Last_Login_Datetime = Last_Login_Datetime;
        this.Leaves = Leaves;
        this.Level = Level;
        this.Losses = Losses;
        this.MasteryLevel = MasteryLevel;
        this.Name = Name;
        this.Rank_Stat_Conquest = Rank_Stat_Conquest;
        this.Rank_Stat_Duel = Rank_Stat_Duel;
        this.Rank_Stat_Joust = Rank_Stat_Joust;
        this.RankedConquest = RankedConquest;
        this.RankedDuel = RankedDuel;
        this.RankedJoust = RankedJoust;
        this.TeamId = TeamId;
        this.Team_Name = Team_Name;
        this.Tier_Conquest = Tier_Conquest;
        this.Tier_Duel = Tier_Duel;
        this.Tier_Joust = Tier_Joust;
        this.Total_Achievements = Total_Achievements;
        this.Total_Worshippers = Total_Worshippers;
        this.Wins = Wins;
        this.ret_msg = ret_msg;
    }

    /**
     *
     * @return
     * The Avatar_URL
     */
    public String getAvatar_URL() {
        return Avatar_URL;
    }

    /**
     *
     * @param Avatar_URL
     * The Avatar_URL
     */
    public void setAvatar_URL(String Avatar_URL) {
        this.Avatar_URL = Avatar_URL;
    }

    /**
     *
     * @return
     * The Created_Datetime
     */
    public String getCreated_Datetime() {
        return Created_Datetime;
    }

    /**
     *
     * @param Created_Datetime
     * The Created_Datetime
     */
    public void setCreated_Datetime(String Created_Datetime) {
        this.Created_Datetime = Created_Datetime;
    }

    /**
     *
     * @return
     * The Id
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The Last_Login_Datetime
     */
    public String getLast_Login_Datetime() {
        return Last_Login_Datetime;
    }

    /**
     *
     * @param Last_Login_Datetime
     * The Last_Login_Datetime
     */
    public void setLast_Login_Datetime(String Last_Login_Datetime) {
        this.Last_Login_Datetime = Last_Login_Datetime;
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
     * The Level
     */
    public int getLevel() {
        return Level;
    }

    /**
     *
     * @param Level
     * The Level
     */
    public void setLevel(int Level) {
        this.Level = Level;
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
     * The MasteryLevel
     */
    public int getMasteryLevel() {
        return MasteryLevel;
    }

    /**
     *
     * @param MasteryLevel
     * The MasteryLevel
     */
    public void setMasteryLevel(int MasteryLevel) {
        this.MasteryLevel = MasteryLevel;
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
     * The Rank_Stat_Conquest
     */
    public int getRank_Stat_Conquest() {
        return Rank_Stat_Conquest;
    }

    /**
     *
     * @param Rank_Stat_Conquest
     * The Rank_Stat_Conquest
     */
    public void setRank_Stat_Conquest(int Rank_Stat_Conquest) {
        this.Rank_Stat_Conquest = Rank_Stat_Conquest;
    }

    /**
     *
     * @return
     * The Rank_Stat_Duel
     */
    public int getRank_Stat_Duel() {
        return Rank_Stat_Duel;
    }

    /**
     *
     * @param Rank_Stat_Duel
     * The Rank_Stat_Duel
     */
    public void setRank_Stat_Duel(int Rank_Stat_Duel) {
        this.Rank_Stat_Duel = Rank_Stat_Duel;
    }

    /**
     *
     * @return
     * The Rank_Stat_Joust
     */
    public int getRank_Stat_Joust() {
        return Rank_Stat_Joust;
    }

    /**
     *
     * @param Rank_Stat_Joust
     * The Rank_Stat_Joust
     */
    public void setRank_Stat_Joust(int Rank_Stat_Joust) {
        this.Rank_Stat_Joust = Rank_Stat_Joust;
    }

    /**
     *
     * @return
     * The RankedConquest
     */
    public edu.gvsu.cis.playerinfo.RankedConquest getRankedConquest() {
        return RankedConquest;
    }

    /**
     *
     * @param RankedConquest
     * The RankedConquest
     */
    public void setRankedConquest(edu.gvsu.cis.playerinfo.RankedConquest RankedConquest) {
        this.RankedConquest = RankedConquest;
    }

    /**
     *
     * @return
     * The RankedDuel
     */
    public edu.gvsu.cis.playerinfo.RankedDuel getRankedDuel() {
        return RankedDuel;
    }

    /**
     *
     * @param RankedDuel
     * The RankedDuel
     */
    public void setRankedDuel(edu.gvsu.cis.playerinfo.RankedDuel RankedDuel) {
        this.RankedDuel = RankedDuel;
    }

    /**
     *
     * @return
     * The RankedJoust
     */
    public edu.gvsu.cis.playerinfo.RankedJoust getRankedJoust() {
        return RankedJoust;
    }

    /**
     *
     * @param RankedJoust
     * The RankedJoust
     */
    public void setRankedJoust(edu.gvsu.cis.playerinfo.RankedJoust RankedJoust) {
        this.RankedJoust = RankedJoust;
    }

    /**
     *
     * @return
     * The TeamId
     */
    public int getTeamId() {
        return TeamId;
    }

    /**
     *
     * @param TeamId
     * The TeamId
     */
    public void setTeamId(int TeamId) {
        this.TeamId = TeamId;
    }

    /**
     *
     * @return
     * The Team_Name
     */
    public String getTeam_Name() {
        return Team_Name;
    }

    /**
     *
     * @param Team_Name
     * The Team_Name
     */
    public void setTeam_Name(String Team_Name) {
        this.Team_Name = Team_Name;
    }

    /**
     *
     * @return
     * The Tier_Conquest
     */
    public int getTier_Conquest() {
        return Tier_Conquest;
    }

    /**
     *
     * @param Tier_Conquest
     * The Tier_Conquest
     */
    public void setTier_Conquest(int Tier_Conquest) {
        this.Tier_Conquest = Tier_Conquest;
    }

    /**
     *
     * @return
     * The Tier_Duel
     */
    public int getTier_Duel() {
        return Tier_Duel;
    }

    /**
     *
     * @param Tier_Duel
     * The Tier_Duel
     */
    public void setTier_Duel(int Tier_Duel) {
        this.Tier_Duel = Tier_Duel;
    }

    /**
     *
     * @return
     * The Tier_Joust
     */
    public int getTier_Joust() {
        return Tier_Joust;
    }

    /**
     *
     * @param Tier_Joust
     * The Tier_Joust
     */
    public void setTier_Joust(int Tier_Joust) {
        this.Tier_Joust = Tier_Joust;
    }

    /**
     *
     * @return
     * The Total_Achievements
     */
    public int getTotal_Achievements() {
        return Total_Achievements;
    }

    /**
     *
     * @param Total_Achievements
     * The Total_Achievements
     */
    public void setTotal_Achievements(int Total_Achievements) {
        this.Total_Achievements = Total_Achievements;
    }

    /**
     *
     * @return
     * The Total_Worshippers
     */
    public int getTotal_Worshippers() {
        return Total_Worshippers;
    }

    /**
     *
     * @param Total_Worshippers
     * The Total_Worshippers
     */
    public void setTotal_Worshippers(int Total_Worshippers) {
        this.Total_Worshippers = Total_Worshippers;
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


