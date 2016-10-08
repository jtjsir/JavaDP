package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 * 
 */
public class BossViewer implements Viewer {

	@Override
	public void view(IncomeBill iBill) {
		System.out.println("�쿴�߽�ɫΪ�ϰ壬�ܹ�����Ϊ: " + iBill.getMoneyIn());
	}

	@Override
	public void view(OutcomeBill oBill) {

		System.out.println("�쿴�߽�ɫΪ�ϰ壬��֧��Ϊ: " + oBill.getMoneyOut());
	}

}
