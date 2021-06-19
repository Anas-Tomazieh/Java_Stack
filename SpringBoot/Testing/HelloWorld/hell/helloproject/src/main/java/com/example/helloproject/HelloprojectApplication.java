package com.example.helloproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloprojectApplication.class, args);
	}
    @RequestMapping("/")
    public String hello() { 
        return "Hello World!";


}
    @RequestMapping("/a")
    public String Anas() { 
        return "Anas Method";


}
    @RequestMapping("/b")
    public String Baraa() { 
        return "Baraa Method!";


}
}
