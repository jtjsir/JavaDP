package com.jing.dp.demo.iterator.sample;

import java.util.Iterator;

/**
@author jingsir

**
*/
public class SelfLinkedList<E> implements Iterable<E>{

	private Entry<E> header = new Entry<E>(null, null, null) ;
	
	private int size ;
	
	public SelfLinkedList(){
		header.next = header.previous = header ;
	}
	
	public void add(E e){
		
		Entry<E> newEntry = new Entry<E>(e, header, header.next) ;
		newEntry.previous.next = newEntry ;
		newEntry.next.previous = newEntry ;
		
		size++ ;
	}

	public int size(){
		return size ;
	}
	
	public Object[] toArray(){
		Object[] result = new Object[size] ;
		int i = size -1 ;
		for(Entry<E> entry = header.next ;entry!=header ;entry = entry.next){
			result[i--] = entry.value ;
		}
		
		return result ;
	}
	
	private static class Entry<E>{
		//值，前标，后标
		E value ;
		Entry<E> previous ;
		Entry<E> next ;
		public Entry(E vale,Entry<E> previous,Entry<E> next){
			super() ;
			this.value = vale ;
			this.previous = previous;
			this.next = next ;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator<E>{

		private Entry<E> current  = header;
		
		@Override
		public boolean hasNext() {
			return current.previous!=header;
		}

		@Override
		public E next() {
			E value = current.previous.value ;
			current = current.previous ;
			
			return value;
		}

		@Override
		public void remove() {
			
		}
		
	}
}
