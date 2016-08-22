package com.jing.dp.demo.observe.realsample;

/**
 * 应用JDK的observer机制的例子
 * @author hspcadmin
 *
 */
public class Main {

	public static void main(String[] args){
		//添加作者
		BlogWriter jingSir = new BlogWriter("JingSir","自我介绍") ;
		
		//读者
		BlogReader reader1 = new BlogReader("张三") ;
		BlogReader reader2 = new BlogReader("李四") ;
		BlogReader reader3 = new BlogReader("王五") ;
		BlogReader reader4 = new BlogReader("郑六") ;
		
		//订阅作者
		reader1.subscribe("JingSir");
		reader2.subscribe("JingSir");
		reader3.subscribe("JingSir");
		reader4.subscribe("JingSir");
		
		//作者更新文章
		jingSir.addNovel("设计模式");
		
		reader1.unsubscribe("JingSir");
		
		jingSir.addNovel("Java高并发编程");
		
	}
}
