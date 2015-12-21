package com.hd.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hd.service.OrderService;
import com.hd.ssm.pojo.OrderCustom;
import com.hd.ssm.pojo.Orderitem;

/**
 * Created by Chunyun on 2015/11/4.
 */
public class OrderServiceImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    }

    @Test
    public void findOrderAndOrderItem() throws Exception {
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        List<OrderCustom> orderCustoms = orderService.findOrderAndOrderItem();
        System.out.println(orderCustoms);
        System.out.println("记录条数为：" + orderCustoms.size());
        Integer count = 0;
        for(OrderCustom o : orderCustoms) {
        	count++;
        	System.out.println("第" + count + "个order");
        	for(Orderitem oi : o.getOrderitems()) {
        		System.out.println("order id:" + oi.getBname());
        	}
        }
    }
}