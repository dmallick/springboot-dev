package com.example.starterboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class ServiceOne {
	
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/id")
	private String printMsg() {
		
		//String response = restTemplate.getForObject("http://service1/movies1/id1", String.class);
		
		return "Hello Movies .......";
	}

}
