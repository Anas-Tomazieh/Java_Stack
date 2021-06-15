package com.example.StringAssignmen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class StringAssignmenApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringAssignmenApplication.class, args);
	}
	  // 1. Annotation
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello Client How are you working";
            }
    @RequestMapping("/random")
    // 3. Method that maps to the request route above
    public String rand() { // 3
            return "Spring Boot is Great! so easy to just response wlkejgntejrkl;me,";
            }
}
