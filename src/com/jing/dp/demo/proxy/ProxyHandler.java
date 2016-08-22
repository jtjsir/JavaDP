package com.jing.dp.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ʵ�ֶ�̬����
 * 
 * @author hspcadmin
 *
 */
public class ProxyHandler implements InvocationHandler {

	private ProxyTestIfs testOb;

	public ProxyHandler(ProxyTestIfs testIfs) {
		this.testOb = testIfs;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		//�ж�ProxyTestIfs.class�Ƿ���proxy.class������/�ӿ���
		if (ProxyTestIfs.class.isAssignableFrom(proxy.getClass()) && method.getName().equals("modify")) {
			// ������ԭ����modify����
			System.out.println("������modify()����");
			return null;
		}
		return method.invoke(this.testOb, params);
	}

	
	public ProxyTestIfs getProxyInstance(){
		return (ProxyTestIfs)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{ProxyTestIfs.class}, this) ;
	}
}
