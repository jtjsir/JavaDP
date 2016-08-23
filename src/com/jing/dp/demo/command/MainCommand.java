package com.jing.dp.demo.command;

import com.jing.dp.demo.command.sample.BugCommand;
import com.jing.dp.demo.command.sample.OnlineCommnad;
import com.jing.dp.demo.command.sample.ProblemCommand;
import com.jing.dp.demo.command.sample.ProductManager;
import com.jing.dp.demo.command.sample.Programmer;
import com.jing.dp.demo.command.sample.Publisher;

/**
 * @author jingsir
 * 
 *         命令模式的应用
 *         作用：行为请求者与行为接受者的解耦，行为请求者只需要将命令发送给接受者
 *         存在一个中间人将命令接收并分发
 *         
 *         有点类似于"生产者和消费者"的思想
 **
 */
public class MainCommand {

	public static void main(String[] args){
		Publisher publisherA = new Publisher("PublisherA") ;
		Publisher publisherB = new Publisher("PublisherB") ;
		Publisher publisherC = new Publisher("PublisherC") ;
		Publisher publisherD = new Publisher("PublisherD") ;
		
		ProductManager productManager = new ProductManager() ;
		
		publisherA.sendTask(productManager, new ProblemCommand(publisherA.getName()));
		publisherA.sendTask(productManager, new OnlineCommnad(publisherA.getName()));
		publisherA.sendTask(productManager, new BugCommand(publisherA.getName()));
		publisherB.sendTask(productManager, new BugCommand(publisherB.getName()));
		publisherC.sendTask(productManager, new OnlineCommnad(publisherC.getName()));
		publisherD.sendTask(productManager, new BugCommand(publisherD.getName()));
		
		productManager.addGrammer(new Programmer("xiaoli"));
		productManager.addGrammer(new Programmer("xiaojing"));
		
		//
		productManager.dispatchCommand();
		
		//剩余的任务展示
		System.out.println("------------------还剩下的任务展示--------------");
		productManager.printFreecommands();
		
		
	}
}
