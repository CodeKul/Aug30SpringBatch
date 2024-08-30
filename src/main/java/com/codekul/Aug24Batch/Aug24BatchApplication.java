package com.codekul.Aug24Batch;

import com.codekul.Aug24Batch.ioc.NotificationManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Aug24BatchApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Aug24BatchApplication.class, args);
		NotificationManager notificationManager = context.getBean(NotificationManager.class);
		notificationManager.notify("Hello");
//		NotificationManager notificationManager = new NotificationManager();
//		notificationManager.notify("Hello");

	}


	@Bean
	public CommandLineRunner setCommandLineRunner(){
		CommandLineRunner commandLineRunner = (S)-> {
			System.out.println("In command line runner");
		};
		return commandLineRunner;
	}

//
//	@GetMapping("hello")
//	public String hello(){
//		return "hello spring";
//	}

}
