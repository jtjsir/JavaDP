package com.jing.dp.demo.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * ����������Ӧ��
 * @author hspcadmin
 *
 *���ü̳еķ�����ԭ�е�Observer�ӿ��ϼ���HashMap������
 */
public class HashMapClassAdapter<K,V> extends HashMap<K, V> implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		super.clear();
	}

	
}
