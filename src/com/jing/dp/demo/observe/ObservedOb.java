package com.jing.dp.demo.observe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jing.dp.demo.observe.ifs.TestObserver;

/**
 * ���۲���
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
	
	//֪ͨ���������Լ�״̬�ı���֪ͨ���еĹ۲���
	public void inform(){
		System.out.println("���۲��ߵ�״̬�ı��ˣ���Ҫ֪ͨ��Ӧ�Ĺ۲���");
		for(TestObserver observer : this.observers){
			observer.update();
		}
	}
}
