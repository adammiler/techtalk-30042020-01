package pl.amiler.weatherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherRepository repository;

    public WeatherController(WeatherRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/weather/{city}")
    public Weather getCityWeather(@PathVariable final String city) {
        return repository.findByCity(city).block();
    }
}