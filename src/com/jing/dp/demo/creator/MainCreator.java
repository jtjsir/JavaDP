package com.jing.dp.demo.creator;

/**
 * @author jingsir 建造者模式的应用 	将对象构造过程和表示分离
 */
public class MainCreator {

	public static void main(String[] args) {
		Director director = new Director();

		Product product1 = director.createProduct(new ProductBuilder(), "产品1");

		Product product2 = director.createProduct(new ProductBuilder(), "产品2");

		System.out.println("产品1的大小: " + product1.getSize());
		System.out.println("产品2的大小: " + product2.getSize());
	}
}
