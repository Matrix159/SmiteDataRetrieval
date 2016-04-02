package edu.gvsu.cis;


import edu.gvsu.cis.playerinfo.*;

import java.util.List;

/**
 * Created by Josh on 3/14/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        SmiteMaster master = new SmiteMaster();
        List<PlayerInfo> list = master.getPlayer("scooterop");
        for(PlayerInfo x : list)
        {
            System.out.println(x.getId());
        }
    }


}
