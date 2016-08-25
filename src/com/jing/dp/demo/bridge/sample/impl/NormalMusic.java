package com.jing.dp.demo.bridge.sample.impl;

import com.jing.dp.demo.bridge.sample.IMusic;

/**
@author jingsir

**
*/
public class NormalMusic implements IMusic {

	@Override
	public void skill() {
		System.out.println("我不会任何乐器");
	}

}
