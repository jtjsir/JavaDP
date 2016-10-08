package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 * 
 */
public class OutcomeBill implements Bill {

	private String item;
	private int moneyOut;

	public OutcomeBill(String item, int money) {
		this.item = item;
		this.moneyOut = money;
	}

	@Override
	public void accept(Viewer viewer) {
		viewer.view(this);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getMoneyOut() {
		return moneyOut;
	}

	public void setMoneyOut(int moneyOut) {
		this.moneyOut = moneyOut;
	}

}
