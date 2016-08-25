package com.jing.dp.demo.bridge.sample.impl;

import com.jing.dp.demo.bridge.sample.ISocietyExprience;

/**
@author jingsir

**
*/
public class NormalSocietyExprience implements ISocietyExprience {

	@Override
	public void experience() {
		System.err.println("我拥有一般的社会经验");
	}

}
