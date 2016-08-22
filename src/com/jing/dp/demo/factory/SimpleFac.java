package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.BProduct;
import com.jing.dp.demo.factory.product.ProductOne;

/**
 * 简单工厂的实现,实现简单，但是对修改开放
 * 
 * @author hspcadmin
 *
 *         根据产品名来生产
 */
public class SimpleFac {

	public ProductOne createProductOne(String productName) {
		if ("productA".equals(productName)) {
			return new AProduct();
		} else if ("productB".equals(productName)) {
			return new BProduct();
		}

		return null;
	}
}
