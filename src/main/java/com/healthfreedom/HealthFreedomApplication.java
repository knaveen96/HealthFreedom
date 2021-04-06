package com.healthfreedom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /* (exclude = {HibernateJpaAutoConfiguration.class}) */
//@ComponentScan(basePackages = {"com.healthfreedom.repository","com.healthfreedom.model","com.healthfreedom.service"})
public class HealthFreedomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthFreedomApplication.class, args);
	}

}
