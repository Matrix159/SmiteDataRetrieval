package edu.gvsu.cis;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import edu.gvsu.cis.connectioninfo.SessionInfo;
import edu.gvsu.cis.godinfo.GodInfo;
import edu.gvsu.cis.iteminfo.ItemInfo;
import edu.gvsu.cis.matchinfo.MatchDetails;
import edu.gvsu.cis.matchinfo.RecentMatch;
import edu.gvsu.cis.playerinfo.FriendsInfo;
import edu.gvsu.cis.tools.URLTester;
import retrofit.RestAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * Created by Josh on 3/14/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        SmiteMaster master = new SmiteMaster();
        List<FriendsInfo> list = master.getFriends("Matrix159");
        for(FriendsInfo x: list)
        {
            System.out.println(x.getName());
        }
    }


}
