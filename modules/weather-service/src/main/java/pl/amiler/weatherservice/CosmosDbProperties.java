package pl.amiler.weatherservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "azure.cosmosdb")
public class CosmosDbProperties {

    private String uri;

    private String key;

    private String database;

}