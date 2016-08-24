package com.jing.dp.demo.mediator;

import com.jing.dp.demo.mediator.sample.Mediator;
import com.jing.dp.demo.mediator.sample.ifs.IBuytor;
import com.jing.dp.demo.mediator.sample.ifs.ISaletor;
import com.jing.dp.demo.mediator.sample.impl.HouseBuytor;
import com.jing.dp.demo.mediator.sample.impl.HouseSaletor;

/**
 * @author jingsir
 * 
 *         中介者模式的应用，从模式上跟命令者模式类似，但是行为上没有确定的方向，即源方与目的方可以相互影响
 **		   
 */
public class MainMediator {

	public static void main(String[] args){
		Mediator mediator = Mediator.getInstance() ;
		
		ISaletor saletor1 = new HouseSaletor("saleA") ;
		ISaletor saletor2 = new HouseSaletor("saleB") ;
		ISaletor saletor3 = new HouseSaletor("saleC") ;
		
		IBuytor buytor1 = new HouseBuytor("buy1") ;
		IBuytor buytor2 = new HouseBuytor("buy2") ;
		
		mediator.receiveSaletor(saletor2);
		mediator.receiveSaletor(saletor3);
		
		mediator.receiveBuytor(buytor1);
		mediator.receiveBuytor(buytor2);
		
		//发布消息
		mediator.sendSaleInfo(saletor1, buytor1);
		mediator.sendSaleInfo(saletor2, buytor2);
		mediator.sendSaleInfo(saletor3, buytor1);
	}
}
