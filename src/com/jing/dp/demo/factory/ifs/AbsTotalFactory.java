package com.jing.dp.demo.factory.ifs;

import com.jing.dp.demo.factory.product.ProductOne;
import com.jing.dp.demo.factory.product.ProductTwo;

/**
 * ���󹤳�ģʽ
 * @author hspcadmin
 *�����еĳ����Ʒ��������ͬһ���ӿ�
 */
public interface AbsTotalFactory {

	ProductOne createProductOne() ;
	
	ProductTwo createProductTwo() ;
}
