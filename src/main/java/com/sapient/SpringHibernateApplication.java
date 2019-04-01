package com.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({ "com.sapient" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class) })
@ComponentScan(basePackages = { "com.sapient" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class) })
@EntityScan("com.sapient")
@EnableJpaRepositories(basePackages = "com.sapient")
public class SpringHibernateApplication {// implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}

}
