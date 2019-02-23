package com.geral.springboot10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geral.springboot10.ticket.service.UserServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot10zookeeperUserApplicationTests {

	@Autowired
	UserServiceImpl userServiceImpl;
	@Test
	public void contextLoads() {
		userServiceImpl.hello();
	}

}

