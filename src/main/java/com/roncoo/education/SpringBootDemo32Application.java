package com.roncoo.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.unicon.cas.client.configuration.EnableCasClient;

@SpringBootApplication
@EnableCasClient
public class SpringBootDemo32Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo32Application.class, args);
	}
}
