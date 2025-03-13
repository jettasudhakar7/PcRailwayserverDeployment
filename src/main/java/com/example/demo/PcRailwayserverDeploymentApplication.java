package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com.nt.entity")
@EnableJpaRepositories(basePackages="com.nt.repository")
@ComponentScan(basePackages={"com.nt.service","com.nt.controller"})
public class PcRailwayserverDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcRailwayserverDeploymentApplication.class, args);
	}

}
