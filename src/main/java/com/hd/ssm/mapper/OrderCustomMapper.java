package com.hd.ssm.mapper;

import java.util.List;

import com.hd.ssm.pojo.OrderCustom;

public interface OrderCustomMapper {
	List<OrderCustom> findOrderAndOrderItem() throws Exception;
}