package com.jing.dp.demo.policy.sample.apply;

import com.jing.dp.demo.policy.sample.apply.factory.CalPriceFactory;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;

/**
 * ����ģʽ��Ӧ�ø���ע��Ӧ��
 * 
 * @author hspcadmin ͨ������class�ļ�����ȡע����Ϣ
 */
public class ApplyMain {

	public static void main(String[] args) {
		Double amount = 2100D;
		CalPrice pricePolicy = new CalPriceFactory().createCalPricePolicy(amount);
		System.out.println("���ۺ�ļ۸�Ϊ: " + pricePolicy.calPrice(amount));
	}
}
