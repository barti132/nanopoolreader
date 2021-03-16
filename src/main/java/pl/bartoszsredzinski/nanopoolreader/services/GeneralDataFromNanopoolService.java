package pl.bartoszsredzinski.nanopoolreader.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.bartoszsredzinski.nanopoolreader.model.DoubleBooleanData;
import pl.bartoszsredzinski.nanopoolreader.model.IntegerBooleanData;
import pl.bartoszsredzinski.nanopoolreader.model.prices.PricesData;

import java.time.Duration;


@Service
public class GeneralDataFromNanopoolService{

    private final WebClient localApiClient;

    public GeneralDataFromNanopoolService(WebClient localApiClient){
        this.localApiClient = localApiClient;
    }

    public IntegerBooleanData getNumberOfMiners(){
        return localApiClient.get().uri("pool/activeminers").retrieve().bodyToMono(IntegerBooleanData.class).block(Duration.ofSeconds(5));
    }

    public IntegerBooleanData getNumberOfWorkers(){
        return localApiClient.get().uri("pool/activeworkers").retrieve().bodyToMono(IntegerBooleanData.class).block(Duration.ofSeconds(5));
    }

    public IntegerBooleanData getPoolHashrate(){
        return localApiClient.get().uri("pool/hashrate").retrieve().bodyToMono(IntegerBooleanData.class).block(Duration.ofSeconds(5));
    }

    public DoubleBooleanData getShareCoefficient(){
        return localApiClient.get().uri("pool/sharecoef").retrieve().bodyToMono(DoubleBooleanData.class).block(Duration.ofSeconds(5));
    }

    public PricesData getPrices(){
        return localApiClient.get().uri("prices").retrieve().bodyToMono(PricesData.class).block(Duration.ofSeconds(5));
    }
}
