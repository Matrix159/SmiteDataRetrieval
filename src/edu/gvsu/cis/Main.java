package edu.gvsu.cis;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * Created by Josh on 3/14/2016.
 */
public class Main {
    private static final String DEV_ID = "1621";
    private static final String AUTH_KEY = "C7674733395A4668B6A6E983865A9EDB";
    private String timestamp;
    Firebase myRef;
    String sessionId;
    SmiteApi service;
    public Main()
    {
        timestamp =  newTimeStamp();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.smitegame.com/smiteapi.svc")
                .build();
        service = restAdapter.create(SmiteApi.class);
        myRef = new Firebase("https://flickering-fire-637.firebaseio.com/sessionid");
        //sessionId = service.createSession(DEV_ID, createSignature("createsession"), timestamp).getSession_id();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                sessionId = (String) snapshot.getValue();
                String test = service.testSession(DEV_ID, createSignature("testsession"), sessionId, timestamp);
                System.out.println(test);
                if(test.contains("Invalid"))
                {
                    sessionId = service.createSession(DEV_ID, createSignature("createsession"), timestamp).getSession_id();
                    System.out.println(sessionId);
                    String test1 = service.testSession(DEV_ID, createSignature("testsession"), sessionId, timestamp);
                    if(test1.contains("successful"))
                        myRef.setValue(sessionId);
                }




            }

            @Override
            public void onCancelled(FirebaseError error) {
                System.out.println("Did it fail?");
            }
        });

while(true);
        //System.out.println(sessionInfo.getSession_id());
        /*List<FriendsInfo> friendsInfoList = service.getFriends(DEV_ID, createSignature("getfriends"), sessionInfo.getSession_id(), timestamp, "shootlootrepeat");
        for(FriendsInfo x : friendsInfoList)
        {
            System.out.println(x.getName());
        }*/
        //Scanner scan = new Scanner(System.in);
        /*while(scan != null)
        {
            System.out.print("Enter player name: ");
            String name = scan.nextLine();
            List<PlayerInfo> playerInfoList = service.getPlayer(DEV_ID, createSignature("getplayer"), sessionInfo.getSession_id(), timestamp, name);
            System.out.println("Leaves: "+ playerInfoList.get(0).getLeaves());
            System.out.println(name +"'s Win percentage: " + (double)((double)playerInfoList.get(0).getWins() / (double)(playerInfoList.get(0).getWins() + playerInfoList.get(0).getLosses())));
        }*/

        //List<PlayerInfo> playerInfoList = service.getPlayer(DEV_ID, createSignature("getplayer"), sessionInfo.getSession_id(), timestamp, name);
        //System.out.println("Player level:" + playerInfoList.get(0).getLevel());

        //URLTester.testURL("testsessionJson", DEV_ID, createSignature("testsession"), sessionId, timestamp);

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
