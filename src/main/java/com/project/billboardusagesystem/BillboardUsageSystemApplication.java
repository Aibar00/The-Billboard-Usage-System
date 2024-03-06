package com.project.billboardusagesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages = {"com.project.billboardusagesystem.model"})
public class BillboardUsageSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(BillboardUsageSystemApplication.class, args);
	}
}
