package pl.bartoszsredzinski.nanopoolreader.model.chardata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


public class ChartInfo implements Serializable, Comparable<ChartInfo>{

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

    @Override
    public int compareTo(ChartInfo o){
        return date.getDate().compareTo(o.getTime());
    }
}
