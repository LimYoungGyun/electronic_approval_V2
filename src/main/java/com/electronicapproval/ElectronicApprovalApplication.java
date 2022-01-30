package com.electronicapproval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.electronicapproval")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ElectronicApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicApprovalApplication.class, args);
	}

}
