package com.jing.dp.demo.command.sample;

/**
 * 
 * @author jingsir
 **
 */
public class ProblemCommand implements TaskCommand {

	private String name ;
	
	public ProblemCommand(String name){
		this.name = name ;
	}
	
	@Override
	public void print() {
		System.out.print("this is a problem command");
	}

	@Override
	public void displaySender() {
		System.out.println(this.name + "有一个problem任务待解决");
	}

}
