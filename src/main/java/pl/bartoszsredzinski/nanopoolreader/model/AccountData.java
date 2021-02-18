package pl.bartoszsredzinski.nanopoolreader.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AccountData implements Serializable{
    @JsonProperty("account")
    private String account;
    @JsonProperty("unconfirmed_balance")
    private Double unconfirmedBalance;
    @JsonProperty("balance")
    private Double balance;
    @JsonProperty("hashrate")
    private Double currentHashrate;
    @JsonProperty("avgHashrate")
    private PeriodHashrate avgHashrate;
    @JsonProperty("workers")
    private Worker[] workers;

    public String getAccount(){
        return account;
    }

    public Double getBalance(){
        return balance;
    }

    public Double getUnconfirmedBalance(){
        return unconfirmedBalance;
    }

    public Double getCurrentHashrate(){
        return currentHashrate;
    }

    public PeriodHashrate getAvgHashrate(){
        return avgHashrate;
    }

    public Worker[] getWorkers(){
        return workers;
    }
}
