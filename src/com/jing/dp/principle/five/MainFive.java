package com.jing.dp.principle.five;

//��һԭ��ÿһ���඼ֻ����һ�Ĺ��ܣ����Ѵ˹�����������
public class MainFive {

	public static void main(String[] args) {
		Reader reader = new Reader("");
		reader.read();

		int a = reader.getA();
		int b = reader.getB();

		System.out.println("�ӷ�������Ϊ: " + Caculator.add(a, b));
		System.out.println("����������Ϊ: " + Caculator.cut(a, b));
		System.out.println("ȡ��������Ϊ: " + Caculator.mod(a, b));
	}
}
