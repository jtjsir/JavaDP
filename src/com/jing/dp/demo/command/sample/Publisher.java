package com.jing.dp.demo.command.sample;

/**
 * @author jingsir 行为的请求者
 **
 */
public class Publisher {

	private String name ;
	
	public Publisher(String name){
		this.name = name ;
	}
	
	public void sendTask(ProductManager manager,TaskCommand command){
		manager.receiveCommand(command);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
