package com.jing.dp.demo.iterator.sample;

import java.util.Iterator;

/**
@author jingsir

**
*/
public class SelfArrayList<E> implements Iterable<E>{
	private static final int INCREAMENT = 10 ;
	
	private E[] array = (E[])new Object[10] ;
	
	private int size ;
	
	public void add(E e){
		if(size < array.length){
			array[size++] = e ;
		}else{
			E[] newArr = (E[])new Object[array.length + INCREAMENT] ;
			System.arraycopy(array, 0, newArr, 0, size);
			array = newArr ;
			array[size++] = e ;
		}
	}
	
	public Object[] toArray(){
		Object[] copy = new Object[size] ;
		System.arraycopy(array, 0, copy, 0, size);
		
		return copy ;
	}
	
	public int size(){
		return this.size ;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}
	
	//使用内部类封装迭代器
	private class Itr implements Iterator<E>{
		int cursor = 0 ;
		
		@Override
		public boolean hasNext() {
			return cursor != size();
		}

		@Override
		public E next() {
			return array[cursor++];
		}

		@Override
		public void remove() {
			
		}
		
	}
}
