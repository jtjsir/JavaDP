package com.jing.dp.demo.iterator;

import java.util.Iterator;

import com.jing.dp.demo.iterator.sample.SelfArrayList;
import com.jing.dp.demo.iterator.sample.SelfLinkedList;

/**
 * @author jingsir ������ģʽ �ڲ���¶�ڲ�����ı�ʾ�ṩһ������˳�����һ���ۺ϶���ĸ���Ԫ��
 **
 */
public class MainIterator {

	public static void main(String[] args){
		SelfArrayList<Integer> selfArrayList = new SelfArrayList<>() ;
		for(int i = 0; i < 11; i++){
			selfArrayList.add(i);
		}
		
		//����arraylist�����������ظ�������һ�Σ������ڲ���system.arraycopy()
		Object[] copy = selfArrayList.toArray() ;
		int size = copy.length ;
		for(int j = 0 ; j < size ; j++){
			System.out.println(copy[j]);
		}
		
		
		//ʹ�õ�����ģʽ���ͳһ����
		Iterator<Integer> iterator = selfArrayList.iterator() ;
		while(iterator.hasNext()){
			System.out.println(iterator.next()) ;
		}
		
		System.out.println("-------------------------------------------------");
		SelfLinkedList<Integer> linkedList = new SelfLinkedList<>() ;
		for(int i = 11 ; i < 21; i++){
			linkedList.add(i);
		}
		
		//����
		Iterator<Integer> linkIterator = linkedList.iterator() ;
		while(linkIterator.hasNext()){
			System.out.println(linkIterator.next());
		}
	}
}
