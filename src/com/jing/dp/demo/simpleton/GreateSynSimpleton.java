package com.jing.dp.demo.simpleton;

/**
 * ��Сsynchronized����Χ,��JVM��ִ��˳���й�
 * 
 * 
 * Ǳ��Σ�գ����JVM����������Ϊ:�����ڴ桢��ʼ����������ָ���ַ û������
 * 
 * ����� �����ڴ桢ָ���ַ����ʼ�����������ܶ�����δ��ʼ��ʱ��ͽ�����ʹ�ã����������ʺ�С��
 * 
 * @author hspcadmin
 *
 */
public class GreateSynSimpleton {

	private static GreateSynSimpleton greateSynSimpleton;

	private GreateSynSimpleton() {

	}

	public static GreateSynSimpleton getInstance() {
		if (greateSynSimpleton == null) {
			synchronized (GreateSynSimpleton.class) {
				// �ٴ��жϣ���ֹ���̴߳������ʾ��
				if (greateSynSimpleton == null) {
					greateSynSimpleton = new GreateSynSimpleton();
				}
			}
		}

		return greateSynSimpleton;
	}
}
