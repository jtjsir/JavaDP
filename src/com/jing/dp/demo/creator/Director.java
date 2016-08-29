package com.jing.dp.demo.creator;

/**
 * @author jingsir
 **
 * 中心类，控制产品的创造
 */
public class Director {

	public Product createProduct(IBuilder builder, String name) {
		builder.createProduct(name);
		builder.buildColor();
		builder.buildSize();

		return builder.getProduct();
	}
}
