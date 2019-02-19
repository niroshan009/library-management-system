package com.thusitha.library.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thusitha.library")
public class LibraryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new LibraryApplication()
				.configure( new SpringApplicationBuilder(LibraryApplication.class))
				.run(args);
	}

}

