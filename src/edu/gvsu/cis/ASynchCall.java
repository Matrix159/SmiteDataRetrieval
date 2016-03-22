package edu.gvsu.cis;

import edu.gvsu.cis.godinfo.GodInfo;
import edu.gvsu.cis.playerinfo.PlayerInfo;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.util.List;


public class ASynchCall implements Callback<List<PlayerInfo>> {
    private List<PlayerInfo> info;
    @Override
    public void success(List<PlayerInfo> playerInfo, Response response) {

    }

    @Override
    public void failure(RetrofitError retrofitError) {
        System.out.println("Fail");
    }
}
