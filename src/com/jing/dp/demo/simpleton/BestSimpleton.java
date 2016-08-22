package com.jing.dp.demo.simpleton;

/**
 * ʹ���ڲ���ʵ��
 * 
 * @author hspcadmin
 *
 */
public class BestSimpleton {
	
	private BestSimpleton() {
		System.out.println("���ڱ���ʼ��");
	}

	public static BestSimpleton getInstance() {
		return SingletonCreator.bestSimpleton;
	}

	private static class SingletonCreator {
		// �ڲ���ֻ�б��������õ�ʱ��ż��ؾ�̬����
		private static BestSimpleton bestSimpleton = new BestSimpleton();
	}

	public static void main(String[] args) {
//		 BestSimpleton.getInstance() ;
	}
}
