package com.jing.dp.demo.mediator.sample.impl;

import com.jing.dp.demo.mediator.sample.ifs.ISaletor;

/**
 * @author jingsir
 **
 * 
 */
public class HouseSaletor implements ISaletor {

	private String name;
	

	public HouseSaletor(String name) {
		this.name = name;
	}

	@Override
	public void publishSaleInfo() {
		System.out.println("��һ�׺÷���");
	}

	@Override
	public String getName() {
		return name;
	}
	
}
