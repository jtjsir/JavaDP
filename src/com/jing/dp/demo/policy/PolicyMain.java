package com.jing.dp.demo.policy;

import com.jing.dp.demo.policy.sample.ConcretStrategyA;
import com.jing.dp.demo.policy.sample.ConcretStrategyB;
import com.jing.dp.demo.policy.sample.Context;
import com.jing.dp.demo.policy.sample.Strategy;

/**
 * ����ģʽ�����ýӿڵ���Σ���������仯���õĽӿڵ�ʵ�ַ���(������ʵ�ֵĽӿ��㷨��ͬ)
 * @author hspcadmin
 *
 */
public class PolicyMain {

	public static void main(String[] args){
		Context context = new Context() ;
		
		Strategy strategy1 = new ConcretStrategyA() ;
		Strategy strategy2 = new ConcretStrategyB() ;
		
		//ִ�в���1
		context.setStrategy(strategy1);
		context.execute();
		
		//ִ�в���2
		context.setStrategy(strategy2);
		context.execute();
	}
}
