package com.hd.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.service.OrderService;
import com.hd.ssm.mapper.OrderCustomMapper;
import com.hd.ssm.pojo.OrderCustom;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderCustomMapper orderCustomMapper;

	@Override
	public List<OrderCustom> findOrderAndOrderItem() throws Exception {
		return orderCustomMapper.findOrderAndOrderItem();
	}
	
	@PostConstruct
	public void initConstruct() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("调用OrderServiceImpl");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("结束OrderServiceImpl调用");
	}

}
