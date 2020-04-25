package pl.amiler.cityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CityApp {

	public static void main(String[] args) {
		SpringApplication.run(CityApp.class, args);
	}

}
