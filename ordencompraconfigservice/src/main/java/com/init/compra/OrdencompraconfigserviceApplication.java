package com.init.compra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class OrdencompraconfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdencompraconfigserviceApplication.class, args);
	}

}
