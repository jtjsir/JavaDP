package com.jing.dp.demo.policy.sample;

/**
 * ʹ�ò��Խӿڵ���
 * @author hspcadmin
 *
 */
public class Context {

	private Strategy strategy ;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(){
		System.out.println("�ڲ�����������");
		strategy.insertCode();
		System.out.println("�ڲ�����������");
	}
}
