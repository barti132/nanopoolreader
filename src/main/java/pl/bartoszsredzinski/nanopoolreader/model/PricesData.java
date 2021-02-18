package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PricesData implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private Prices data;

    public Boolean getStatus(){
        return status;
    }

    public Prices getData(){
        return data;
    }
}
