package pl.bartoszsredzinski.nanopoolreader.model.chardata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


public class ChartInfo implements Serializable{

    @JsonProperty("date")
    private DateEpoch date;
    @JsonProperty("shares")
    private Integer shares;
    @JsonProperty("hashrate")
    private Integer hashrate;

    public Date getTime(){
        return date.getDate();
    }

    public Integer getShares(){
        return shares;
    }

    public Integer getHashrate(){
        return hashrate;
    }
}
