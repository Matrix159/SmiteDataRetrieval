import retrofit.RestAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Josh on 3/14/2016.
 */
public class Main {
    private static String devID, authKey, timestamp;
    public static void main(String[] args)
    {
        devID = "1621";
        authKey = "C7674733395A4668B6A6E983865A9EDB";
        SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyyMMddHHmmss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        timestamp =  dateFormat.format(new Date());
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.smitegame.com/smiteapi.svc")
                .build();
        SmiteApi service = restAdapter.create(SmiteApi.class);
       // timestamp = newTimeStamp();
        String sig = createSignature(timestamp);
        System.out.println(timestamp);
        System.out.println(sig);

        SessionInfo sessionInfo = service.createSession(devID, sig, timestamp);
        System.out.println(sessionInfo.getSession_id());
        timestamp = dateFormat.format(new Date());
        sig = createSignature(timestamp);
        System.out.println(timestamp);
        System.out.println(sig);
        //service.getPlayerASynch(devID, createSignature(timestamp), sessionInfo.getSession_id(), timestamp, "scatmancon2", new ASynchCall());

        try
        {
            URL base = new URL("http://api.smitegame.com/smiteapi.svc/gettopmatchesJson/" +devID + "/" + createSignature(timestamp) + "/" + sessionInfo.getSession_id() + "/" + timestamp);// +
            //"/" + "Matrix159");
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
    private static String newTimeStamp()
    {
        SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyyMMddHHmmss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        timestamp =  dateFormat.format(new Date());
        return timestamp;
    }
    private static String createSignature(String timestamp)
    {

        String signature = getMD5Hash(devID + "createsession" + authKey + timestamp);
        return signature;
    }
    private static String getMD5Hash(String input) {
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
