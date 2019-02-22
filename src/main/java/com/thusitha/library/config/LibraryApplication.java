package com.thusitha.library.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.thusitha.library")
@EnableJpaRepositories("com.thusitha.library.repository")
@EntityScan("com.thusitha.library.model")
public class LibraryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new LibraryApplication()
				.configure( new SpringApplicationBuilder(LibraryApplication.class))
				.run(args);
	}
}