package com.jing.dp.demo.adapter.entity;

import java.util.Observable;
import java.util.Observer;

/**
 * ������������Ӧ��
 * 
 * @author hspcadmin
 * 
 *���̳�ԭ�е����Բ��Ҹ������۲��ߵ�����
 */
public class BaseObjectAdapterEntity extends BaseEntity {

	//���������ʵ������Ĺ���
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
