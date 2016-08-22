package com.jing.dp.demo.policy;

import com.jing.dp.demo.policy.sample.ConcretStrategyA;
import com.jing.dp.demo.policy.sample.ConcretStrategyB;
import com.jing.dp.demo.policy.sample.Context;
import com.jing.dp.demo.policy.sample.Strategy;

/**
 * 策略模式：采用接口的入参，可以随意变化调用的接口的实现方法(本质是实现的接口算法不同)
 * @author hspcadmin
 *
 */
public class PolicyMain {

	public static void main(String[] args){
		Context context = new Context() ;
		
		Strategy strategy1 = new ConcretStrategyA() ;
		Strategy strategy2 = new ConcretStrategyB() ;
		
		//执行策略1
		context.setStrategy(strategy1);
		context.execute();
		
		//执行策略2
		context.setStrategy(strategy2);
		context.execute();
	}
}
