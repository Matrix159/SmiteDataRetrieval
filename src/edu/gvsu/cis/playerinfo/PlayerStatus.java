package edu.gvsu.cis.playerinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PlayerStatus {

    private int Match;
    private String personal_status_message;
    private String ret_msg;
    private int status;
    private String status_string;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlayerStatus() {
    }

    /**
     *
     * @param status
     * @param Match
     * @param status_string
     * @param ret_msg
     * @param personal_status_message
     */
    public PlayerStatus(int Match, String personal_status_message, String ret_msg, int status, String status_string) {
        this.Match = Match;
        this.personal_status_message = personal_status_message;
        this.ret_msg = ret_msg;
        this.status = status;
        this.status_string = status_string;
    }

    /**
     *
     * @return
     * The Match
     */
    public int getMatch() {
        return Match;
    }

    /**
     *
     * @param Match
     * The Match
     */
    public void setMatch(int Match) {
        this.Match = Match;
    }

    /**
     *
     * @return
     * The personal_status_message
     */
    public Object getPersonal_status_message() {
        return personal_status_message;
    }

    /**
     *
     * @param personal_status_message
     * The personal_status_message
     */
    public void setPersonal_status_message(String personal_status_message) {
        this.personal_status_message = personal_status_message;
    }

    /**
     *
     * @return
     * The ret_msg
     */
    public Object getRet_msg() {
        return ret_msg;
    }

    /**
     *
     * @param ret_msg
     * The ret_msg
     */
    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    /**
     *
     * @return
     * The status
     */
    public int getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The status_string
     */
    public String getStatus_string() {
        return status_string;
    }

    /**
     *
     * @param status_string
     * The status_string
     */
    public void setStatus_string(String status_string) {
        this.status_string = status_string;
    }

}