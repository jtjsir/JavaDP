package com.jing.dp.demo.proxy;


/**
 * 动态代理的main函数
 * @author hspcadmin
 *
 */
public class ProxyMain {

	public static void main(String[] args){
		ProxyTestIfs testIfs = new ProxyTestImpl() ;
		ProxyHandler handler = new ProxyHandler(testIfs) ;
		
		ProxyTestIfs proxyTestIfs = handler.getProxyInstance() ;
		proxyTestIfs.modify();
	}
}
