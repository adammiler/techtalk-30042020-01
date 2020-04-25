package pl.amiler.citiesweatherservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Weather {

    private String id;

    private String city;

    private String desc;


}
