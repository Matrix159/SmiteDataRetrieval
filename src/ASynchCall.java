import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.util.List;


public class ASynchCall implements Callback<List<PlayerInfo>> {
    @Override
    public void success(List<PlayerInfo> playerInfo, Response response) {
        for(PlayerInfo x : playerInfo)
        {
            System.out.println(x.getLevel() + " " + x.getMasteryLevel());
        }
    }

    @Override
    public void failure(RetrofitError retrofitError) {
        System.out.println("Fail");
    }
}
