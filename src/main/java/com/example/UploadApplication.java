package com.example;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class UploadApplication {

	public static void main(String[] args) {

		SpringApplication.run(UploadApplication.class, args);
	}
}
