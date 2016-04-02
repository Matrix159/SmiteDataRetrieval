package edu.gvsu.cis;


import edu.gvsu.cis.playerinfo.PlayerGodInfo;

import java.util.List;

/**
 * Created by Josh on 3/14/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        SmiteMaster master = new SmiteMaster();
        List<PlayerGodInfo> list = master.getPlayerGodInfo("scatmancon2");
        for(PlayerGodInfo x : list)
        {
            System.out.println(x.getGod() + " : Wins " + x.getWins());
        }
    }


}
