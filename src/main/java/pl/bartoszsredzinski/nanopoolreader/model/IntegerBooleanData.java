package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class IntegerBooleanData implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private Integer data;

    public Boolean getStatus(){
        return status;
    }

    public Integer getNumber(){
        return data;
    }
}
