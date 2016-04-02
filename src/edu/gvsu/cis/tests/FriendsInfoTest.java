package edu.gvsu.cis.tests;

import edu.gvsu.cis.SmiteMaster;
import edu.gvsu.cis.playerinfo.FriendsInfo;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


import java.util.List;

/**
 * Created by Dustin Thurston
 * on 4/2/16.
 */
public class FriendsInfoTest {

    /********************************************
     * Testing the friends info with Dustin's
     * username cause he has no friends on smite
     * @throws Exception
     ********************************************/
    @Test
    public void testFriendsInfo() throws Exception{

        SmiteMaster master = new SmiteMaster();
        List<FriendsInfo> list = master.getFriends("xStaticVoid");

        for(FriendsInfo x: list){
            assertTrue("Account ID", x.getAccountId() != null);
            assertTrue("Avatar URL", x.getAvatarUrl() != null);
            assertTrue("Get Name", x.getName() != null);
            assertTrue("Player ID", x.getPlayerId() != null);
            assertTrue("Ret Message", x.getRetMsg() == null);  //Returns null on good response
        }
    }

    /************************************
     * Testing with Josh's username
     * @throws Exception
     ************************************/
    @Test
    public void testFriendsInfo2() throws Exception{

        SmiteMaster master = new SmiteMaster();
        List<FriendsInfo> list = master.getFriends("Matrix159");

        for(FriendsInfo x: list){
            assertTrue("Account ID", x.getAccountId() != null);
            assertTrue("Avatar URL", x.getAvatarUrl() != null);
            assertTrue("Get Name", x.getName() != null);
            assertTrue("Player ID", x.getPlayerId() != null);
            assertTrue("Ret Message", x.getRetMsg() == null);  //Returns null on good response
        }
    }

    /**************************************
     * Let's see what happens when you
     * enter a bad user name
     **************************************/
    @Test
    public void badUsernameTest() throws Exception{

        SmiteMaster master = new SmiteMaster();
        List<FriendsInfo> list = master.getFriends("anveweufjoweihgkjnjfh");

        for(FriendsInfo x: list){
            assertTrue("Account ID", x.getAccountId() == null);
            assertTrue("Avatar URL", x.getAvatarUrl() == null);
            assertTrue("Get Name", x.getName() == null);
            assertTrue("Player ID", x.getPlayerId() == null);
            assertTrue("Ret Message", x.getRetMsg() != null);
        }
    }
}
