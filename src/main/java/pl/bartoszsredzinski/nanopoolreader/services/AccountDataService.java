package pl.bartoszsredzinski.nanopoolreader.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.bartoszsredzinski.nanopoolreader.model.account.AccountInfo;
import pl.bartoszsredzinski.nanopoolreader.model.chardata.ChartData;
import pl.bartoszsredzinski.nanopoolreader.model.chardata.ChartInfo;
import pl.bartoszsredzinski.nanopoolreader.model.payout.PayoutData;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

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
        return localApiClient.get().uri("usersettings/" + address).retrieve().bodyToMono(PayoutData.class).block(Duration.ofSeconds(5));
    }

    public ChartData getCharData(String address){
        return localApiClient.get().uri("hashratechart/" + address).retrieve().bodyToMono(ChartData.class).block(Duration.ofSeconds(5));
    }

    public String getChartHashrateData(String address){
        ChartData chartData = getCharData(address);
        Collections.sort(Arrays.asList(chartData.getData()));
        SimpleDateFormat format = new SimpleDateFormat("LLLL dd, yyyy HH:mm:ss", Locale.ENGLISH);
        StringBuilder builder = new StringBuilder();

        builder.append("[");

        for(ChartInfo chartInfo : chartData.getData()){
            builder.append("{x: '" + format.format(chartInfo.getTime()) + "',");
            builder.append("y: " + chartInfo.getHashrate()/1000f + "},");
        }
        builder.delete(builder.length() - 1, builder.length());
        builder.append("]");


        return builder.toString();
    }
}
