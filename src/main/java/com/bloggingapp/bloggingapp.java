package com.bloggingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bloggingapp.utils.ObjectMapping;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.bloggingapp")
@EnableJpaRepositories(basePackages = "com.bloggingapp.repositories")
public class bloggingapp {

	@Bean
	public ObjectMapping objectMapping(ModelMapper modelMapper) {
		return new ObjectMapping(modelMapper);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(bloggingapp.class, args);
	}
}
