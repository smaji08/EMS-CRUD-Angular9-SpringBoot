package com.example.SpringBootAngular2EMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class SpringBootAngular2EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngular2EmsApplication.class, args);
		System.out.println(org.hibernate.Version.getVersionString());
		System.out.println("version: " + SpringVersion.getVersion());
	}

}
