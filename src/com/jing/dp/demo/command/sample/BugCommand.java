package com.jing.dp.demo.command.sample;
/**
@author jingsir

**
*/
public class BugCommand implements TaskCommand {
	private String senderName ;
	
	public BugCommand(String name) {
		this.senderName = name ;
	}
	
	@Override
	public void print() {
		System.out.print("this is a bug command");
	}

	@Override
	public void displaySender() {
		System.out.println(this.senderName + "有一个bug任务待解决");
	}

}
