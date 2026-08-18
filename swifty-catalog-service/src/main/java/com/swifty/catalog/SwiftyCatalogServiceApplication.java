package com.swifty.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwiftyCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftyCatalogServiceApplication.class, args);
		System.out.println("SwiftyCatalogServiceApplication started");
	}

}
