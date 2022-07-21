package com.resilience;



import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


public class Resilience1Application {
	

	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

	  	public static void main(String[] args) {
		SpringApplication.run(Resilience1Application.class, args);
	}

}
