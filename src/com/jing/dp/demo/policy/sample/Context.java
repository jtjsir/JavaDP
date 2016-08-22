package com.jing.dp.demo.policy.sample;

/**
 * 使用策略接口的类
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
		System.out.println("内部方法，不动");
		strategy.insertCode();
		System.out.println("内部方法，不动");
	}
}
