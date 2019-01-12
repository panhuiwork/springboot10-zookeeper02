package com.geral.springboot10.ticket.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class UserServiceImpl {
	
	@Reference
	TicketService ticketService;
	
	public void hello() 
	{
		System.out.println(ticketService);
		String ticket=ticketService.getTicket();
		System.out.println("买到票了："+ticket);
	}
}
