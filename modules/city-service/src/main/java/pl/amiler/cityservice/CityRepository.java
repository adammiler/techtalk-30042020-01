package pl.amiler.cityservice;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends ReactiveCosmosRepository<City, String> {
}
