package com.jing.dp.demo.visitor.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingsir
 **
 *         结构类
 */
public class AccountBill {

	private List<Bill> bills;

	public AccountBill() {
		bills = new ArrayList<>();
	}

	public void addBill(Bill bill) {
		bills.add(bill);
	}

	// 提供遍历各元素的方法
	public void veiwAll(Viewer viewer) {
		for (Bill bill : bills) {
			bill.accept(viewer);
		}
	}
}
