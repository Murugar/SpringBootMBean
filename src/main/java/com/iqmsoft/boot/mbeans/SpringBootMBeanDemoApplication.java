package com.iqmsoft.boot.mbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableMBeanExport
public class SpringBootMBeanDemoApplication {

	@Bean
	public Resource jmxResource() {
		return new Resource();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMBeanDemoApplication.class, args);
	}

}
