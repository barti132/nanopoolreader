package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PeriodHashrate implements Serializable{
    @JsonProperty("h1")
    private Double h1;
    @JsonProperty("h3")
    private Double h3;
    @JsonProperty("h6")
    private Double h6;
    @JsonProperty("h12")
    private Double h12;
    @JsonProperty("h24")
    private Double h24;

    public Double getH1(){
        return h1;
    }

    public Double getH3(){
        return h3;
    }

    public Double getH6(){
        return h6;
    }

    public Double getH12(){
        return h12;
    }

    public Double getH24(){
        return h24;
    }
}
