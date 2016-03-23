package edu.gvsu.cis;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import edu.gvsu.cis.godinfo.GodInfo;
import edu.gvsu.cis.iteminfo.ItemInfo;
import edu.gvsu.cis.matchinfo.MatchDetails;
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
    private static final String DEV_ID = "1621";
    private static final String AUTH_KEY = "C7674733395A4668B6A6E983865A9EDB";
    private String timestamp;
    Firebase myRef;
    String sessionId = null;
    SmiteApi service;
    public Main()
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

            }
        });
        while(sessionId == null)
        {
            System.out.println("wat");
        }
        System.out.println("http://api.smitegame.com/smiteapi.svc/getmatchdetailsJson/" + DEV_ID + "/" + createSignature("getmatchdetails") + "/" +sessionId + "/" + timestamp + "/" + 235886368);
        List<MatchDetails> list = service.getMatchDetails(DEV_ID, createSignature("getmatchdetails"),sessionId, timestamp, 235886368);
        for(MatchDetails x : list) {
            System.out.println(x.getPlayerName() + " : " + x.getKills_Player());
        }


    }
    public static void main(String[] args)
    {
        Main main = new Main();
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
    public static String getMD5Hash(String input)
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
