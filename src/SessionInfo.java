/**
 * Created by Eldridge on 3/14/2016.
 */
public class SessionInfo
{   private String ret_msg, session_id, timestamp;

    public String getRet_msg() {
        return ret_msg;
    }

    public String getSession_id() {
        return session_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public SessionInfo(String ret_msg, String session_id, String timestamp)
    {
        this.ret_msg = ret_msg;
        this.session_id = session_id;
        this.timestamp = timestamp;
    }
}
