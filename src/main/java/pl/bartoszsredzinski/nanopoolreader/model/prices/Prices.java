package pl.bartoszsredzinski.nanopoolreader.model.prices;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Prices implements Serializable{
    @JsonProperty("price_usd")
    private Double usd;
    @JsonProperty("price_eur")
    private Double eur;
    @JsonProperty("price_rur")
    private Double rur;
    @JsonProperty("price_cny")
    private Double cny;
    @JsonProperty("price_btc")
    private Double btc;

    public Double getUsd(){
        return usd;
    }

    public void setUsd(Double usd){
        this.usd = usd;
    }

    public Double getEur(){
        return eur;
    }

    public void setEur(Double eur){
        this.eur = eur;
    }

    public Double getRur(){
        return rur;
    }

    public void setRur(Double rur){
        this.rur = rur;
    }

    public Double getCny(){
        return cny;
    }

    public void setCny(Double cny){
        this.cny = cny;
    }

    public Double getBtc(){
        return btc;
    }

    public void setBtc(Double btc){
        this.btc = btc;
    }
}