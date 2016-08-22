package com.jing.dp.demo.observe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jing.dp.demo.observe.ifs.TestObserver;

/**
 * 被观察者
 * @author hspcadmin
 *
 */
public class ObservedOb {
	
	private List<TestObserver> observers  = Collections.synchronizedList(new ArrayList<TestObserver>(10));
	
	public ObservedOb(){
		
	}

	public List<TestObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<TestObserver> observers) {
		this.observers = observers;
	}
	
	public void addObserver(TestObserver observer){
		this.observers.add(observer) ;
	}
	
	public void removeObserver(TestObserver observer){
		this.observers.remove(observer) ;
	}
	
	//通知函数，当自己状态改变了通知所有的观察者
	public void inform(){
		System.out.println("被观察者的状态改变了，需要通知相应的观察者");
		for(TestObserver observer : this.observers){
			observer.update();
		}
	}
}
