/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package pl.amiler.citiesweatherservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("weather-service")
public interface WeatherServiceClient {

    @GetMapping("/weather/{city}")
    Weather getWeatherForCity(@PathVariable("city") String city);

}
