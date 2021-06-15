
package com.example.routingfamiliar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class CodingController {
	@RequestMapping("/")
	public String index () {
	return "Hello Coding Dojo";
}
	@RequestMapping("/python")
	public String yassar () {
	return "Python/Django was awesome";
	}
	@RequestMapping("/java")
	public String Anas () {
	return "Java/Spring is better!";
	}
	

}
