package pl.amiler.weatherservice;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface WeatherRepository extends ReactiveCosmosRepository<Weather, String> {
    Mono<Weather> findByCity(String city);
}
