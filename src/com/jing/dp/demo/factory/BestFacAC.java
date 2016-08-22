package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsTotalFactory;
import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.CProduct;
import com.jing.dp.demo.factory.product.ProductOne;
import com.jing.dp.demo.factory.product.ProductTwo;

/**
 * ���󹤳�ģʽ��Ӧ�ã����Ϲ���ģʽ��ֻ������һ�ֲ�Ʒ�ߵ�ȱ��
 * 
 * @author hspcadmin ר����������A��C��Ʒ
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
