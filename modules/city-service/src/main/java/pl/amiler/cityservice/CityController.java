package pl.amiler.cityservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {

    private final CityRepository repository;

    public CityController(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cities")
    public List<City> geAllCities() {
        List<City> values = new ArrayList<>();
        repository.findAll().toStream().forEach(values::add);
        return values;
    }
}