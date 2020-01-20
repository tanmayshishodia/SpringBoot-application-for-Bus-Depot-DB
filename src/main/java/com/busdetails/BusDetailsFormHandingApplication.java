package com.busdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.busdetails.BusDetailsFormHandingApplication;

@SpringBootApplication
public class BusDetailsFormHandingApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(BusDetailsFormHandingApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(BusDetailsFormHandingApplication.class, args);
	}
}