package edu.gvsu.cis.tests;

import edu.gvsu.cis.SmiteMaster;
import edu.gvsu.cis.playerinfo.PlayerInfo;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertTrue;

public class PlayerInfoTest {



    @Test
    public void testPlayerStrings() throws Exception
    {
        SmiteMaster master = new SmiteMaster();
        List<PlayerInfo> list = master.getPlayer("Matrix159");
        for(PlayerInfo x : list)
        {
            assertTrue("Avatar_URL", x.getAvatar_URL()!= null);
            assertTrue("Created_Datetime", x.getCreated_Datetime() != null);
            assertTrue("Last_Login_Datetime", x.getLast_Login_Datetime() != null);
            assertTrue("Name", x.getName() != null);
            assertTrue("RankedConquest", x.getRankedConquest() != null);
            assertTrue("RankedDuel", x.getRankedDuel() != null);
            assertTrue("RankedJoust", x.getRankedJoust() != null);
            assertTrue("Team_Name", x.getTeam_Name() != null);
            assertTrue("ret_msg", x.getRet_msg() == null);
        }
    }
    
}