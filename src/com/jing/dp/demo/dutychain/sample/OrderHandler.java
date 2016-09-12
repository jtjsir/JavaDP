package com.jing.dp.demo.dutychain.sample;

/**
 * @author jingsir
 **
 * 处理请求的接口类
 */
public interface OrderHandler {

	public void setNextHandler(OrderHandler handler) ;
	
	public boolean handleRequest(Order order) ;
}
