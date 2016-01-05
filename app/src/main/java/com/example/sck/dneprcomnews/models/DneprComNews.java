
package com.example.sck.dneprcomnews.models;

import java.util.HashMap;
import java.util.Map;

public class DneprComNews {

    private NewsTitle NewsTitle;
    private String NewsDescription;
    private NewsImage NewsImage;
    private String NewsDateTime;
    private String NewsSeen;
    private int index;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The NewsTitle
     */
    public NewsTitle getNewsTitle() {
        return NewsTitle;
    }

    /**
     * 
     * @param NewsTitle
     *     The NewsTitle
     */
    public void setNewsTitle(NewsTitle NewsTitle) {
        this.NewsTitle = NewsTitle;
    }

    /**
     * 
     * @return
     *     The NewsDescription
     */
    public String getNewsDescription() {
        return NewsDescription;
    }

    /**
     * 
     * @param NewsDescription
     *     The NewsDescription
     */
    public void setNewsDescription(String NewsDescription) {
        this.NewsDescription = NewsDescription;
    }

    /**
     * 
     * @return
     *     The NewsImage
     */
    public NewsImage getNewsImage() {
        return NewsImage;
    }

    /**
     * 
     * @param NewsImage
     *     The NewsImage
     */
    public void setNewsImage(NewsImage NewsImage) {
        this.NewsImage = NewsImage;
    }

    /**
     * 
     * @return
     *     The NewsDateTime
     */
    public String getNewsDateTime() {
        return NewsDateTime;
    }

    /**
     * 
     * @param NewsDateTime
     *     The NewsDateTime
     */
    public void setNewsDateTime(String NewsDateTime) {
        this.NewsDateTime = NewsDateTime;
    }

    /**
     * 
     * @return
     *     The NewsSeen
     */
    public String getNewsSeen() {
        return NewsSeen;
    }

    /**
     * 
     * @param NewsSeen
     *     The NewsSeen
     */
    public void setNewsSeen(String NewsSeen) {
        this.NewsSeen = NewsSeen;
    }

    /**
     * 
     * @return
     *     The index
     */
    public int getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
