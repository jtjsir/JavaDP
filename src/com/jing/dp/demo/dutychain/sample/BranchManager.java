package com.jing.dp.demo.dutychain.sample;

import java.util.List;

/**
 * @author jingsir
 **
 * 分店管理类
 */
public class BranchManager {

	private BranchManager(){
	}
	
	public static BranchManager getInstance(){
		return Singleton.rManager ;
	}
	
	private static class Singleton{
		private static BranchManager rManager = new BranchManager() ;
	}
	
	private static OrderHandler head ;
	
	private static OrderHandler next ;
	
	public static void register(List<OrderHandler> orderHandlers){
		for(OrderHandler handler : orderHandlers){
			register(handler);
		}
	}
	
	private static void register(OrderHandler orderHandler){
		if(head==null){
			next = head = orderHandler ;
		}else{
			next.setNextHandler(orderHandler);
			next = orderHandler ;
		}
	}
	
	//提供外部接口一个处理类，职责链的入口
	public static boolean handleOrder(Order order){
		return head.handleRequest(order) ;
	}
}
