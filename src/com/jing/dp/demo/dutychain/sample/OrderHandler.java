package com.jing.dp.demo.dutychain.sample;

/**
 * @author jingsir
 **
 * ��������Ľӿ���
 */
public interface OrderHandler {

	public void setNextHandler(OrderHandler handler) ;
	
	public boolean handleRequest(Order order) ;
}
