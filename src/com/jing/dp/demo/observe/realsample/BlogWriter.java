package com.jing.dp.demo.observe.realsample;

import java.util.Observable;

/**
 * �����������ڱ��۲���
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

	//���߸��²��ͣ�����֪ͨ���еĶ��ĵĶ���
	public void inform(){
		try {
			notifyObservers();
		} catch (Exception e) {
			System.out.println("���۲��ߵ�update��������");
			e.printStackTrace();
		}
	}
	
	public void addNovel(String novel){
		System.out.println(this.name + " ����һ����Ϊ: " + novel + " ��С˵");
		this.lastedBlog = novel ;
		setChanged();
		inform();
	}
}
