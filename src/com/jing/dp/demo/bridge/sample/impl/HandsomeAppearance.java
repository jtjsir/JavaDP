package com.jing.dp.demo.bridge.sample.impl;

import com.jing.dp.demo.bridge.sample.IAppearance;

/**
@author jingsir

**
*/
public class HandsomeAppearance implements IAppearance {

	@Override
	public void show() {
		System.out.println("我拥有帅气的面貌");
	}

}
