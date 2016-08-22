package com.jing.dp.demo.observe.realsample;

/**
 * 博客读者属于观察者对象，直接引用JDK的接口
 */
import java.util.Observable;
import java.util.Observer;

public class BlogReader implements Observer {

	private String name ;
	
	public  BlogReader(String name) {
		this.name = name ;
	}
	
	@Override
	public void update(Observable observered, Object arg1) {
		if(observered instanceof BlogWriter){
			BlogWriter writer = (BlogWriter)observered ;
			System.out.println(this.name +  " 要去看" + writer.getName() + " 写的 " + writer.getLastedBlog());
		}
	}

	//订阅作者
	public void subscribe(String writername){
		SubscribeManager.getInstance().addBlogReader(writername, this);
	}
	
	public void unsubscribe(String writername){
		SubscribeManager.getInstance().removeBlogReader(writername, this);
	}
}
