package edu.gvsu.cis;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import edu.gvsu.cis.connectioninfo.DataUsedInfo;
import edu.gvsu.cis.connectioninfo.SessionInfo;
import edu.gvsu.cis.godinfo.GodInfo;
import edu.gvsu.cis.iteminfo.ItemInfo;
import edu.gvsu.cis.matchinfo.MatchDetails;
import edu.gvsu.cis.matchinfo.RecentMatch;
import edu.gvsu.cis.playerinfo.FriendsInfo;
import edu.gvsu.cis.playerinfo.PlayerGodInfo;
import edu.gvsu.cis.playerinfo.PlayerInfo;
import edu.gvsu.cis.playerinfo.PlayerStatus;
import retrofit.RestAdapter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Eldridge on 3/23/2016.
 */
public class SmiteMaster  {

    private static final String DEV_ID = "1621";
    private static final String AUTH_KEY = "C7674733395A4668B6A6E983865A9EDB";
    private String timestamp;
    Firebase myRef;
    String sessionId = null;
    SmiteApi service;
    public SmiteMaster()
    {
        myRef = new Firebase("https://matrixprogramming.firebaseio.com/sessioninfo/");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                sessionId = dataSnapshot.child("session_id").getValue().toString();
                System.out.println(sessionId);
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("Firebase Error.");
            }
        });
        timestamp =  newTimeStamp();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.smitegame.com/smiteapi.svc")
                .build();
        service = restAdapter.create(SmiteApi.class);

        while(sessionId == null)
        {
            //System.out.println("wat");
            try
            {
                Thread.sleep(0);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println("http://api.smitegame.com/smiteapi.svc/getmatchhistoryJson/" + DEV_ID+"/" + createSignature("getmatchhistory")+"/" + sessionId+"/" + timestamp+"/" + "Matrix159");
    }



    public SessionInfo createSession()
    {
        return service.createSession(DEV_ID, createSignature("createsession"), timestamp);
    }

    public String testSession()
    {
        return service.testSession(DEV_ID, createSignature("testsession"), sessionId, timestamp);
    }

    public List<DataUsedInfo> getDataUsed()
    {
        return service.getDataUsed(DEV_ID, createSignature("getdataused"), sessionId, timestamp);
    }

    public List<FriendsInfo> getFriends(String player)
    {
        return service.getFriends(DEV_ID, createSignature("getfriends"), sessionId, timestamp, player);
    }

    public List<PlayerGodInfo> getPlayerGodInfo(String player)
    {
        return service.getGodRanks(DEV_ID, createSignature("getgodranks"), sessionId, timestamp, player);
    }

    public List<GodInfo> getGods(int languageCode)
    {
        return service.getGods(DEV_ID, createSignature("getgods"), sessionId, timestamp, languageCode);
    }

    public List<ItemInfo> getItems(int languageCode)
    {
        return service.getItems(DEV_ID, createSignature("getitems"), sessionId, timestamp, languageCode);
    }

    public List<MatchDetails> getMatchDetails(int matchId)
    {
        return service.getMatchDetails(DEV_ID, createSignature("getmatchdetails"), sessionId, timestamp, matchId);
    }

    public List<RecentMatch> getMatchHistory(String player)
    {
        return service.getMatchHistory(DEV_ID, createSignature("getmatchhistory"), sessionId, timestamp, player);
    }

    public List<PlayerInfo> getPlayer(String player)
    {
        return service.getPlayer(DEV_ID, createSignature("getplayer"), sessionId, timestamp, player);
    }

    public List<PlayerStatus> getPlayerStatus(String player)
    {
        return service.getPlayerStatus(DEV_ID, createSignature("getplayerstatus"), sessionId, timestamp, player);
    }


    private String newTimeStamp()
    {
        SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyyMMddHHmmss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        timestamp =  dateFormat.format(new Date());
        return timestamp;
    }

    private String createSignature(String type)
    {

        String signature = getMD5Hash(DEV_ID + type + AUTH_KEY + timestamp);
        return signature;
    }

    private static String getMD5Hash(String input)
    {
        StringBuilder sb =  new StringBuilder();
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(input.getBytes("UTF-8"));
            for(byte b : thedigest) {
                sb.append(String.format("%02X", b).toLowerCase());
            }

        }
        catch(UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
        }
        catch(NoSuchAlgorithmException ex)
        {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
