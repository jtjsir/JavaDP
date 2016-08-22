package com.jing.dp.demo.simpleton;
/**
 * 同步方法保证静态实例，但使用是锁，系统消耗大
 * @author hspcadmin
 *
 */
public class BadSynSimpleton {

	private static BadSynSimpleton badSynSimpleton ;
	
	private BadSynSimpleton(){
		
	}
	
	public static synchronized BadSynSimpleton getInstance(){
		if(badSynSimpleton==null){
			badSynSimpleton = new BadSynSimpleton() ;
		}
		
		return badSynSimpleton ;
	}
}
