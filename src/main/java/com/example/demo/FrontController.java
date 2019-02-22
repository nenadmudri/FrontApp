package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class FrontController {
	
	@RequestMapping(value="/")
	public String index() {
		
		return "index.html";
	}

}
