package com.jing.dp.demo.mediator.sample.impl;

import com.jing.dp.demo.mediator.sample.ifs.IBuytor;

/**
 * @author jingsir
 **
 * 
 */
public class HouseBuytor implements IBuytor {

	private String name ;
	
	public HouseBuytor(String name){
		this.name = name ;
	}
	
	
	@Override
	public void requestBuyInfo() {
		System.out.println("我要一套房子");
	}

	@Override
	public String getName() {
		return this.name ;
	}

}
