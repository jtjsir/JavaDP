package com.jing.dp.demo.proxy;

public class ProxyTestImpl implements ProxyTestIfs {

	@Override
	public void read() {
		System.out.println("调用的是read()方法");
	}

	@Override
	public void write() {
		System.out.println("调用的是write()方法");
	}

	@Override
	public void modify() {
		System.out.println("调用的是modify()方法");
	}

}
