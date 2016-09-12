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
 * 职责链模式
 */
public class MainDutyChain {

	public static void main(String[] args) {
		BranchManager manager = BranchManager.getInstance() ;
		
		List<OrderHandler> handlers = new ArrayList<>() ;
		//初始菜单
		Map<String, Integer> foodMenu = new HashMap<>() ;
		foodMenu.put("汉堡", 10) ;
		foodMenu.put("雪碧", 10) ;
		foodMenu.put("可乐", 10) ;
		foodMenu.put("薯条",15) ;
		
		//分店增加
		handlers.add(new KFCBranch(0, 0, 1, foodMenu)) ;
		handlers.add(new KFCBranch(100, 0, 2, foodMenu)) ;
		handlers.add(new KFCBranch(-90, 0, 3, foodMenu)) ;
		handlers.add(new KFCBranch(-150, 200, 4, foodMenu)) ;
		handlers.add(new KFCBranch(500, -10, 5, foodMenu)) ;
		
		//职责链封装
		manager.register(handlers);
		
		//职责链处理请求
		Map<String, Integer> order = new HashMap<>() ;
		order.put("汉堡", 2) ;
		order.put("薯条", 1) ;
		order.put("雪碧", 1) ;
		manager.handleOrder(new Order(200, 200, order)) ;
	}

}
