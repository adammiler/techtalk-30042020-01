package pl.amiler.weatherservice;

import com.azure.data.cosmos.CosmosKeyCredential;
import com.microsoft.azure.spring.data.cosmosdb.config.AbstractCosmosConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.CosmosDBConfig;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableReactiveCosmosRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CosmosDbProperties.class)
@EnableReactiveCosmosRepositories
@Slf4j
public class WeatherConfig extends AbstractCosmosConfiguration {

    private final CosmosDbProperties properties;

    private CosmosKeyCredential cosmosKeyCredential;

    public WeatherConfig(CosmosDbProperties properties) {
        this.properties = properties;
    }

    @Bean
    public CosmosDBConfig cosmosDbConfig() {
        this.cosmosKeyCredential = new CosmosKeyCredential(properties.getKey());
        CosmosDBConfig cosmosDbConfig = CosmosDBConfig.builder(properties.getUri(), this.cosmosKeyCredential, properties.getDatabase()).build();
        return cosmosDbConfig;
    }
}
