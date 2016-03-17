package edu.gvsu.cis;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

/**
 * Created by Josh on 2/17/2016.
 */
public interface SmiteApi {

    /**
     * Retrieves player info
     * @param devId
     * @param signature
     * @param sessionId
     * @param timestamp
     * @param playerName
     * @return A list for each player
     */
    @GET("/getplayerJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<PlayerInfo> getPlayer(@Path("devId") String devId, @Path("signature") String signature, @Path("sessionId") String sessionId,
                          @Path("timestamp") String timestamp,
                          @Path("playerName") String playerName);

    /**
     * Retrieves friend info for a given player
     * @param devId
     * @param signature
     * @param sessionId
     * @param timestamp
     * @param playerName
     * @return A list for friend info
     */
    @GET("/getfriendsJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<FriendsInfo> getFriends(@Path("devId") String devId, @Path("signature") String signature, @Path("sessionId") String sessionId,
                                 @Path("timestamp") String timestamp,
                                 @Path("playerName") String playerName);

    @GET("/getgodranksJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<PlayerGodInfo> getGodRanks(@Path("devId") String a, @Path("signature") String b, @Path("sessionId") String c,
                                 @Path("timestamp") String d,
                                 @Path("playerName") String e);

    @GET("/createsessionJson/{devId}/{signature}/{timestamp}")
    SessionInfo createSession (@Path("devId") String a, @Path("signature") String b, @Path("timestamp") String c);

    @GET("/testsessionJson/{devId}/{signature}/{sessionId}/{timestamp}")
    String testSession(@Path("devId") String devId, @Path("signature") String signature, @Path("sessionId") String sessionId, @Path("timestamp") String timestamp);


}
