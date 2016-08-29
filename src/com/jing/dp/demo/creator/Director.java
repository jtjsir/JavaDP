package com.jing.dp.demo.creator;

/**
 * @author jingsir
 **
 * �����࣬���Ʋ�Ʒ�Ĵ���
 */
public class Director {

	public Product createProduct(IBuilder builder, String name) {
		builder.createProduct(name);
		builder.buildColor();
		builder.buildSize();

		return builder.getProduct();
	}
}
