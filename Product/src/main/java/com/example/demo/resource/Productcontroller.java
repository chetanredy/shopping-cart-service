package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/product")
	public class Productcontroller {
		@GetMapping("/example")
		public String getString() {
			return "Hello World";
		}


}
