package com.hd.service.impl;

import java.util.List;

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

}
