package com.jing.dp.demo.dutychain.sample;

import java.util.Map;


/**
 * @author jingsir
 **
 * KFC�ֵ�
 */
public class KFCBranch implements OrderHandler {

	private static final int MAX_INSTANCE = 500 ;//500�������Ͳ�
	
	private int no ;//�ֵ��
	
	private int x ;
	
	private int y ;
	
	private Map<String, Integer> orderMenu ;//ӵ�еĲ˵�
	
	private OrderHandler nextHandler;

	
	public KFCBranch(int x,int y,int no,Map<String, Integer> orderMenu){
		this.x = x ;
		this.y = y ;
		this.orderMenu = orderMenu ;
		this.no = no ;
	}
	
	@Override
	public void setNextHandler(OrderHandler handler) {
		this.nextHandler = handler;
	}

	@Override
	public boolean handleRequest(Order order) {
		//�ж��Ƿ����û��Ķ�������
		
		
		
		//
		if(nextHandler==null){
			return false ;
		}else{
			nextHandler.handleRequest(order) ;
		}
		return false;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public Map<String, Integer> getOrderMenu() {
		return orderMenu;
	}

	public void setOrderMenu(Map<String, Integer> orderMenu) {
		this.orderMenu = orderMenu;
	}

	public static int getMaxInstance() {
		return MAX_INSTANCE;
	}

	public OrderHandler getNextHandler() {
		return nextHandler;
	}
	
}
