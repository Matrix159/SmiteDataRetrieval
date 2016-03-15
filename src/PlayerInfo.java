/**
 * Created by Eldridge on 3/14/2016.
 */
public class PlayerInfo
{
    private String Created_Datetime, Last_Login_Datetime , Name, Team_Name, ret_msg;
    private int Leaves, Level, Losses, MasteryLevel, Rank_Stat, TeamId, Wins;

    public String getCreated_Datetime() {
        return Created_Datetime;
    }

    public String getLast_Login_Datetime() {
        return Last_Login_Datetime;
    }

    public String getName() {
        return Name;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public int getLeaves() {
        return Leaves;
    }

    public int getLevel() {
        return Level;
    }

    public int getLosses() {
        return Losses;
    }

    public int getMasteryLevel() {
        return MasteryLevel;
    }

    public int getRank_Stat() {
        return Rank_Stat;
    }

    public int getTeamId() {
        return TeamId;
    }

    public int getWins() {
        return Wins;
    }

    public PlayerInfo(String Created_Datetime, String Last_Login_Datetime, String Name, String Team_Name, String ret_msg, int Leaves, int Level, int Losses, int MasteryLevel, int Rank_Stat, int TeamId, int Wins) {
        this.Created_Datetime = Created_Datetime;
        this.Last_Login_Datetime = Last_Login_Datetime;
        this.Name = Name;
        this.Team_Name = Team_Name;
        this.ret_msg = ret_msg;
        this.Leaves = Leaves;
        this.Level = Level;
        this.Losses = Losses;
        this.MasteryLevel = MasteryLevel;
        this.Rank_Stat = Rank_Stat;
        this.TeamId = TeamId;
        this.Wins = Wins;
    }
}