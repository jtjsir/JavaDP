package com.jing.test.demo.callback;

/**
 * �ص��Ļ����������
 * A����B�ķ���C,C�����ٵ���A�ķ���D 
 * ���������ķ���C���ǻص�����
 * @author hspcadmin
 *
 */
public class Main {

	public static void main(String[] args){
		MrsFeng feng = new MrsFeng() ;
		MrJing jing = new MrJing("jing",feng) ;
		
		jing.askQuestion("do you love me? ");
	}
}
