package com.example.First_app_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_first_spring {

	@RequestMapping
	public String greet() {
		return " Hello World To Using To The User ";
	}

}
