package org.sid.Account_service;

import org.sid.Account_service.entities.Driver;
import org.sid.Account_service.entities.Passenger;
import org.sid.Account_service.repositories.DriverRepository;
import org.sid.Account_service.repositories.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate()
	{
		return  new RestTemplate();
	}


}
