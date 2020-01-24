package com.example.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.OrderService;
import com.example.demo.dto.Order;

@Component
public class OrderProcessor implements Processor {

	@Autowired
	private OrderService service;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		service.addOrder(exchange.getIn().getBody(Order.class));
	}
}
