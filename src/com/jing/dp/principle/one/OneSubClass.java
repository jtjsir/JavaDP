package com.jing.dp.principle.one;

public class OneSubClass extends OneSuperClass{

	//���ิд����ķ�����������֧�ָ����ĳһ������
	@Override
	public void print(){
		throw new UnsupportedOperationException("���಻֧�ָ����print()����") ;
	}
	
	//�������ĳ������Ӧ�õ�����ķ���
	public void read(OneSuperClass superClass){
		superClass.print();
	}
}
