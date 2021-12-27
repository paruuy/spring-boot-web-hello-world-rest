package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${prop.test}")
	private String propertie;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Propertie Value: ");
	}

	public void setPropertie(String propertie) {
		propertie = propertie;
	}

	public String getPropertie() {
		return propertie;
	}
}
