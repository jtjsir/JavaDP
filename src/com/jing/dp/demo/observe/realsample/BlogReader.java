package com.jing.dp.demo.observe.realsample;

/**
 * ���Ͷ������ڹ۲��߶���ֱ������JDK�Ľӿ�
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
			System.out.println(this.name +  " Ҫȥ��" + writer.getName() + " д�� " + writer.getLastedBlog());
		}
	}

	//��������
	public void subscribe(String writername){
		SubscribeManager.getInstance().addBlogReader(writername, this);
	}
	
	public void unsubscribe(String writername){
		SubscribeManager.getInstance().removeBlogReader(writername, this);
	}
}
