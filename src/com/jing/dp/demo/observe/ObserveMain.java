package com.jing.dp.demo.observe;

/**
 * 观察者模式的使用
 * 
 * @author hspcadmin 将改变的状态通知订阅者,适合观察者和被观察者是多对一的关系 
 * 
 * 观察者、被观察者
 */
public class ObserveMain {

	public static void main(String[] args) {
		ObservedOb ob = new ObservedOb();

		ob.addObserver(new OneObserver());
		ob.addObserver(new TwoObserver());

		ob.inform();
	}
}
