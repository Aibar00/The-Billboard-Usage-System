package com.project.billboardusagesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BillboardUsageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillboardUsageSystemApplication.class, args);
	}

}
