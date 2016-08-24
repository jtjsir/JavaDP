package com.jing.dp.demo.mediator;

import com.jing.dp.demo.mediator.sample.Mediator;
import com.jing.dp.demo.mediator.sample.ifs.IBuytor;
import com.jing.dp.demo.mediator.sample.ifs.ISaletor;
import com.jing.dp.demo.mediator.sample.impl.HouseBuytor;
import com.jing.dp.demo.mediator.sample.impl.HouseSaletor;

/**
 * @author jingsir
 * 
 *         �н���ģʽ��Ӧ�ã���ģʽ�ϸ�������ģʽ���ƣ�������Ϊ��û��ȷ���ķ��򣬼�Դ����Ŀ�ķ������໥Ӱ��
 **		   
 */
public class MainMediator {

	public static void main(String[] args){
		Mediator mediator = Mediator.getInstance() ;
		
		ISaletor saletor1 = new HouseSaletor("saleA") ;
		ISaletor saletor2 = new HouseSaletor("saleB") ;
		ISaletor saletor3 = new HouseSaletor("saleC") ;
		
		IBuytor buytor1 = new HouseBuytor("buy1") ;
		IBuytor buytor2 = new HouseBuytor("buy2") ;
		
		mediator.receiveSaletor(saletor2);
		mediator.receiveSaletor(saletor3);
		
		mediator.receiveBuytor(buytor1);
		mediator.receiveBuytor(buytor2);
		
		//������Ϣ
		mediator.sendSaleInfo(saletor1, buytor1);
		mediator.sendSaleInfo(saletor2, buytor2);
		mediator.sendSaleInfo(saletor3, buytor1);
	}
}
