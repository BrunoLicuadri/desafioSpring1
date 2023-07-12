package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class OrderService {
	
	public Double total (Order order) {
		return order.getBasicValue() * (1- order.getDiscount()/100);
	}

}
