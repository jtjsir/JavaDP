package com.jing.dp.demo.dutychain.sample;

import java.util.List;

/**
 * @author jingsir
 **
 * �ֵ������
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
	
	//�ṩ�ⲿ�ӿ�һ�������ְ࣬���������
	public static boolean handleOrder(Order order){
		return head.handleRequest(order) ;
	}
}
