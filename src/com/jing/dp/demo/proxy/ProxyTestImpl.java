package com.jing.dp.demo.proxy;

public class ProxyTestImpl implements ProxyTestIfs {

	@Override
	public void read() {
		System.out.println("���õ���read()����");
	}

	@Override
	public void write() {
		System.out.println("���õ���write()����");
	}

	@Override
	public void modify() {
		System.out.println("���õ���modify()����");
	}

}
