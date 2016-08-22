package com.jing.test.demo.callback;

/**
 * Mr.jing
 * @author hspcadmin
 *
 */
public class MrJing implements Callback{
	private MrsFeng feng ;
	private String name ;
	
	public MrJing(String name,MrsFeng feng) {
		this.name = name ;
		this.feng = feng ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void reply() {
		System.out.println("Mrs.Feng says she love you!") ;
	}
	
	public void askQuestion(final String question){
		new Thread(new Runnable() {
			@Override
			public void run() {
				feng.answer(question, MrJing.this);
			}
		}).start();
	}

}
