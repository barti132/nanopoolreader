package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PayoutData implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private PayoutSettings data;

    public Boolean getStatus(){
        return status;
    }

    public PayoutSettings getData(){
        return data;
    }
}
