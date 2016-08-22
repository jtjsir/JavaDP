package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsFactoryOne;
import com.jing.dp.demo.factory.product.BProduct;
import com.jing.dp.demo.factory.product.ProductOne;

public class BetterFacB implements AbsFactoryOne{

	@Override
	public ProductOne createProductOne() {
		return new BProduct();
	}

	
}
