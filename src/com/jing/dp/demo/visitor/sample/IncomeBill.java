package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 * 收入单子元素
 */
public class IncomeBill implements Bill {
	
	private String item ;
	private int moneyIn ;
	
	public IncomeBill(String item,int money){
		this.item = item ;
		this.moneyIn = money ;
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

	public int getMoneyIn() {
		return moneyIn;
	}

	public void setMoneyIn(int moneyIn) {
		this.moneyIn = moneyIn;
	}

	
}
