package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{

	@Override
	public void createOrder(Order order) {
		System.out.println(order);
		System.out.println("create service called...");
	}
	public String updateOrder(Order order){
		return "update successfully";
	}
}
