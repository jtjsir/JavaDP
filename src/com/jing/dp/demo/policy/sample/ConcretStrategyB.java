package com.jing.dp.demo.policy.sample;

public class ConcretStrategyB implements Strategy {

	@Override
	public void insertCode() {
		System.out.println("插入一段策略B的代码");
	}

}
