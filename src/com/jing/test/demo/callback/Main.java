package com.jing.test.demo.callback;

/**
 * 回调的基本概念就是
 * A调用B的方法C,C方法再调用A的方法D 
 * 所以上述的方法C即是回调函数
 * @author hspcadmin
 *
 */
public class Main {

	public static void main(String[] args){
		MrsFeng feng = new MrsFeng() ;
		MrJing jing = new MrJing("jing",feng) ;
		
		jing.askQuestion("do you love me? ");
	}
}
