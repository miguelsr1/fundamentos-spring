package com.fundamentos.springboot.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication {

	/**
	 * Método encargado de iniciarlizar toda la arquitectura y configuración del proyecto Spring Boot
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

}
