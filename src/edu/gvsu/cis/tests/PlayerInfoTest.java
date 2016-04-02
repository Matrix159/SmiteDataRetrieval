package edu.gvsu.cis.tests;

import edu.gvsu.cis.SmiteMaster;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlayerInfoTest {



    @Test
    public void testPlayerStrings() throws Exception{
        SmiteMaster master = new SmiteMaster();
        assertTrue("Created_Datetime", master.getPlayer("Matrix159").get(0).getCreated_Datetime() != null);

    }
}