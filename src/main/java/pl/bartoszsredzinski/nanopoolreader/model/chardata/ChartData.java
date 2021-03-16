package pl.bartoszsredzinski.nanopoolreader.model.chardata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ChartData implements Serializable{

    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private ChartInfo[] data;

    public Boolean getStatus(){
        return status;
    }

    public ChartInfo[] getData(){
        return data;
    }
}
