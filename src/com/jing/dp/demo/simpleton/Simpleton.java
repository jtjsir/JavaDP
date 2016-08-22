package com.jing.dp.demo.simpleton;

/**
 * ��򵥵ĵ���ģʽ��ʵ��,�ʺϵ��߳�
 * @author hspcadmin
 *
 */
public class Simpleton {

	private static Simpleton simpleton ;
	
	//ʵ��˽�л�����ֹ��������
	private Simpleton(){
		
	}
	
	public static Simpleton getInstance(){
		if(null==simpleton){
			simpleton = new Simpleton() ;
		}
		
		return simpleton ;
	}
}
