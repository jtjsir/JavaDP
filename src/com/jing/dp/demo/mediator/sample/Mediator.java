package com.jing.dp.demo.mediator.sample;

import java.util.ArrayList;

/**
@author jingsir

**
*/

import java.util.List;

import com.jing.dp.demo.mediator.sample.ifs.IBuytor;
import com.jing.dp.demo.mediator.sample.ifs.ISaletor;

public class Mediator {

	private Mediator(){
		
	}
	
	private static List<ISaletor> saletors ;
	
	private static List<IBuytor> buytors ;
	
	public static Mediator getInstance(){
		saletors = new ArrayList<>() ;
		buytors = new ArrayList<>() ;
		return MediatorSingle.mediator ;
	}
	
	private static class MediatorSingle{
		private static Mediator mediator = new Mediator() ;
	}
	
	public static void receiveSaletor(ISaletor saletor){
		saletors.add(saletor) ;
	}
	
	
	public static void receiveBuytor(IBuytor buytor){
		buytors.add(buytor) ;
	}
	
	public static void sendSaleInfo(ISaletor saletor , IBuytor buytor){
		if(saletors.contains(saletor)&& buytors.contains(buytor)){
			System.out.println("-------------------------------");
			System.out.print(saletor.getName() + "发布了一个出售的信息: ");
			saletor.publishSaleInfo();
			System.out.println(buytor.getName() + " 你可以过去看看咯 ");
			System.out.println("-------------------------------");
			
			System.out.println("-------------------------------");
			System.out.print(buytor.getName() + "发布了一个预买的信息: ");
			saletor.publishSaleInfo();
			System.out.println(saletor.getName() + " 你可以过去看看咯 ");
			System.out.println("-------------------------------");
		}else if(!saletors.contains(saletor)){
			System.out.println("不好意思" + saletor.getName() + " 没有给中介费，不予推送和接收");
		}
		if(!buytors.contains(buytor)){
			System.out.println("不好意思" + buytor.getName() + " 没有中介费，不予推送和接收");
		}
	}
	
}
