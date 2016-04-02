package edu.gvsu.cis.tests;

import edu.gvsu.cis.SmiteMaster;
import edu.gvsu.cis.playerinfo.PlayerGodInfo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/****************************************
 * Tests PlayerGodInfo.java
 *
 * Created by Dustin Thurston
 * on 4/2/16.
 ****************************************/
public class PlayerGodInfoTest {

    @Test
    public void playerGodInfoTest() throws Exception{

        SmiteMaster master = new SmiteMaster();
        List<PlayerGodInfo> list = master.getPlayerGodInfo("xStaticVoid");

        for(PlayerGodInfo x: list){
            assertTrue("Assists", x.getAssists() >= 0);
            assertTrue("Deaths", x.getDeaths() >= 0);
            assertTrue("Kills", x.getKills() >= 0);
            assertTrue("Losses", x.getLosses() >= 0);
            assertTrue("Minion Kills", x.getMinionKills() >=0);
            assertTrue("Rank", x.getRank() >=0);
            assertTrue("Wins", x.getWins() >=0);
            assertTrue("Worshippers", x.getWorshippers() >=0);
            assertTrue("God", x.getGod() != null);
            assertTrue("God ID", x.getGodId() != null);
            assertTrue("Player ID", x.getPlayerId() != null);
            assertTrue("Return Message", x.getRetMsg() == null);
        }

    }
}
