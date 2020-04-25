package pl.amiler.weatherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherApp {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApp.class, args);
	}

}
