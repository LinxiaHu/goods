package com.hd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hd.service.OrderService;
import com.hd.ssm.pojo.OrderCustom;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/findOrderDetail.action", method = {
			RequestMethod.POST, RequestMethod.GET })
	public ModelAndView findOrderDetail() throws Exception {

		ModelAndView mv = new ModelAndView();

		List<OrderCustom> list = orderService.findOrderAndOrderItem();

		if (null == list) {
			mv.addObject("list", null);
			mv.setViewName("order/errorOfOrderItem");
		} else {
			mv.addObject("list", list);
			mv.setViewName("order/showdetail");
		}

		return mv;
	}

}
