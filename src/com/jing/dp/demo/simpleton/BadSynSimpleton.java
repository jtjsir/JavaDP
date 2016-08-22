package com.jing.dp.demo.simpleton;
/**
 * ͬ��������֤��̬ʵ������ʹ��������ϵͳ���Ĵ�
 * @author hspcadmin
 *
 */
public class BadSynSimpleton {

	private static BadSynSimpleton badSynSimpleton ;
	
	private BadSynSimpleton(){
		
	}
	
	public static synchronized BadSynSimpleton getInstance(){
		if(badSynSimpleton==null){
			badSynSimpleton = new BadSynSimpleton() ;
		}
		
		return badSynSimpleton ;
	}
}
