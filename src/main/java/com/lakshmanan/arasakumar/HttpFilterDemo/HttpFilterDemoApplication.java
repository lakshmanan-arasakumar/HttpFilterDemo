package com.lakshmanan.arasakumar.HttpFilterDemo;

import configuration.EnableHttpFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableHttpFilter
public class HttpFilterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpFilterDemoApplication.class, args);
	}

}
