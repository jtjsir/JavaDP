package com.jing.dp.demo.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * 类适配器的应用
 * @author hspcadmin
 *
 *采用继承的方法在原有的Observer接口上加入HashMap的引用
 */
public class HashMapClassAdapter<K,V> extends HashMap<K, V> implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		super.clear();
	}

	
}
