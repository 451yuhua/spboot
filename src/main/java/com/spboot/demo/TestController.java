package com.spboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to Spring Boot World!!";
	}
	
	@RequestMapping("thymeleaf")
	public String thymeleaf(ModelMap map) {
		map.addAttribute("name","spring-boot-starter");
		return "index";
	}
}
