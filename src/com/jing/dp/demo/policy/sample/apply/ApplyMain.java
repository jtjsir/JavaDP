package com.jing.dp.demo.policy.sample.apply;

import com.jing.dp.demo.policy.sample.apply.factory.CalPriceFactory;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;

/**
 * 策略模式的应用附带注解应用
 * 
 * @author hspcadmin 通过加载class文件来获取注解信息
 */
public class ApplyMain {

	public static void main(String[] args) {
		Double amount = 2100D;
		CalPrice pricePolicy = new CalPriceFactory().createCalPricePolicy(amount);
		System.out.println("打折后的价格为: " + pricePolicy.calPrice(amount));
	}
}
