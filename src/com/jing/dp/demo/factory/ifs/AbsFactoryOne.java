package com.jing.dp.demo.factory.ifs;

import com.jing.dp.demo.factory.product.ProductOne;

/**
 * 工厂模式接口
 * @author hspcadmin
 *专门生产产品线1的产品
 */
public interface AbsFactoryOne {

	ProductOne createProductOne() ;
}
