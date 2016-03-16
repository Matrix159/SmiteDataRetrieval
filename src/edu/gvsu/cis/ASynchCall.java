package edu.gvsu.cis;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.util.List;


public class ASynchCall implements Callback<List<PlayerInfo>> {
    private List<PlayerInfo> info;
    @Override
    public void success(List<PlayerInfo> playerInfo, Response response) {

        for(PlayerInfo x : playerInfo)
        {
            System.out.println("Scatmancon2 has lost: " + x.getRankedConquest().getLosses() + " ranked conquest matches.");
        }
    }

    @Override
    public void failure(RetrofitError retrofitError) {
        System.out.println("Fail");
    }
}
