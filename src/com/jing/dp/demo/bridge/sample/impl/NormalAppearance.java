package com.jing.dp.demo.bridge.sample.impl;

import com.jing.dp.demo.bridge.sample.IAppearance;

/**
@author jingsir

**
*/
public class NormalAppearance implements IAppearance {

	@Override
	public void show() {
		System.out.println("我拥有普通的面貌");
	}

}
