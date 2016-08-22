package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.BProduct;
import com.jing.dp.demo.factory.product.ProductOne;

/**
 * �򵥹�����ʵ��,ʵ�ּ򵥣����Ƕ��޸Ŀ���
 * 
 * @author hspcadmin
 *
 *         ���ݲ�Ʒ��������
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
