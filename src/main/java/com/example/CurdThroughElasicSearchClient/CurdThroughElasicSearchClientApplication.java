package com.example.CurdThroughElasicSearchClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.CurdThroughElasicSearchClient.*" })
public class CurdThroughElasicSearchClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdThroughElasicSearchClientApplication.class, args);
	}

}
