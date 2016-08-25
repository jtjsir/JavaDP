package com.jing.dp.demo.bridge.sample.impl;

import com.jing.dp.demo.bridge.sample.ISocietyExprience;

/**
@author jingsir

**
*/
public class RichSocietyExprience implements ISocietyExprience {

	@Override
	public void experience() {
		System.out.println("我拥有丰富的社会经验");
	}

}
