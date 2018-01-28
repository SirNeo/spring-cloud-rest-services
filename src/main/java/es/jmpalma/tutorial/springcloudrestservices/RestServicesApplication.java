package es.jmpalma.tutorial.springcloudrestservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}
}
