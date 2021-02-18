package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DoubleBooleanData implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private Double data;

    public Boolean getStatus(){
        return status;
    }

    public Double getNumber(){
        return data;
    }
}
