package com.jing.dp.principle.one;

public class OneSubClass extends OneSuperClass{

	//子类复写父类的方法，表明不支持父类的某一个方法
	@Override
	public void print(){
		throw new UnsupportedOperationException("子类不支持父类的print()方法") ;
	}
	
	//在子类的某个方法应用到父类的方法
	public void read(OneSuperClass superClass){
		superClass.print();
	}
}
