package com.jing.dp.demo.observe;

/**
 * �۲���ģʽ��ʹ��
 * 
 * @author hspcadmin ���ı��״̬֪ͨ������,�ʺϹ۲��ߺͱ��۲����Ƕ��һ�Ĺ�ϵ 
 * 
 * �۲��ߡ����۲���
 */
public class ObserveMain {

	public static void main(String[] args) {
		ObservedOb ob = new ObservedOb();

		ob.addObserver(new OneObserver());
		ob.addObserver(new TwoObserver());

		ob.inform();
	}
}
