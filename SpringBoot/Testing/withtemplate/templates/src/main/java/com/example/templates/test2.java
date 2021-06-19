package com.example.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test2 {
	@RequestMapping("")
	public String test3() {
		return "test.jsp";
	}

}
