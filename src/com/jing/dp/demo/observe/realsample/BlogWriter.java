package com.jing.dp.demo.observe.realsample;

import java.util.Observable;

/**
 * 博客作者属于被观察者
 * @author hspcadmin
 *
 */
public class BlogWriter extends Observable{

	private String name ;
	
	private String lastedBlog ;
	
	public BlogWriter(String name,String lastedBlog){
		super();
		this.name = name ;
		this.lastedBlog = lastedBlog ;
		SubscribeManager.getInstance().putWriter(name, this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BlogWriter(String name){
		this.name = name ;
	}
	
	public String getLastedBlog() {
		return lastedBlog;
	}

	public void setLastedBlog(String lastedBlog) {
		this.lastedBlog = lastedBlog;
	}

	//作者更新博客，可以通知所有的订阅的读者
	public void inform(){
		try {
			notifyObservers();
		} catch (Exception e) {
			System.out.println("被观察者的update方法出错");
			e.printStackTrace();
		}
	}
	
	public void addNovel(String novel){
		System.out.println(this.name + " 发布一个名为: " + novel + " 的小说");
		this.lastedBlog = novel ;
		setChanged();
		inform();
	}
}
