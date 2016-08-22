package com.jing.dp.demo.factory.ifs;

import com.jing.dp.demo.factory.product.ProductOne;
import com.jing.dp.demo.factory.product.ProductTwo;

/**
 * 抽象工厂模式
 * @author hspcadmin
 *将所有的抽象产品都集合在同一个接口
 */
public interface AbsTotalFactory {

	ProductOne createProductOne() ;
	
	ProductTwo createProductTwo() ;
}
