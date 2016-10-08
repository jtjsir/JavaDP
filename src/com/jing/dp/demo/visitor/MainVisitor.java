package com.jing.dp.demo.visitor;

import com.jing.dp.demo.visitor.sample.AccountBill;
import com.jing.dp.demo.visitor.sample.Bill;
import com.jing.dp.demo.visitor.sample.BossViewer;
import com.jing.dp.demo.visitor.sample.IncomeBill;
import com.jing.dp.demo.visitor.sample.OutcomeBill;
import com.jing.dp.demo.visitor.sample.Viewer;

/**
 * @author jingsir
 **
 *         访问者模式，结构与其中的元素是固定的，即访问者对象中访问的元素对象个数是固定的
 * 
 *         对访问者符合开闭原则，对元素不符合开闭原则，采用接口去除了if/else的语句判断
 */
public class MainVisitor {

	public static void main(String[] args) {
		// 结构
		AccountBill accountBill = new AccountBill();

		// 元素
		Bill incomeBill = new IncomeBill("股票红利", 10000000);
		Bill outcomeBill = new OutcomeBill("采集装备", 200000);

		// 将元素放入结构中
		accountBill.addBill(incomeBill);
		accountBill.addBill(outcomeBill);

		// 创建一个访问者对象
		Viewer boss = new BossViewer();

		// 允许访问者查看结构中的所有元素
		accountBill.veiwAll(boss);
	}

}
