package edu.gvsu.cis;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

/**
 * Created by Josh on 2/17/2016.
 */
public interface SmiteApi {

    @GET("/getplayerJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<PlayerInfo> getPlayer(@Path("devId") String a, @Path("signature") String b, @Path("sessionId") String c,
                          @Path("timestamp") String d,
                          @Path("playerName") String e);

    @GET("/getfriendsJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<FriendsInfo> getFriends(@Path("devId") String a, @Path("signature") String b, @Path("sessionId") String c,
                                 @Path("timestamp") String d,
                                 @Path("playerName") String e);

    @GET("/getgodranksJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    List<PlayerGodInfo> getGodRanks(@Path("devId") String a, @Path("signature") String b, @Path("sessionId") String c,
                                 @Path("timestamp") String d,
                                 @Path("playerName") String e);

    @GET("/createsessionJson/{devId}/{signature}/{timestamp}")
    SessionInfo createSession (@Path("devId") String a, @Path("signature") String b, @Path("timestamp") String c);

}
