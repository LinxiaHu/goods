package com.hd.ssm.pojo;

import java.util.List;

public class OrderCustom extends Order {
	
	private User user;
	
	List<Orderitem> orderitems;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Orderitem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}
	
	
}
