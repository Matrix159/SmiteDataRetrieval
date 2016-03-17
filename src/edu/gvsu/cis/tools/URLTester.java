package edu.gvsu.cis.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Eldridge on 3/16/2016.
 */
public class URLTester {

    public URLTester()
    {

    }

    /**
     *
     * @param method Method call name
     * @param DEV_ID Dev Id
     * @param signature Unique signature
     * @param sessionId Session ID
     * @param timestamp A timestamp in UTC
     * @param username Smite username
     */
    public static void testURL(String method, String DEV_ID, String signature, String sessionId, String timestamp, String username)
    {
        try
        {
            URL base = new URL("http://api.smitegame.com/smiteapi.svc/" + method + "/"+ DEV_ID +
                    "/" + signature + "/" + sessionId + "/" + timestamp
                    + "/" + username);
            URLConnection connection = base.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

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

    public static void testURL(String method, String DEV_ID, String signature, String sessionId, String timestamp)
    {
        try
        {
            URL base = new URL("http://api.smitegame.com/smiteapi.svc/" + method + "/"+ DEV_ID +
                    "/" + signature + "/" + sessionId + "/" + timestamp);
            URLConnection connection = base.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

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
}
