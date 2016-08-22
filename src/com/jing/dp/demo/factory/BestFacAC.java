package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsTotalFactory;
import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.CProduct;
import com.jing.dp.demo.factory.product.ProductOne;
import com.jing.dp.demo.factory.product.ProductTwo;

/**
 * 抽象工厂模式的应用，集合工厂模式的只能生产一种产品线的缺陷
 * 
 * @author hspcadmin 专门用来生产A、C产品
 */
public class BestFacAC implements AbsTotalFactory {

	@Override
	public ProductOne createProductOne() {
		return new AProduct();
	}

	@Override
	public ProductTwo createProductTwo() {
		return new CProduct();
	}

}
