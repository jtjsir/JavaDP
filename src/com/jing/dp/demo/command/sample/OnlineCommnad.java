package com.jing.dp.demo.command.sample;
/**
@author jingsir

**
*/
public class OnlineCommnad implements TaskCommand {

	private String name ;
	
	public OnlineCommnad(String name) {
		this.name = name ;
	}
	
	@Override
	public void print() {
		System.out.print("this is a online command");
	}
	
	@Override
	public void displaySender() {
		System.out.println(this.name + "有一个线上任务待解决");
	}

}
