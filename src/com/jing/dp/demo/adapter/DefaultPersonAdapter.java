package com.jing.dp.demo.adapter;

import com.jing.dp.demo.adapter.entity.Person;

//缺省适配器的应用,供其他人继承复写
public class DefaultPersonAdapter implements Person {

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void write() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void work() {
		System.err.println("还未参加工作");
	}

}
