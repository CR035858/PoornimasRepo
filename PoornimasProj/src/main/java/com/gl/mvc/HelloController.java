package com.gl.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // stereotype annotation of @Component
@RequestMapping("/api")
public class HelloController {
	// adding the request mapping --> url
	@RequestMapping("/hello")
	public String giveHelloMsg() {
		return "hello";
		//	return "Hello";
	}
	@RequestMapping("/bye")
	public String giveByeMsg() {
		return "bye";
		//return "BYE-BYE";
	}
}
