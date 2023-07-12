package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class ShippingService {
	
	public Double Shipment(Order order) {
		if (order.getBasicValue() < 100) {
			return 20.00;
		}
		else if( order.getBasicValue() < 200) {
			return 12.00;
		}
		else {
			return 0.0;
		}	
	}

}
