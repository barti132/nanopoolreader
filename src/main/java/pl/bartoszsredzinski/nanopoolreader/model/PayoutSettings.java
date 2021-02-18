package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PayoutSettings implements Serializable{
    @JsonProperty("payout")
    private Double payout;

    public Double getPayout(){
        return payout;
    }
}
