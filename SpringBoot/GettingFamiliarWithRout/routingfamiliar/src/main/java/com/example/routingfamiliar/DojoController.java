package com.example.routingfamiliar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class DojoController {
	@RequestMapping("/{dojo}")
	public String hani (@PathVariable("dojo") String dojo) {
		if (dojo.equals("dojo")){			
		return "The dojo is awesome ";
		}else if (dojo.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California";
		}else if (dojo.equals("san-jose")){
			return "SJ dojo is the headquarters";
		}
		return "nice action";
	}

}
