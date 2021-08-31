package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFirstStepsApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFirstStepsApplication.class, args);

		Alien ayy = context.getBean(Alien.class);
		ayy.show();

		Alien ayy2 = context.getBean(Alien.class);
		ayy2.show();
	}

}
