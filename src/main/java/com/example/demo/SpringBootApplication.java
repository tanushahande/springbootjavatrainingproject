package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootApplication {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello, World! welcome to our DemoApplication";
	    }

}
