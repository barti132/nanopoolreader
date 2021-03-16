package pl.bartoszsredzinski.nanopoolreader.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AccountInfo implements Serializable{
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("data")
    private AccountData data;

    public Boolean getStatus(){
        return status;
    }

    public AccountData getData(){
        return data;
    }
}
