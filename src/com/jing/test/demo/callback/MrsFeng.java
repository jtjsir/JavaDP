package com.jing.test.demo.callback;

public class MrsFeng {

	public void answer(String question,Callback callback){
		if(callback.getClass().equals(MrJing.class)){
			MrJing jingSir = (MrJing)callback ;
			System.out.println(jingSir.getName() + " 问了一个问题: "
					 + question);
		}
		callback.reply();
	}
}
