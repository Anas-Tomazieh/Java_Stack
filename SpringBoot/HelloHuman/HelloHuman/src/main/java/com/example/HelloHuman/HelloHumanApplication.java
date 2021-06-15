package com.example.HelloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/re")
    public String index(@RequestParam(value="name" , required = false) String thing){
			if(thing==null){
				String a = "<h1>Hello Human!</h1><br>";
				String b = "Welcome t Spring Boot";
			      return a+b;

			}
			else {
			String x = "<h1>Hello ";
			x=x.concat(thing);
			x=x.concat("!</h1><br>");
			String t = "Welcome t Spring Boot";
			return x+t;
					
		}
			}
	public String sasa() {
		
	}
}
