package pl.amiler.citiesweatherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CitiesWeatherController {

    private final WeatherServiceClient weatherClient;

    private final CityServiceClient cityClient;

    public CitiesWeatherController(CityServiceClient c, WeatherServiceClient w) {
        this.cityClient = c;
        this.weatherClient = w;
    }


    @GetMapping("/weather")
    public List<Weather> getWorldWeather() {
        Stream<City> allCities = cityClient.getAllCities().stream();
        List<Weather> worldWeather = allCities
                .map(city -> weatherClient.getWeatherForCity(city.getName()))
                .collect(Collectors.toList());
        return worldWeather;
    }

}
