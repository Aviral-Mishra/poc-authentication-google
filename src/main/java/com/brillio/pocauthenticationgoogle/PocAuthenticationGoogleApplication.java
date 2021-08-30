package com.brillio.pocauthenticationgoogle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PocAuthenticationGoogleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PocAuthenticationGoogleApplication.class, args);
	}

}
