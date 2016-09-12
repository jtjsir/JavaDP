package com.jing.dp.demo.dutychain.sample;

import java.util.Map;

/**
 * @author jingsir
 **
 * ∂©µ•¿‡
 */
public class Order {

	private int x;
	private int y;
	private Map<String, Integer> orderMemu;

	public Order(int x, int y, Map<String, Integer> order) {
		this.x = x;
		this.y = y;
		this.orderMemu = order;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Map<String, Integer> getOrderMemu() {
		return orderMemu;
	}

	public void setOrderMemu(Map<String, Integer> orderMemu) {
		this.orderMemu = orderMemu;
	}

}
