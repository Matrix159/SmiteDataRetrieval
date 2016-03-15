import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.util.List;


public class ASynchCall implements Callback<List<PlayerInfo>> {
    @Override
    public void success(List<PlayerInfo> playerInfo, Response response) {
        for(PlayerInfo x : playerInfo)
        {
            System.out.println("Conners scrub level: " + x.getRankedConquest().getLosses());
        }
    }

    @Override
    public void failure(RetrofitError retrofitError) {
        System.out.println("Fail");
    }
}
