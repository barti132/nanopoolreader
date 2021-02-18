package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AverageHashrate implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private PeriodHashrate data;

    public Boolean getStatus(){
        return status;
    }

    public PeriodHashrate getNumber(){
        return data;
    }
}
