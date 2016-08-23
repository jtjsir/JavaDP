package com.jing.dp.demo.command.sample;
/**
@author jingsir

任务接受者
**
*/
public class Programmer {

	private String name ;
	
	public Programmer(String name){
		this.name = name ;
	}
	
	public void processCommand(TaskCommand command){
		System.out.print("received command info: ");
		command.print();
		System.out.println(", The " + this.name + " process this command");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
