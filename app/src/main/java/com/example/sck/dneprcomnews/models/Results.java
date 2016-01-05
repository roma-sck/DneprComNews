
package com.example.sck.dneprcomnews.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Results {

    private List<DneprComNews> DneprComNews = new ArrayList<DneprComNews>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DneprComNews
     */
    public List<DneprComNews> getDneprComNews() {
        return DneprComNews;
    }

    /**
     * 
     * @param DneprComNews
     *     The DneprComNews
     */
    public void setDneprComNews(List<DneprComNews> DneprComNews) {
        this.DneprComNews = DneprComNews;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
