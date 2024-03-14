package com.jona.curso.springboot.webapp.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
// @PropertySources({
// 	@PropertySource("classpath:values.properties"),
// 	@PropertySource("classpath:values2.properties")
// })
@PropertySource("classpath:values.properties")
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
