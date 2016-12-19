package com.jing.dp.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现动态代理
 * 
 * @author hspcadmin
 *
 */
public class ProxyHandler implements InvocationHandler {

	private ProxyTestIfs testOb;

	public ProxyHandler(ProxyTestIfs testIfs) {
		this.testOb = testIfs;
	}

	/**
	**@proxy 这里指代的是最终生成的代理对象,比如$proxy1
	**所以在本方法中得调用真实对象	
	*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		//判断ProxyTestIfs.class是否是proxy.class的子类/接口类
		if (ProxyTestIfs.class.isAssignableFrom(proxy.getClass()) && method.getName().equals("modify")) {
			// 不调用原本的modify方法
			System.out.println("拦截了modify()方法");
			return null;
		}
		return method.invoke(this.testOb, params);
	}

	/**
	**newProxyInstance()第二参数指代的是所要代理的接口数组，得到的代理类默认实现该接口数组，没实现接口的类无法被代理	
	**
	*/
	public ProxyTestIfs getProxyInstance(){
		return (ProxyTestIfs)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{ProxyTestIfs.class}, this) ;
	}
}
