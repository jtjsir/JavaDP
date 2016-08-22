package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsTotalFactory;
import com.jing.dp.demo.factory.product.BProduct;
import com.jing.dp.demo.factory.product.DProduct;
import com.jing.dp.demo.factory.product.ProductOne;
import com.jing.dp.demo.factory.product.ProductTwo;

/**
 * 专门用来生产B、D产品
 * @author hspcadmin
 *
 */
public class BestFacBD implements AbsTotalFactory {

	@Override
	public ProductOne createProductOne() {
		return new BProduct();
	}

	@Override
	public ProductTwo createProductTwo() {
		return new DProduct();
	}

}
