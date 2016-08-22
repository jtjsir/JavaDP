package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsFactoryOne;
import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.ProductOne;

/**
 * 工厂模式的使用,弥补简单工厂模式中的违反的开闭原则
 * 
 * @author hspcadmin 专门用来生产A产品
 */
public class BetterFacA implements AbsFactoryOne {

	@Override
	public ProductOne createProductOne() {

		return new AProduct();
	}

}
