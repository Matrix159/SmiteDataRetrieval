package edu.gvsu.cis;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import edu.gvsu.cis.connectioninfo.SessionInfo;
import edu.gvsu.cis.playerinfo.FriendsInfo;
import edu.gvsu.cis.playerinfo.PlayerGodInfo;
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
        timestamp =  newTimeStamp();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.smitegame.com/smiteapi.svc")
                .build();
        service = restAdapter.create(SmiteApi.class);
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
    }



    public SessionInfo createSession()
    {
        return service.createSession(DEV_ID, createSignature("createsession"), timestamp);
    }

    public String testSession()
    {
        return service.testSession(DEV_ID, createSignature("testsession"), sessionId, timestamp);
    }

    public String getDataUsed()
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
