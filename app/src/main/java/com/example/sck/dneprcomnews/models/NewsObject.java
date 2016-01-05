
package com.example.sck.dneprcomnews.models;

import java.util.HashMap;
import java.util.Map;

public class NewsObject {

    private String name;
    private int count;
    private String frequency;
    private int version;
    private boolean newdata;
    private String lastrunstatus;
    private String thisversionstatus;
    private String thisversionrun;
    private Results results;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * 
     * @return
     *     The version
     */
    public int getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The newdata
     */
    public boolean isNewdata() {
        return newdata;
    }

    /**
     * 
     * @param newdata
     *     The newdata
     */
    public void setNewdata(boolean newdata) {
        this.newdata = newdata;
    }

    /**
     * 
     * @return
     *     The lastrunstatus
     */
    public String getLastrunstatus() {
        return lastrunstatus;
    }

    /**
     * 
     * @param lastrunstatus
     *     The lastrunstatus
     */
    public void setLastrunstatus(String lastrunstatus) {
        this.lastrunstatus = lastrunstatus;
    }

    /**
     * 
     * @return
     *     The thisversionstatus
     */
    public String getThisversionstatus() {
        return thisversionstatus;
    }

    /**
     * 
     * @param thisversionstatus
     *     The thisversionstatus
     */
    public void setThisversionstatus(String thisversionstatus) {
        this.thisversionstatus = thisversionstatus;
    }

    /**
     * 
     * @return
     *     The thisversionrun
     */
    public String getThisversionrun() {
        return thisversionrun;
    }

    /**
     * 
     * @param thisversionrun
     *     The thisversionrun
     */
    public void setThisversionrun(String thisversionrun) {
        this.thisversionrun = thisversionrun;
    }

    /**
     * 
     * @return
     *     The results
     */
    public Results getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(Results results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
