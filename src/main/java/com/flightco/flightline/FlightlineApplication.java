package com.flightco.flightline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FlightlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightlineApplication.class, args);
	}

}
