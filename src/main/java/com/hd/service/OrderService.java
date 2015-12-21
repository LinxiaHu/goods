package com.hd.service;

import java.util.List;

import com.hd.ssm.pojo.OrderCustom;

public interface OrderService {
	List<OrderCustom> findOrderAndOrderItem() throws Exception;
}
