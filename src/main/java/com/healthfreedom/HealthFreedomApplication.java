package com.healthfreedom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.healtfreedom.loginauth.UserRepository;


@SpringBootApplication//(exclude = {SecurityAutoConfiguration.class })
//@EnableJpaRepositories(basePackages = {"com.healthfreedom.repository","com.healtfreedom.loginauth"})
/* (exclude = {HibernateJpaAutoConfiguration.class}) */
//@ComponentScan(basePackages = {"com.healthfreedom.repository","com.healthfreedom.model","com.healthfreedom.service"})
public class HealthFreedomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthFreedomApplication.class, args);
	}

}
