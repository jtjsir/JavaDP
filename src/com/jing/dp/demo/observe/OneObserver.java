package com.jing.dp.demo.observe;

import com.jing.dp.demo.observe.ifs.TestObserver;

public class OneObserver implements TestObserver{

	@Override
	public void update() {
		System.out.println("Observer1: " + "��Ҫȥ֪ͨ�ͻ���");
	}

}
