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
 *         ����ģʽ��Ӧ��
 *         ���ã���Ϊ����������Ϊ�����ߵĽ����Ϊ������ֻ��Ҫ������͸�������
 *         ����һ���м��˽�������ղ��ַ�
 *         
 *         �е�������"�����ߺ�������"��˼��
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
		
		//ʣ�������չʾ
		System.out.println("------------------��ʣ�µ�����չʾ--------------");
		productManager.printFreecommands();
		
		
	}
}
