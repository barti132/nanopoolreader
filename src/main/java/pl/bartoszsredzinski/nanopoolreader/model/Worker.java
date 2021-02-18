package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class Worker implements Serializable{
    @JsonProperty("id")
    private String id;
    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("hashrate")
    private Double hashrate;
    @JsonProperty("lastshare")
    private Integer lastShare;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("h1")
    private Double avgH1;
    @JsonProperty("h3")
    private Double avgH3;
    @JsonProperty("h6")
    private Double avgH6;
    @JsonProperty("h12")
    private Double avgH12;
    @JsonProperty("h24")
    private Double avgH24;

    public String getId(){
        return id;
    }

    public Integer getUid(){
        return uid;
    }

    public Double getHashrate(){
        return hashrate;
    }

    public Integer getLastShare(){
        return lastShare;
    }

    public Integer getRating(){
        return rating;
    }

    public Double getAvgH1(){
        return avgH1;
    }

    public Double getAvgH3(){
        return avgH3;
    }

    public Double getAvgH6(){
        return avgH6;
    }

    public Double getAvgH12(){
        return avgH12;
    }

    public Double getAvgH24(){
        return avgH24;
    }
}
