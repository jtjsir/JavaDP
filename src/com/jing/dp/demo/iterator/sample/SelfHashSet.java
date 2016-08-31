package com.jing.dp.demo.iterator.sample;

import java.util.HashMap;
import java.util.Map;

/**
@author jingsir

**
*/
public class SelfHashSet<E> {

	private static final Object NULL = new Object() ;
	
	private Map<E,Object> map = new HashMap<>() ;
	
	public void add(E e){
		map.put(e, NULL) ;
	}
	
	public int size(){
		return map.size() ;
	}
	
	public Object[] toArray(){
		return map.keySet().toArray() ;
	}
}
