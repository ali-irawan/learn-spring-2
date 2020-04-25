package com.devtalks.spring.session2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Session2Config.class)
public class Session2Application {

	public static void main(String[] args) {
		SpringApplication.run(Session2Application.class, args);
	}

}
