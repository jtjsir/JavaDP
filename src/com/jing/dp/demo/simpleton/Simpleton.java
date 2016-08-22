package com.jing.dp.demo.simpleton;

/**
 * 最简单的单例模式的实现,适合单线程
 * @author hspcadmin
 *
 */
public class Simpleton {

	private static Simpleton simpleton ;
	
	//实例私有化，防止被外界调用
	private Simpleton(){
		
	}
	
	public static Simpleton getInstance(){
		if(null==simpleton){
			simpleton = new Simpleton() ;
		}
		
		return simpleton ;
	}
}
