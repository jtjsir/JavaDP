package com.jing.dp.demo.observe;

import com.jing.dp.demo.observe.ifs.TestObserver;

public class TwoObserver implements TestObserver {

	@Override
	public void update() {
		System.out.println("Observer2: " + "��Ҫȥ֪ͨ���������");
	}

}
