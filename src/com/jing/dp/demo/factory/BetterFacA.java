package com.jing.dp.demo.factory;

import com.jing.dp.demo.factory.ifs.AbsFactoryOne;
import com.jing.dp.demo.factory.product.AProduct;
import com.jing.dp.demo.factory.product.ProductOne;

/**
 * ����ģʽ��ʹ��,�ֲ��򵥹���ģʽ�е�Υ���Ŀ���ԭ��
 * 
 * @author hspcadmin ר����������A��Ʒ
 */
public class BetterFacA implements AbsFactoryOne {

	@Override
	public ProductOne createProductOne() {

		return new AProduct();
	}

}
