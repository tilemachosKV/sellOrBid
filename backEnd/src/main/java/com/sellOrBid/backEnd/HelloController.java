package com.sellOrBid.backEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/app")
	public String index() {
		return "Greetings from Spring Boot but on docker heheheheh :)))!";
	}

}