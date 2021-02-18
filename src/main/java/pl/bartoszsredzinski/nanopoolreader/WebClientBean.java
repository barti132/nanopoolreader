package pl.bartoszsredzinski.nanopoolreader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBean{
    @Bean
    public WebClient localApiClient() {
        return WebClient.create("https://api.nanopool.org/v1/eth/");
    }
}
