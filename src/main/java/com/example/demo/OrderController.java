package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define a special bean 
@RequestMapping("/order")
public class OrderController {
	@Autowired  //DI
	IOrderService service; 
	@PostMapping
	public String createOrder(@RequestBody Order order) {
		System.out.println(order);
		service.createOrder(order);
		return "success";
	}

	@GetMapping
	public String getOrder() {
		return "order1";
	}
	@PutMapping
	public String updateOrder(Order order) {
		service.updateOrder(order);
		return "order updated";
	}
}
