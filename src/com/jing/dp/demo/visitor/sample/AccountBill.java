package com.jing.dp.demo.visitor.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingsir
 **
 *         �ṹ��
 */
public class AccountBill {

	private List<Bill> bills;

	public AccountBill() {
		bills = new ArrayList<>();
	}

	public void addBill(Bill bill) {
		bills.add(bill);
	}

	// �ṩ������Ԫ�صķ���
	public void veiwAll(Viewer viewer) {
		for (Bill bill : bills) {
			bill.accept(viewer);
		}
	}
}
