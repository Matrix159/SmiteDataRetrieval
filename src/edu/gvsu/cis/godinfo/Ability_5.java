
package edu.gvsu.cis.godinfo;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Ability_5 {

    private Description Description;
    private int Id;
    private String Summary;
    private String URL;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ability_5() {
    }

    /**
     * 
     * @param Description
     * @param Id
     * @param URL
     * @param Summary
     */
    public Ability_5(Description Description, int Id, String Summary, String URL) {
        this.Description = Description;
        this.Id = Id;
        this.Summary = Summary;
        this.URL = URL;
    }

    /**
     * 
     * @return
     *     The Description
     */
    public Description getDescription() {
        return Description;
    }

    /**
     * 
     * @param Description
     *     The Description
     */
    public void setDescription(Description Description) {
        this.Description = Description;
    }

    /**
     * 
     * @return
     *     The Id
     */
    public int getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Summary
     */
    public String getSummary() {
        return Summary;
    }

    /**
     * 
     * @param Summary
     *     The Summary
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * 
     * @return
     *     The URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * 
     * @param URL
     *     The URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

}
