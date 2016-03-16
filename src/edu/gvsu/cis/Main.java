package edu.gvsu.cis;

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
    public Main()
    {
        timestamp =  newTimeStamp();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.smitegame.com/smiteapi.svc")
                .build();
        SmiteApi service = restAdapter.create(SmiteApi.class);
        SessionInfo sessionInfo = service.createSession(DEV_ID, createSignature("createsession"), timestamp);
        System.out.println(sessionInfo.getSession_id());
        Scanner scan = new Scanner(System.in);
        while(scan != null)
        {
            System.out.print("Enter player name: ");
            String name = scan.nextLine();
            List<PlayerInfo> playerInfoList = service.getPlayer(DEV_ID, createSignature("getplayer"), sessionInfo.getSession_id(), timestamp, name);
            System.out.println(name +"'s Win percentage: " + (double)((double)playerInfoList.get(0).getWins() / (double)(playerInfoList.get(0).getWins() + playerInfoList.get(0).getLosses())));
        }

        //List<PlayerInfo> playerInfoList = service.getPlayer(DEV_ID, createSignature("getplayer"), sessionInfo.getSession_id(), timestamp, name);
        //System.out.println("Player level:" + playerInfoList.get(0).getLevel());

        try
        {
            URL base = new URL("http://api.smitegame.com/smiteapi.svc/getplayerJson/" + DEV_ID + "/" + createSignature("getplayer") + "/" + sessionInfo.getSession_id() + "/" + timestamp +
            "/" + "doomninja115");
            URLConnection connection = base.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

            // asking for 20 words that rhyme with "computer"

        }
        catch(MalformedURLException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
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
