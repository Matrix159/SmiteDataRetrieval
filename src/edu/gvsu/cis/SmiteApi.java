package edu.gvsu.cis;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

/**
 * Created by Josh on 2/17/2016.
 */
public interface SmiteApi {
    /* @GET("/talk?function=getRhymes")
    List<WordInfo> getRhymes(@Query("word") String w, @Query("maxResults") int n);*/

    @GET("/getplayerJson/{devId}/{signature}/{sessionId}/{timestamp}/{playerName}")
    void getPlayerASynch (@Path("devId") String a, @Path("signature") String b, @Path("sessionId") String c,
                          @Path("timestamp") String d,
                          @Path("playerName") String e,
                          Callback<List<PlayerInfo>> cb);

    @GET("/createsessionJson/{devId}/{signature}/{timestamp}")
    SessionInfo createSession (@Path("devId") String a, @Path("signature") String b, @Path("timestamp") String c);
}
