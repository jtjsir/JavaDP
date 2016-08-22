package com.jing.dp.principle.one;
/**
 * 里氏规则：子类应该可以替代父类完成相应的操作，即<i>子类不轻易替换父类的方法</i>
 * 
 * 以下为子类替换父类的一个方法可能导致的一个后果
 * @author hspcadmin
 *
 */
public class MainOne {

	public static void main(String[] args){
		OneSubClass sub = new OneSubClass() ;
//		sub.read(new OneSuperClass());
		sub.read(new OneSubClass());
	}
}
