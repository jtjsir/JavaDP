package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 * 
 */
public class BossViewer implements Viewer {

	@Override
	public void view(IncomeBill iBill) {
		System.out.println("察看者角色为老板，总共收入为: " + iBill.getMoneyIn());
	}

	@Override
	public void view(OutcomeBill oBill) {

		System.out.println("察看者角色为老板，总支出为: " + oBill.getMoneyOut());
	}

}
