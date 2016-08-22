package com.jing.dp.demo.adapter.entity;

import java.util.Observable;
import java.util.Observer;

/**
 * 对象适配器的应用
 * 
 * @author hspcadmin
 * 
 *单继承原有的属性并且附带被观察者的属性
 */
public class BaseObjectAdapterEntity extends BaseEntity {

	//传入对象来实现另外的功能
	private Observable observable = new Observable();

	public synchronized void addObserver(Observer observer) {
		observable.addObserver(observer);
	}

	public synchronized void deleteObserver(Observer observer) {
		observable.deleteObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public synchronized void deleteObservers() {
		observable.deleteObservers();
	}

}
