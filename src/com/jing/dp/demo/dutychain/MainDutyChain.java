package com.jing.dp.demo.dutychain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jing.dp.demo.dutychain.sample.BranchManager;
import com.jing.dp.demo.dutychain.sample.KFCBranch;
import com.jing.dp.demo.dutychain.sample.Order;
import com.jing.dp.demo.dutychain.sample.OrderHandler;

/**
 * @author jingsir
 **
 * ְ����ģʽ
 */
public class MainDutyChain {

	public static void main(String[] args) {
		BranchManager manager = BranchManager.getInstance() ;
		
		List<OrderHandler> handlers = new ArrayList<>() ;
		//��ʼ�˵�
		Map<String, Integer> foodMenu = new HashMap<>() ;
		foodMenu.put("����", 10) ;
		foodMenu.put("ѩ��", 10) ;
		foodMenu.put("����", 10) ;
		foodMenu.put("����",15) ;
		
		//�ֵ�����
		handlers.add(new KFCBranch(0, 0, 1, foodMenu)) ;
		handlers.add(new KFCBranch(100, 0, 2, foodMenu)) ;
		handlers.add(new KFCBranch(-90, 0, 3, foodMenu)) ;
		handlers.add(new KFCBranch(-150, 200, 4, foodMenu)) ;
		handlers.add(new KFCBranch(500, -10, 5, foodMenu)) ;
		
		//ְ������װ
		manager.register(handlers);
		
		//ְ������������
		Map<String, Integer> order = new HashMap<>() ;
		order.put("����", 2) ;
		order.put("����", 1) ;
		order.put("ѩ��", 1) ;
		manager.handleOrder(new Order(200, 200, order)) ;
	}

}
