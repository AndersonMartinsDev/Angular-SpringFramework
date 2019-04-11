package com.calltech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.calltech.controller.EventoController;
import com.calltech.repository.EventoRepository;

@SpringBootApplication
@ComponentScan({"com.calltech.controller"})
@ComponentScan(basePackageClasses= {EventoController.class,EventoRepository.class})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
