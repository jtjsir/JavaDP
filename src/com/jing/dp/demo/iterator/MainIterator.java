package com.jing.dp.demo.iterator;

import java.util.Iterator;

import com.jing.dp.demo.iterator.sample.SelfArrayList;
import com.jing.dp.demo.iterator.sample.SelfLinkedList;

/**
 * @author jingsir 迭代器模式 在不暴露内部对象的表示提供一个方法顺序访问一个聚合对象的各个元素
 **
 */
public class MainIterator {

	public static void main(String[] args){
		SelfArrayList<Integer> selfArrayList = new SelfArrayList<>() ;
		for(int i = 0; i < 11; i++){
			selfArrayList.add(i);
		}
		
		//遍历arraylist方法，其中重复遍历了一次，在其内部的system.arraycopy()
		Object[] copy = selfArrayList.toArray() ;
		int size = copy.length ;
		for(int j = 0 ; j < size ; j++){
			System.out.println(copy[j]);
		}
		
		
		//使用迭代器模式后的统一方法
		Iterator<Integer> iterator = selfArrayList.iterator() ;
		while(iterator.hasNext()){
			System.out.println(iterator.next()) ;
		}
		
		System.out.println("-------------------------------------------------");
		SelfLinkedList<Integer> linkedList = new SelfLinkedList<>() ;
		for(int i = 11 ; i < 21; i++){
			linkedList.add(i);
		}
		
		//遍历
		Iterator<Integer> linkIterator = linkedList.iterator() ;
		while(linkIterator.hasNext()){
			System.out.println(linkIterator.next());
		}
	}
}
