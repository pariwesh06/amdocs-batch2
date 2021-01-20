package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@PostMapping("/order")
	public String createOrder() {
		return "success";
	}
}
