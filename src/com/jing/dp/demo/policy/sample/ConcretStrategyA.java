package com.jing.dp.demo.policy.sample;

public class ConcretStrategyA implements Strategy {

	@Override
	public void insertCode() {
		System.out.println("插入一段策略A的代码");
	}

}
