package edu.gvsu.cis;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DataUsedInfo {

    private int ActiveSessions;
    private int ConcurrentSessions;
    private int RequestLimitDaily;
    private int SessionCap;
    private int SessionTimeLimit;
    private int TotalRequestsToday;
    private int TotalSessionsToday;
    private String retMsg;

    /**
     * No args constructor for use in serialization
     */
    public DataUsedInfo() {
    }

    /**
     * @param TotalSessionsToday
     * @param TotalRequestsToday
     * @param retMsg
     * @param SessionCap
     * @param SessionTimeLimit
     * @param ActiveSessions
     * @param ConcurrentSessions
     * @param RequestLimitDaily
     */
    public DataUsedInfo(int ActiveSessions, int ConcurrentSessions, int RequestLimitDaily, int SessionCap, int SessionTimeLimit, int TotalRequestsToday, int TotalSessionsToday, String retMsg) {
        this.ActiveSessions = ActiveSessions;
        this.ConcurrentSessions = ConcurrentSessions;
        this.RequestLimitDaily = RequestLimitDaily;
        this.SessionCap = SessionCap;
        this.SessionTimeLimit = SessionTimeLimit;
        this.TotalRequestsToday = TotalRequestsToday;
        this.TotalSessionsToday = TotalSessionsToday;
        this.retMsg = retMsg;
    }

    /**
     * @return The ActiveSessions
     */
    public int getActiveSessions() {
        return ActiveSessions;
    }

    /**
     * @param ActiveSessions The Active_Sessions
     */
    public void setActiveSessions(int ActiveSessions) {
        this.ActiveSessions = ActiveSessions;
    }

    /**
     * @return The ConcurrentSessions
     */
    public int getConcurrentSessions() {
        return ConcurrentSessions;
    }

    /**
     * @param ConcurrentSessions The Concurrent_Sessions
     */
    public void setConcurrentSessions(int ConcurrentSessions) {
        this.ConcurrentSessions = ConcurrentSessions;
    }

    /**
     * @return The RequestLimitDaily
     */
    public int getRequestLimitDaily() {
        return RequestLimitDaily;
    }

    /**
     * @param RequestLimitDaily The Request_Limit_Daily
     */
    public void setRequestLimitDaily(int RequestLimitDaily) {
        this.RequestLimitDaily = RequestLimitDaily;
    }

    /**
     * @return The SessionCap
     */
    public int getSessionCap() {
        return SessionCap;
    }

    /**
     * @param SessionCap The Session_Cap
     */
    public void setSessionCap(int SessionCap) {
        this.SessionCap = SessionCap;
    }

    /**
     * @return The SessionTimeLimit
     */
    public int getSessionTimeLimit() {
        return SessionTimeLimit;
    }

    /**
     * @param SessionTimeLimit The Session_Time_Limit
     */
    public void setSessionTimeLimit(int SessionTimeLimit) {
        this.SessionTimeLimit = SessionTimeLimit;
    }

    /**
     * @return The TotalRequestsToday
     */
    public int getTotalRequestsToday() {
        return TotalRequestsToday;
    }

    /**
     * @param TotalRequestsToday The Total_Requests_Today
     */
    public void setTotalRequestsToday(int TotalRequestsToday) {
        this.TotalRequestsToday = TotalRequestsToday;
    }

    /**
     * @return The TotalSessionsToday
     */
    public int getTotalSessionsToday() {
        return TotalSessionsToday;
    }

    /**
     * @param TotalSessionsToday The Total_Sessions_Today
     */
    public void setTotalSessionsToday(int TotalSessionsToday) {
        this.TotalSessionsToday = TotalSessionsToday;
    }

    /**
     * @return The retMsg
     */
    public Object getRetMsg() {
        return retMsg;
    }

    /**
     * @param retMsg The ret_msg
     */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}