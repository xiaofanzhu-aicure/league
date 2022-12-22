package com.lepinardsoft.league;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LeagueApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello from Justice League!!!! HELLO!!!!";
	}

	@RequestMapping("/")
	public String homeRoot() {
		return "Hello from Justice League's root";
	}

	public static void main(String[] args) {
		SpringApplication.run(LeagueApplication.class, args);
	}

}
