package pl.bartoszsredzinski.nanopoolreader.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.bartoszsredzinski.nanopoolreader.model.AccountInfo;
import pl.bartoszsredzinski.nanopoolreader.model.PayoutData;

import java.time.Duration;

@Service
public class AccountDataService{
    private final WebClient localApiClient;

    public AccountDataService(WebClient localApiClient){
        this.localApiClient = localApiClient;
    }

    public AccountInfo getAccountInfo(String address){
        return localApiClient.get().uri("user/" + address).retrieve().bodyToMono(AccountInfo.class).block(Duration.ofSeconds(5));
    }

    public PayoutData getPayout(String address){
        return localApiClient.get().uri("user/" + address).retrieve().bodyToMono(PayoutData.class).block(Duration.ofSeconds(5));
    }
}