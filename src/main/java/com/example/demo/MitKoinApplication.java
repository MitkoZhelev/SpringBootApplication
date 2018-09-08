package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;



@SpringBootApplication
public class MitKoinApplication {
	static Logger log = Logger.getLogger(MitKoinApplication.class.getName());
	public static void main(String[] args)  {
		log.info("Running application");
		SpringApplication.run(MitKoinApplication.class, args);
		log.info("Exiting the program");
	}
}
