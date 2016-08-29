package com.jing.dp.demo.creator;

/**
 * @author jingsir ������ģʽ��Ӧ�� 	����������̺ͱ�ʾ����
 */
public class MainCreator {

	public static void main(String[] args) {
		Director director = new Director();

		Product product1 = director.createProduct(new ProductBuilder(), "��Ʒ1");

		Product product2 = director.createProduct(new ProductBuilder(), "��Ʒ2");

		System.out.println("��Ʒ1�Ĵ�С: " + product1.getSize());
		System.out.println("��Ʒ2�Ĵ�С: " + product2.getSize());
	}
}
