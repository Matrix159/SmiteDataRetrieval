package edu.gvsu.cis.matchinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MatchDetails {

    private int Account_Level;
    private int ActiveId1;
    private int ActiveId2;
    private int Assists;
    private String Ban1;
    private String Ban10;
    private int Ban10Id;
    private int Ban1Id;
    private String Ban2;
    private int Ban2Id;
    private String Ban3;
    private int Ban3Id;
    private String Ban4;
    private int Ban4Id;
    private String Ban5;
    private int Ban5Id;
    private String Ban6;
    private int Ban6Id;
    private String Ban7;
    private int Ban7Id;
    private String Ban8;
    private int Ban8Id;
    private String Ban9;
    private int Ban9Id;
    private int Camps_Cleared;
    private int Conquest_Losses;
    private int Conquest_Points;
    private int Conquest_Tier;
    private int Conquest_Wins;
    private int Damage_Bot;
    private int Damage_Done_Magical;
    private int Damage_Done_Physical;
    private int Damage_Mitigated;
    private int Damage_Player;
    private int Damage_Taken;
    private int Deaths;
    private int Duel_Losses;
    private int Duel_Points;
    private int Duel_Tier;
    private int Duel_Wins;
    private String Entry_Datetime;
    private int Final_Match_Level;
    private String First_Ban_Side;
    private int GodId;
    private int Gold_Earned;
    private int Gold_Per_Minute;
    private int Healing;
    private int ItemId1;
    private int ItemId2;
    private int ItemId3;
    private int ItemId4;
    private int ItemId5;
    private int ItemId6;
    private String Item_Active_1;
    private String Item_Active_2;
    private String Item_Active_3;
    private String Item_Purch_1;
    private String Item_Purch_2;
    private String Item_Purch_3;
    private String Item_Purch_4;
    private String Item_Purch_5;
    private String Item_Purch_6;
    private int Joust_Losses;
    private int Joust_Points;
    private int Joust_Tier;
    private int Joust_Wins;
    private int Killing_Spree;
    private int Kills_Bot;
    private int Kills_Double;
    private int Kills_Fire_Giant;
    private int Kills_First_Blood;
    private int Kills_Gold_Fury;
    private int Kills_Penta;
    private int Kills_Phoenix;
    private int Kills_Player;
    private int Kills_Quadra;
    private int Kills_Siege_Juggernaut;
    private int Kills_Single;
    private int Kills_Triple;
    private int Kills_Wild_Juggernaut;
    private int Mastery_Level;
    private int Match;
    private int Minutes;
    private int Multi_kill_Max;
    private int PartyId;
    private int Rank_Stat_Conquest;
    private int Rank_Stat_Duel;
    private int Rank_Stat_Joust;
    private String Reference_Name;
    private String Skin;
    private int SkinId;
    private int Structure_Damage;
    private String Surrendered;
    private int Team1Score;
    private int Team2Score;
    private int TeamId;
    private String Team_Name;
    private int Towers_Destroyed;
    private int Wards_Placed;
    private String Win_Status;
    private String hasReplay;
    private String name;
    private String playerId;
    private String playerName;
    private String ret_msg;

    /**
     * No args constructor for use in serialization
     *
     */
    public MatchDetails() {
    }

    /**
     *
     * @param Final_Match_Level
     * @param Damage_Taken
     * @param Towers_Destroyed
     * @param Ban10
     * @param Killing_Spree
     * @param Team_Name
     * @param Joust_Losses
     * @param playerName
     * @param Damage_Mitigated
     * @param Kills_Triple
     * @param Reference_Name
     * @param hasReplay
     * @param Kills_Wild_Juggernaut
     * @param TeamId
     * @param Kills_Penta
     * @param Deaths
     * @param Team1Score
     * @param Healing
     * @param Structure_Damage
     * @param Ban10Id
     * @param Kills_Double
     * @param Damage_Done_Magical
     * @param Duel_Points
     * @param Rank_Stat_Duel
     * @param Duel_Losses
     * @param Rank_Stat_Joust
     * @param Conquest_Losses
     * @param Damage_Bot
     * @param ItemId6
     * @param Kills_Phoenix
     * @param ItemId4
     * @param ItemId5
     * @param ItemId2
     * @param ItemId3
     * @param ItemId1
     * @param Damage_Done_Physical
     * @param Ban3Id
     * @param Joust_Tier
     * @param Joust_Wins
     * @param Gold_Earned
     * @param ActiveId2
     * @param ActiveId1
     * @param Surrendered
     * @param Ban2Id
     * @param Ban7
     * @param Ban8
     * @param Ban9
     * @param Duel_Tier
     * @param Joust_Points
     * @param Ban3
     * @param Ban4
     * @param Ban5
     * @param Ban1Id
     * @param Ban6
     * @param Kills_Player
     * @param Ban1
     * @param Win_Status
     * @param Ban2
     * @param Kills_Single
     * @param Ban8Id
     * @param Conquest_Wins
     * @param Ban7Id
     * @param Rank_Stat_Conquest
     * @param Account_Level
     * @param Mastery_Level
     * @param Gold_Per_Minute
     * @param Ban4Id
     * @param First_Ban_Side
     * @param Multi_kill_Max
     * @param Ban5Id
     * @param SkinId
     * @param playerId
     * @param Ban6Id
     * @param Kills_First_Blood
     * @param Wards_Placed
     * @param Conquest_Points
     * @param PartyId
     * @param Ban9Id
     * @param ret_msg
     * @param Assists
     * @param Kills_Bot
     * @param Camps_Cleared
     * @param Kills_Gold_Fury
     * @param GodId
     * @param name
     * @param Kills_Fire_Giant
     * @param Entry_Datetime
     * @param Duel_Wins
     * @param Kills_Quadra
     * @param Skin
     * @param Team2Score
     * @param Conquest_Tier
     * @param Match
     * @param Item_Purch_1
     * @param Item_Purch_2
     * @param Item_Purch_3
     * @param Item_Purch_4
     * @param Item_Purch_5
     * @param Item_Purch_6
     * @param Kills_Siege_Juggernaut
     * @param Item_Active_3
     * @param Item_Active_2
     * @param Item_Active_1
     * @param Minutes
     * @param Damage_Player
     */
    public MatchDetails(int Account_Level, int ActiveId1, int ActiveId2, int Assists, String Ban1, String Ban10, int Ban10Id, int Ban1Id, String Ban2, int Ban2Id, String Ban3, int Ban3Id, String Ban4, int Ban4Id, String Ban5, int Ban5Id, String Ban6, int Ban6Id, String Ban7, int Ban7Id, String Ban8, int Ban8Id, String Ban9, int Ban9Id, int Camps_Cleared, int Conquest_Losses, int Conquest_Points, int Conquest_Tier, int Conquest_Wins, int Damage_Bot, int Damage_Done_Magical, int Damage_Done_Physical, int Damage_Mitigated, int Damage_Player, int Damage_Taken, int Deaths, int Duel_Losses, int Duel_Points, int Duel_Tier, int Duel_Wins, String Entry_Datetime, int Final_Match_Level, String First_Ban_Side, int GodId, int Gold_Earned, int Gold_Per_Minute, int Healing, int ItemId1, int ItemId2, int ItemId3, int ItemId4, int ItemId5, int ItemId6, String Item_Active_1, String Item_Active_2, String Item_Active_3, String Item_Purch_1, String Item_Purch_2, String Item_Purch_3, String Item_Purch_4, String Item_Purch_5, String Item_Purch_6, int Joust_Losses, int Joust_Points, int Joust_Tier, int Joust_Wins, int Killing_Spree, int Kills_Bot, int Kills_Double, int Kills_Fire_Giant, int Kills_First_Blood, int Kills_Gold_Fury, int Kills_Penta, int Kills_Phoenix, int Kills_Player, int Kills_Quadra, int Kills_Siege_Juggernaut, int Kills_Single, int Kills_Triple, int Kills_Wild_Juggernaut, int Mastery_Level, int Match, int Minutes, int Multi_kill_Max, int PartyId, int Rank_Stat_Conquest, int Rank_Stat_Duel, int Rank_Stat_Joust, String Reference_Name, String Skin, int SkinId, int Structure_Damage, String Surrendered, int Team1Score, int Team2Score, int TeamId, String Team_Name, int Towers_Destroyed, int Wards_Placed, String Win_Status, String hasReplay, String name, String playerId, String playerName, String ret_msg) {
        this.Account_Level = Account_Level;
        this.ActiveId1 = ActiveId1;
        this.ActiveId2 = ActiveId2;
        this.Assists = Assists;
        this.Ban1 = Ban1;
        this.Ban10 = Ban10;
        this.Ban10Id = Ban10Id;
        this.Ban1Id = Ban1Id;
        this.Ban2 = Ban2;
        this.Ban2Id = Ban2Id;
        this.Ban3 = Ban3;
        this.Ban3Id = Ban3Id;
        this.Ban4 = Ban4;
        this.Ban4Id = Ban4Id;
        this.Ban5 = Ban5;
        this.Ban5Id = Ban5Id;
        this.Ban6 = Ban6;
        this.Ban6Id = Ban6Id;
        this.Ban7 = Ban7;
        this.Ban7Id = Ban7Id;
        this.Ban8 = Ban8;
        this.Ban8Id = Ban8Id;
        this.Ban9 = Ban9;
        this.Ban9Id = Ban9Id;
        this.Camps_Cleared = Camps_Cleared;
        this.Conquest_Losses = Conquest_Losses;
        this.Conquest_Points = Conquest_Points;
        this.Conquest_Tier = Conquest_Tier;
        this.Conquest_Wins = Conquest_Wins;
        this.Damage_Bot = Damage_Bot;
        this.Damage_Done_Magical = Damage_Done_Magical;
        this.Damage_Done_Physical = Damage_Done_Physical;
        this.Damage_Mitigated = Damage_Mitigated;
        this.Damage_Player = Damage_Player;
        this.Damage_Taken = Damage_Taken;
        this.Deaths = Deaths;
        this.Duel_Losses = Duel_Losses;
        this.Duel_Points = Duel_Points;
        this.Duel_Tier = Duel_Tier;
        this.Duel_Wins = Duel_Wins;
        this.Entry_Datetime = Entry_Datetime;
        this.Final_Match_Level = Final_Match_Level;
        this.First_Ban_Side = First_Ban_Side;
        this.GodId = GodId;
        this.Gold_Earned = Gold_Earned;
        this.Gold_Per_Minute = Gold_Per_Minute;
        this.Healing = Healing;
        this.ItemId1 = ItemId1;
        this.ItemId2 = ItemId2;
        this.ItemId3 = ItemId3;
        this.ItemId4 = ItemId4;
        this.ItemId5 = ItemId5;
        this.ItemId6 = ItemId6;
        this.Item_Active_1 = Item_Active_1;
        this.Item_Active_2 = Item_Active_2;
        this.Item_Active_3 = Item_Active_3;
        this.Item_Purch_1 = Item_Purch_1;
        this.Item_Purch_2 = Item_Purch_2;
        this.Item_Purch_3 = Item_Purch_3;
        this.Item_Purch_4 = Item_Purch_4;
        this.Item_Purch_5 = Item_Purch_5;
        this.Item_Purch_6 = Item_Purch_6;
        this.Joust_Losses = Joust_Losses;
        this.Joust_Points = Joust_Points;
        this.Joust_Tier = Joust_Tier;
        this.Joust_Wins = Joust_Wins;
        this.Killing_Spree = Killing_Spree;
        this.Kills_Bot = Kills_Bot;
        this.Kills_Double = Kills_Double;
        this.Kills_Fire_Giant = Kills_Fire_Giant;
        this.Kills_First_Blood = Kills_First_Blood;
        this.Kills_Gold_Fury = Kills_Gold_Fury;
        this.Kills_Penta = Kills_Penta;
        this.Kills_Phoenix = Kills_Phoenix;
        this.Kills_Player = Kills_Player;
        this.Kills_Quadra = Kills_Quadra;
        this.Kills_Siege_Juggernaut = Kills_Siege_Juggernaut;
        this.Kills_Single = Kills_Single;
        this.Kills_Triple = Kills_Triple;
        this.Kills_Wild_Juggernaut = Kills_Wild_Juggernaut;
        this.Mastery_Level = Mastery_Level;
        this.Match = Match;
        this.Minutes = Minutes;
        this.Multi_kill_Max = Multi_kill_Max;
        this.PartyId = PartyId;
        this.Rank_Stat_Conquest = Rank_Stat_Conquest;
        this.Rank_Stat_Duel = Rank_Stat_Duel;
        this.Rank_Stat_Joust = Rank_Stat_Joust;
        this.Reference_Name = Reference_Name;
        this.Skin = Skin;
        this.SkinId = SkinId;
        this.Structure_Damage = Structure_Damage;
        this.Surrendered = Surrendered;
        this.Team1Score = Team1Score;
        this.Team2Score = Team2Score;
        this.TeamId = TeamId;
        this.Team_Name = Team_Name;
        this.Towers_Destroyed = Towers_Destroyed;
        this.Wards_Placed = Wards_Placed;
        this.Win_Status = Win_Status;
        this.hasReplay = hasReplay;
        this.name = name;
        this.playerId = playerId;
        this.playerName = playerName;
        this.ret_msg = ret_msg;
    }

    /**
     *
     * @return
     * The Account_Level
     */
    public int getAccount_Level() {
        return Account_Level;
    }

    /**
     *
     * @param Account_Level
     * The Account_Level
     */
    public void setAccount_Level(int Account_Level) {
        this.Account_Level = Account_Level;
    }

    /**
     *
     * @return
     * The ActiveId1
     */
    public int getActiveId1() {
        return ActiveId1;
    }

    /**
     *
     * @param ActiveId1
     * The ActiveId1
     */
    public void setActiveId1(int ActiveId1) {
        this.ActiveId1 = ActiveId1;
    }

    /**
     *
     * @return
     * The ActiveId2
     */
    public int getActiveId2() {
        return ActiveId2;
    }

    /**
     *
     * @param ActiveId2
     * The ActiveId2
     */
    public void setActiveId2(int ActiveId2) {
        this.ActiveId2 = ActiveId2;
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
     * The Ban1
     */
    public String getBan1() {
        return Ban1;
    }

    /**
     *
     * @param Ban1
     * The Ban1
     */
    public void setBan1(String Ban1) {
        this.Ban1 = Ban1;
    }

    /**
     *
     * @return
     * The Ban10
     */
    public String getBan10() {
        return Ban10;
    }

    /**
     *
     * @param Ban10
     * The Ban10
     */
    public void setBan10(String Ban10) {
        this.Ban10 = Ban10;
    }

    /**
     *
     * @return
     * The Ban10Id
     */
    public int getBan10Id() {
        return Ban10Id;
    }

    /**
     *
     * @param Ban10Id
     * The Ban10Id
     */
    public void setBan10Id(int Ban10Id) {
        this.Ban10Id = Ban10Id;
    }

    /**
     *
     * @return
     * The Ban1Id
     */
    public int getBan1Id() {
        return Ban1Id;
    }

    /**
     *
     * @param Ban1Id
     * The Ban1Id
     */
    public void setBan1Id(int Ban1Id) {
        this.Ban1Id = Ban1Id;
    }

    /**
     *
     * @return
     * The Ban2
     */
    public String getBan2() {
        return Ban2;
    }

    /**
     *
     * @param Ban2
     * The Ban2
     */
    public void setBan2(String Ban2) {
        this.Ban2 = Ban2;
    }

    /**
     *
     * @return
     * The Ban2Id
     */
    public int getBan2Id() {
        return Ban2Id;
    }

    /**
     *
     * @param Ban2Id
     * The Ban2Id
     */
    public void setBan2Id(int Ban2Id) {
        this.Ban2Id = Ban2Id;
    }

    /**
     *
     * @return
     * The Ban3
     */
    public String getBan3() {
        return Ban3;
    }

    /**
     *
     * @param Ban3
     * The Ban3
     */
    public void setBan3(String Ban3) {
        this.Ban3 = Ban3;
    }

    /**
     *
     * @return
     * The Ban3Id
     */
    public int getBan3Id() {
        return Ban3Id;
    }

    /**
     *
     * @param Ban3Id
     * The Ban3Id
     */
    public void setBan3Id(int Ban3Id) {
        this.Ban3Id = Ban3Id;
    }

    /**
     *
     * @return
     * The Ban4
     */
    public String getBan4() {
        return Ban4;
    }

    /**
     *
     * @param Ban4
     * The Ban4
     */
    public void setBan4(String Ban4) {
        this.Ban4 = Ban4;
    }

    /**
     *
     * @return
     * The Ban4Id
     */
    public int getBan4Id() {
        return Ban4Id;
    }

    /**
     *
     * @param Ban4Id
     * The Ban4Id
     */
    public void setBan4Id(int Ban4Id) {
        this.Ban4Id = Ban4Id;
    }

    /**
     *
     * @return
     * The Ban5
     */
    public String getBan5() {
        return Ban5;
    }

    /**
     *
     * @param Ban5
     * The Ban5
     */
    public void setBan5(String Ban5) {
        this.Ban5 = Ban5;
    }

    /**
     *
     * @return
     * The Ban5Id
     */
    public int getBan5Id() {
        return Ban5Id;
    }

    /**
     *
     * @param Ban5Id
     * The Ban5Id
     */
    public void setBan5Id(int Ban5Id) {
        this.Ban5Id = Ban5Id;
    }

    /**
     *
     * @return
     * The Ban6
     */
    public String getBan6() {
        return Ban6;
    }

    /**
     *
     * @param Ban6
     * The Ban6
     */
    public void setBan6(String Ban6) {
        this.Ban6 = Ban6;
    }

    /**
     *
     * @return
     * The Ban6Id
     */
    public int getBan6Id() {
        return Ban6Id;
    }

    /**
     *
     * @param Ban6Id
     * The Ban6Id
     */
    public void setBan6Id(int Ban6Id) {
        this.Ban6Id = Ban6Id;
    }

    /**
     *
     * @return
     * The Ban7
     */
    public String getBan7() {
        return Ban7;
    }

    /**
     *
     * @param Ban7
     * The Ban7
     */
    public void setBan7(String Ban7) {
        this.Ban7 = Ban7;
    }

    /**
     *
     * @return
     * The Ban7Id
     */
    public int getBan7Id() {
        return Ban7Id;
    }

    /**
     *
     * @param Ban7Id
     * The Ban7Id
     */
    public void setBan7Id(int Ban7Id) {
        this.Ban7Id = Ban7Id;
    }

    /**
     *
     * @return
     * The Ban8
     */
    public String getBan8() {
        return Ban8;
    }

    /**
     *
     * @param Ban8
     * The Ban8
     */
    public void setBan8(String Ban8) {
        this.Ban8 = Ban8;
    }

    /**
     *
     * @return
     * The Ban8Id
     */
    public int getBan8Id() {
        return Ban8Id;
    }

    /**
     *
     * @param Ban8Id
     * The Ban8Id
     */
    public void setBan8Id(int Ban8Id) {
        this.Ban8Id = Ban8Id;
    }

    /**
     *
     * @return
     * The Ban9
     */
    public String getBan9() {
        return Ban9;
    }

    /**
     *
     * @param Ban9
     * The Ban9
     */
    public void setBan9(String Ban9) {
        this.Ban9 = Ban9;
    }

    /**
     *
     * @return
     * The Ban9Id
     */
    public int getBan9Id() {
        return Ban9Id;
    }

    /**
     *
     * @param Ban9Id
     * The Ban9Id
     */
    public void setBan9Id(int Ban9Id) {
        this.Ban9Id = Ban9Id;
    }

    /**
     *
     * @return
     * The Camps_Cleared
     */
    public int getCamps_Cleared() {
        return Camps_Cleared;
    }

    /**
     *
     * @param Camps_Cleared
     * The Camps_Cleared
     */
    public void setCamps_Cleared(int Camps_Cleared) {
        this.Camps_Cleared = Camps_Cleared;
    }

    /**
     *
     * @return
     * The Conquest_Losses
     */
    public int getConquest_Losses() {
        return Conquest_Losses;
    }

    /**
     *
     * @param Conquest_Losses
     * The Conquest_Losses
     */
    public void setConquest_Losses(int Conquest_Losses) {
        this.Conquest_Losses = Conquest_Losses;
    }

    /**
     *
     * @return
     * The Conquest_Points
     */
    public int getConquest_Points() {
        return Conquest_Points;
    }

    /**
     *
     * @param Conquest_Points
     * The Conquest_Points
     */
    public void setConquest_Points(int Conquest_Points) {
        this.Conquest_Points = Conquest_Points;
    }

    /**
     *
     * @return
     * The Conquest_Tier
     */
    public int getConquest_Tier() {
        return Conquest_Tier;
    }

    /**
     *
     * @param Conquest_Tier
     * The Conquest_Tier
     */
    public void setConquest_Tier(int Conquest_Tier) {
        this.Conquest_Tier = Conquest_Tier;
    }

    /**
     *
     * @return
     * The Conquest_Wins
     */
    public int getConquest_Wins() {
        return Conquest_Wins;
    }

    /**
     *
     * @param Conquest_Wins
     * The Conquest_Wins
     */
    public void setConquest_Wins(int Conquest_Wins) {
        this.Conquest_Wins = Conquest_Wins;
    }

    /**
     *
     * @return
     * The Damage_Bot
     */
    public int getDamage_Bot() {
        return Damage_Bot;
    }

    /**
     *
     * @param Damage_Bot
     * The Damage_Bot
     */
    public void setDamage_Bot(int Damage_Bot) {
        this.Damage_Bot = Damage_Bot;
    }

    /**
     *
     * @return
     * The Damage_Done_Magical
     */
    public int getDamage_Done_Magical() {
        return Damage_Done_Magical;
    }

    /**
     *
     * @param Damage_Done_Magical
     * The Damage_Done_Magical
     */
    public void setDamage_Done_Magical(int Damage_Done_Magical) {
        this.Damage_Done_Magical = Damage_Done_Magical;
    }

    /**
     *
     * @return
     * The Damage_Done_Physical
     */
    public int getDamage_Done_Physical() {
        return Damage_Done_Physical;
    }

    /**
     *
     * @param Damage_Done_Physical
     * The Damage_Done_Physical
     */
    public void setDamage_Done_Physical(int Damage_Done_Physical) {
        this.Damage_Done_Physical = Damage_Done_Physical;
    }

    /**
     *
     * @return
     * The Damage_Mitigated
     */
    public int getDamage_Mitigated() {
        return Damage_Mitigated;
    }

    /**
     *
     * @param Damage_Mitigated
     * The Damage_Mitigated
     */
    public void setDamage_Mitigated(int Damage_Mitigated) {
        this.Damage_Mitigated = Damage_Mitigated;
    }

    /**
     *
     * @return
     * The Damage_Player
     */
    public int getDamage_Player() {
        return Damage_Player;
    }

    /**
     *
     * @param Damage_Player
     * The Damage_Player
     */
    public void setDamage_Player(int Damage_Player) {
        this.Damage_Player = Damage_Player;
    }

    /**
     *
     * @return
     * The Damage_Taken
     */
    public int getDamage_Taken() {
        return Damage_Taken;
    }

    /**
     *
     * @param Damage_Taken
     * The Damage_Taken
     */
    public void setDamage_Taken(int Damage_Taken) {
        this.Damage_Taken = Damage_Taken;
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
     * The Duel_Losses
     */
    public int getDuel_Losses() {
        return Duel_Losses;
    }

    /**
     *
     * @param Duel_Losses
     * The Duel_Losses
     */
    public void setDuel_Losses(int Duel_Losses) {
        this.Duel_Losses = Duel_Losses;
    }

    /**
     *
     * @return
     * The Duel_Points
     */
    public int getDuel_Points() {
        return Duel_Points;
    }

    /**
     *
     * @param Duel_Points
     * The Duel_Points
     */
    public void setDuel_Points(int Duel_Points) {
        this.Duel_Points = Duel_Points;
    }

    /**
     *
     * @return
     * The Duel_Tier
     */
    public int getDuel_Tier() {
        return Duel_Tier;
    }

    /**
     *
     * @param Duel_Tier
     * The Duel_Tier
     */
    public void setDuel_Tier(int Duel_Tier) {
        this.Duel_Tier = Duel_Tier;
    }

    /**
     *
     * @return
     * The Duel_Wins
     */
    public int getDuel_Wins() {
        return Duel_Wins;
    }

    /**
     *
     * @param Duel_Wins
     * The Duel_Wins
     */
    public void setDuel_Wins(int Duel_Wins) {
        this.Duel_Wins = Duel_Wins;
    }

    /**
     *
     * @return
     * The Entry_Datetime
     */
    public String getEntry_Datetime() {
        return Entry_Datetime;
    }

    /**
     *
     * @param Entry_Datetime
     * The Entry_Datetime
     */
    public void setEntry_Datetime(String Entry_Datetime) {
        this.Entry_Datetime = Entry_Datetime;
    }

    /**
     *
     * @return
     * The Final_Match_Level
     */
    public int getFinal_Match_Level() {
        return Final_Match_Level;
    }

    /**
     *
     * @param Final_Match_Level
     * The Final_Match_Level
     */
    public void setFinal_Match_Level(int Final_Match_Level) {
        this.Final_Match_Level = Final_Match_Level;
    }

    /**
     *
     * @return
     * The First_Ban_Side
     */
    public String getFirst_Ban_Side() {
        return First_Ban_Side;
    }

    /**
     *
     * @param First_Ban_Side
     * The First_Ban_Side
     */
    public void setFirst_Ban_Side(String First_Ban_Side) {
        this.First_Ban_Side = First_Ban_Side;
    }

    /**
     *
     * @return
     * The GodId
     */
    public int getGodId() {
        return GodId;
    }

    /**
     *
     * @param GodId
     * The GodId
     */
    public void setGodId(int GodId) {
        this.GodId = GodId;
    }

    /**
     *
     * @return
     * The Gold_Earned
     */
    public int getGold_Earned() {
        return Gold_Earned;
    }

    /**
     *
     * @param Gold_Earned
     * The Gold_Earned
     */
    public void setGold_Earned(int Gold_Earned) {
        this.Gold_Earned = Gold_Earned;
    }

    /**
     *
     * @return
     * The Gold_Per_Minute
     */
    public int getGold_Per_Minute() {
        return Gold_Per_Minute;
    }

    /**
     *
     * @param Gold_Per_Minute
     * The Gold_Per_Minute
     */
    public void setGold_Per_Minute(int Gold_Per_Minute) {
        this.Gold_Per_Minute = Gold_Per_Minute;
    }

    /**
     *
     * @return
     * The Healing
     */
    public int getHealing() {
        return Healing;
    }

    /**
     *
     * @param Healing
     * The Healing
     */
    public void setHealing(int Healing) {
        this.Healing = Healing;
    }

    /**
     *
     * @return
     * The ItemId1
     */
    public int getItemId1() {
        return ItemId1;
    }

    /**
     *
     * @param ItemId1
     * The ItemId1
     */
    public void setItemId1(int ItemId1) {
        this.ItemId1 = ItemId1;
    }

    /**
     *
     * @return
     * The ItemId2
     */
    public int getItemId2() {
        return ItemId2;
    }

    /**
     *
     * @param ItemId2
     * The ItemId2
     */
    public void setItemId2(int ItemId2) {
        this.ItemId2 = ItemId2;
    }

    /**
     *
     * @return
     * The ItemId3
     */
    public int getItemId3() {
        return ItemId3;
    }

    /**
     *
     * @param ItemId3
     * The ItemId3
     */
    public void setItemId3(int ItemId3) {
        this.ItemId3 = ItemId3;
    }

    /**
     *
     * @return
     * The ItemId4
     */
    public int getItemId4() {
        return ItemId4;
    }

    /**
     *
     * @param ItemId4
     * The ItemId4
     */
    public void setItemId4(int ItemId4) {
        this.ItemId4 = ItemId4;
    }

    /**
     *
     * @return
     * The ItemId5
     */
    public int getItemId5() {
        return ItemId5;
    }

    /**
     *
     * @param ItemId5
     * The ItemId5
     */
    public void setItemId5(int ItemId5) {
        this.ItemId5 = ItemId5;
    }

    /**
     *
     * @return
     * The ItemId6
     */
    public int getItemId6() {
        return ItemId6;
    }

    /**
     *
     * @param ItemId6
     * The ItemId6
     */
    public void setItemId6(int ItemId6) {
        this.ItemId6 = ItemId6;
    }

    /**
     *
     * @return
     * The Item_Active_1
     */
    public String getItem_Active_1() {
        return Item_Active_1;
    }

    /**
     *
     * @param Item_Active_1
     * The Item_Active_1
     */
    public void setItem_Active_1(String Item_Active_1) {
        this.Item_Active_1 = Item_Active_1;
    }

    /**
     *
     * @return
     * The Item_Active_2
     */
    public String getItem_Active_2() {
        return Item_Active_2;
    }

    /**
     *
     * @param Item_Active_2
     * The Item_Active_2
     */
    public void setItem_Active_2(String Item_Active_2) {
        this.Item_Active_2 = Item_Active_2;
    }

    /**
     *
     * @return
     * The Item_Active_3
     */
    public String getItem_Active_3() {
        return Item_Active_3;
    }

    /**
     *
     * @param Item_Active_3
     * The Item_Active_3
     */
    public void setItem_Active_3(String Item_Active_3) {
        this.Item_Active_3 = Item_Active_3;
    }

    /**
     *
     * @return
     * The Item_Purch_1
     */
    public String getItem_Purch_1() {
        return Item_Purch_1;
    }

    /**
     *
     * @param Item_Purch_1
     * The Item_Purch_1
     */
    public void setItem_Purch_1(String Item_Purch_1) {
        this.Item_Purch_1 = Item_Purch_1;
    }

    /**
     *
     * @return
     * The Item_Purch_2
     */
    public String getItem_Purch_2() {
        return Item_Purch_2;
    }

    /**
     *
     * @param Item_Purch_2
     * The Item_Purch_2
     */
    public void setItem_Purch_2(String Item_Purch_2) {
        this.Item_Purch_2 = Item_Purch_2;
    }

    /**
     *
     * @return
     * The Item_Purch_3
     */
    public String getItem_Purch_3() {
        return Item_Purch_3;
    }

    /**
     *
     * @param Item_Purch_3
     * The Item_Purch_3
     */
    public void setItem_Purch_3(String Item_Purch_3) {
        this.Item_Purch_3 = Item_Purch_3;
    }

    /**
     *
     * @return
     * The Item_Purch_4
     */
    public String getItem_Purch_4() {
        return Item_Purch_4;
    }

    /**
     *
     * @param Item_Purch_4
     * The Item_Purch_4
     */
    public void setItem_Purch_4(String Item_Purch_4) {
        this.Item_Purch_4 = Item_Purch_4;
    }

    /**
     *
     * @return
     * The Item_Purch_5
     */
    public String getItem_Purch_5() {
        return Item_Purch_5;
    }

    /**
     *
     * @param Item_Purch_5
     * The Item_Purch_5
     */
    public void setItem_Purch_5(String Item_Purch_5) {
        this.Item_Purch_5 = Item_Purch_5;
    }

    /**
     *
     * @return
     * The Item_Purch_6
     */
    public String getItem_Purch_6() {
        return Item_Purch_6;
    }

    /**
     *
     * @param Item_Purch_6
     * The Item_Purch_6
     */
    public void setItem_Purch_6(String Item_Purch_6) {
        this.Item_Purch_6 = Item_Purch_6;
    }

    /**
     *
     * @return
     * The Joust_Losses
     */
    public int getJoust_Losses() {
        return Joust_Losses;
    }

    /**
     *
     * @param Joust_Losses
     * The Joust_Losses
     */
    public void setJoust_Losses(int Joust_Losses) {
        this.Joust_Losses = Joust_Losses;
    }

    /**
     *
     * @return
     * The Joust_Points
     */
    public int getJoust_Points() {
        return Joust_Points;
    }

    /**
     *
     * @param Joust_Points
     * The Joust_Points
     */
    public void setJoust_Points(int Joust_Points) {
        this.Joust_Points = Joust_Points;
    }

    /**
     *
     * @return
     * The Joust_Tier
     */
    public int getJoust_Tier() {
        return Joust_Tier;
    }

    /**
     *
     * @param Joust_Tier
     * The Joust_Tier
     */
    public void setJoust_Tier(int Joust_Tier) {
        this.Joust_Tier = Joust_Tier;
    }

    /**
     *
     * @return
     * The Joust_Wins
     */
    public int getJoust_Wins() {
        return Joust_Wins;
    }

    /**
     *
     * @param Joust_Wins
     * The Joust_Wins
     */
    public void setJoust_Wins(int Joust_Wins) {
        this.Joust_Wins = Joust_Wins;
    }

    /**
     *
     * @return
     * The Killing_Spree
     */
    public int getKilling_Spree() {
        return Killing_Spree;
    }

    /**
     *
     * @param Killing_Spree
     * The Killing_Spree
     */
    public void setKilling_Spree(int Killing_Spree) {
        this.Killing_Spree = Killing_Spree;
    }

    /**
     *
     * @return
     * The Kills_Bot
     */
    public int getKills_Bot() {
        return Kills_Bot;
    }

    /**
     *
     * @param Kills_Bot
     * The Kills_Bot
     */
    public void setKills_Bot(int Kills_Bot) {
        this.Kills_Bot = Kills_Bot;
    }

    /**
     *
     * @return
     * The Kills_Double
     */
    public int getKills_Double() {
        return Kills_Double;
    }

    /**
     *
     * @param Kills_Double
     * The Kills_Double
     */
    public void setKills_Double(int Kills_Double) {
        this.Kills_Double = Kills_Double;
    }

    /**
     *
     * @return
     * The Kills_Fire_Giant
     */
    public int getKills_Fire_Giant() {
        return Kills_Fire_Giant;
    }

    /**
     *
     * @param Kills_Fire_Giant
     * The Kills_Fire_Giant
     */
    public void setKills_Fire_Giant(int Kills_Fire_Giant) {
        this.Kills_Fire_Giant = Kills_Fire_Giant;
    }

    /**
     *
     * @return
     * The Kills_First_Blood
     */
    public int getKills_First_Blood() {
        return Kills_First_Blood;
    }

    /**
     *
     * @param Kills_First_Blood
     * The Kills_First_Blood
     */
    public void setKills_First_Blood(int Kills_First_Blood) {
        this.Kills_First_Blood = Kills_First_Blood;
    }

    /**
     *
     * @return
     * The Kills_Gold_Fury
     */
    public int getKills_Gold_Fury() {
        return Kills_Gold_Fury;
    }

    /**
     *
     * @param Kills_Gold_Fury
     * The Kills_Gold_Fury
     */
    public void setKills_Gold_Fury(int Kills_Gold_Fury) {
        this.Kills_Gold_Fury = Kills_Gold_Fury;
    }

    /**
     *
     * @return
     * The Kills_Penta
     */
    public int getKills_Penta() {
        return Kills_Penta;
    }

    /**
     *
     * @param Kills_Penta
     * The Kills_Penta
     */
    public void setKills_Penta(int Kills_Penta) {
        this.Kills_Penta = Kills_Penta;
    }

    /**
     *
     * @return
     * The Kills_Phoenix
     */
    public int getKills_Phoenix() {
        return Kills_Phoenix;
    }

    /**
     *
     * @param Kills_Phoenix
     * The Kills_Phoenix
     */
    public void setKills_Phoenix(int Kills_Phoenix) {
        this.Kills_Phoenix = Kills_Phoenix;
    }

    /**
     *
     * @return
     * The Kills_Player
     */
    public int getKills_Player() {
        return Kills_Player;
    }

    /**
     *
     * @param Kills_Player
     * The Kills_Player
     */
    public void setKills_Player(int Kills_Player) {
        this.Kills_Player = Kills_Player;
    }

    /**
     *
     * @return
     * The Kills_Quadra
     */
    public int getKills_Quadra() {
        return Kills_Quadra;
    }

    /**
     *
     * @param Kills_Quadra
     * The Kills_Quadra
     */
    public void setKills_Quadra(int Kills_Quadra) {
        this.Kills_Quadra = Kills_Quadra;
    }

    /**
     *
     * @return
     * The Kills_Siege_Juggernaut
     */
    public int getKills_Siege_Juggernaut() {
        return Kills_Siege_Juggernaut;
    }

    /**
     *
     * @param Kills_Siege_Juggernaut
     * The Kills_Siege_Juggernaut
     */
    public void setKills_Siege_Juggernaut(int Kills_Siege_Juggernaut) {
        this.Kills_Siege_Juggernaut = Kills_Siege_Juggernaut;
    }

    /**
     *
     * @return
     * The Kills_Single
     */
    public int getKills_Single() {
        return Kills_Single;
    }

    /**
     *
     * @param Kills_Single
     * The Kills_Single
     */
    public void setKills_Single(int Kills_Single) {
        this.Kills_Single = Kills_Single;
    }

    /**
     *
     * @return
     * The Kills_Triple
     */
    public int getKills_Triple() {
        return Kills_Triple;
    }

    /**
     *
     * @param Kills_Triple
     * The Kills_Triple
     */
    public void setKills_Triple(int Kills_Triple) {
        this.Kills_Triple = Kills_Triple;
    }

    /**
     *
     * @return
     * The Kills_Wild_Juggernaut
     */
    public int getKills_Wild_Juggernaut() {
        return Kills_Wild_Juggernaut;
    }

    /**
     *
     * @param Kills_Wild_Juggernaut
     * The Kills_Wild_Juggernaut
     */
    public void setKills_Wild_Juggernaut(int Kills_Wild_Juggernaut) {
        this.Kills_Wild_Juggernaut = Kills_Wild_Juggernaut;
    }

    /**
     *
     * @return
     * The Mastery_Level
     */
    public int getMastery_Level() {
        return Mastery_Level;
    }

    /**
     *
     * @param Mastery_Level
     * The Mastery_Level
     */
    public void setMastery_Level(int Mastery_Level) {
        this.Mastery_Level = Mastery_Level;
    }

    /**
     *
     * @return
     * The Match
     */
    public int getMatch() {
        return Match;
    }

    /**
     *
     * @param Match
     * The Match
     */
    public void setMatch(int Match) {
        this.Match = Match;
    }

    /**
     *
     * @return
     * The Minutes
     */
    public int getMinutes() {
        return Minutes;
    }

    /**
     *
     * @param Minutes
     * The Minutes
     */
    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    /**
     *
     * @return
     * The Multi_kill_Max
     */
    public int getMulti_kill_Max() {
        return Multi_kill_Max;
    }

    /**
     *
     * @param Multi_kill_Max
     * The Multi_kill_Max
     */
    public void setMulti_kill_Max(int Multi_kill_Max) {
        this.Multi_kill_Max = Multi_kill_Max;
    }

    /**
     *
     * @return
     * The PartyId
     */
    public int getPartyId() {
        return PartyId;
    }

    /**
     *
     * @param PartyId
     * The PartyId
     */
    public void setPartyId(int PartyId) {
        this.PartyId = PartyId;
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
     * The Reference_Name
     */
    public String getReference_Name() {
        return Reference_Name;
    }

    /**
     *
     * @param Reference_Name
     * The Reference_Name
     */
    public void setReference_Name(String Reference_Name) {
        this.Reference_Name = Reference_Name;
    }

    /**
     *
     * @return
     * The Skin
     */
    public String getSkin() {
        return Skin;
    }

    /**
     *
     * @param Skin
     * The Skin
     */
    public void setSkin(String Skin) {
        this.Skin = Skin;
    }

    /**
     *
     * @return
     * The SkinId
     */
    public int getSkinId() {
        return SkinId;
    }

    /**
     *
     * @param SkinId
     * The SkinId
     */
    public void setSkinId(int SkinId) {
        this.SkinId = SkinId;
    }

    /**
     *
     * @return
     * The Structure_Damage
     */
    public int getStructure_Damage() {
        return Structure_Damage;
    }

    /**
     *
     * @param Structure_Damage
     * The Structure_Damage
     */
    public void setStructure_Damage(int Structure_Damage) {
        this.Structure_Damage = Structure_Damage;
    }

    /**
     *
     * @return
     * The Surrendered
     */
    public Object getSurrendered() {
        return Surrendered;
    }

    /**
     *
     * @param Surrendered
     * The Surrendered
     */
    public void setSurrendered(String Surrendered) {
        this.Surrendered = Surrendered;
    }

    /**
     *
     * @return
     * The Team1Score
     */
    public int getTeam1Score() {
        return Team1Score;
    }

    /**
     *
     * @param Team1Score
     * The Team1Score
     */
    public void setTeam1Score(int Team1Score) {
        this.Team1Score = Team1Score;
    }

    /**
     *
     * @return
     * The Team2Score
     */
    public int getTeam2Score() {
        return Team2Score;
    }

    /**
     *
     * @param Team2Score
     * The Team2Score
     */
    public void setTeam2Score(int Team2Score) {
        this.Team2Score = Team2Score;
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
     * The Towers_Destroyed
     */
    public int getTowers_Destroyed() {
        return Towers_Destroyed;
    }

    /**
     *
     * @param Towers_Destroyed
     * The Towers_Destroyed
     */
    public void setTowers_Destroyed(int Towers_Destroyed) {
        this.Towers_Destroyed = Towers_Destroyed;
    }

    /**
     *
     * @return
     * The Wards_Placed
     */
    public int getWards_Placed() {
        return Wards_Placed;
    }

    /**
     *
     * @param Wards_Placed
     * The Wards_Placed
     */
    public void setWards_Placed(int Wards_Placed) {
        this.Wards_Placed = Wards_Placed;
    }

    /**
     *
     * @return
     * The Win_Status
     */
    public String getWin_Status() {
        return Win_Status;
    }

    /**
     *
     * @param Win_Status
     * The Win_Status
     */
    public void setWin_Status(String Win_Status) {
        this.Win_Status = Win_Status;
    }

    /**
     *
     * @return
     * The hasReplay
     */
    public String getHasReplay() {
        return hasReplay;
    }

    /**
     *
     * @param hasReplay
     * The hasReplay
     */
    public void setHasReplay(String hasReplay) {
        this.hasReplay = hasReplay;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
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
     * The playerId
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     *
     * @return
     * The playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     *
     * @param playerName
     * The playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     *
     * @return
     * The ret_msg
     */
    public String getRet_msg() {
        return ret_msg;
    }

    /**
     *
     * @param ret_msg
     * The ret_msg
     */
    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

}