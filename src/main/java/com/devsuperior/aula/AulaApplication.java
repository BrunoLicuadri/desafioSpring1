package com.devsuperior.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import com.devsuperior.aula.services.ShippingService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private	ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		
		System.out.print("Código: " + order.getCode());
		System.out.printf("\nValor total: R$ %.2f", (orderService.total(order) + shippingService.Shipment(order) ));
		System.out.println();
		System.out.println();
		System.out.print("Código: " + order2.getCode());
		System.out.printf("%nValor total: R$ %.2f", (orderService.total(order2) + shippingService.Shipment(order2) ));
		System.out.println();
		System.out.println();
		System.out.print("Código: " + order3.getCode());
		System.out.printf("%nValor total: R$ %.2f", (orderService.total(order3) + shippingService.Shipment(order3) ));
		
	}

}
