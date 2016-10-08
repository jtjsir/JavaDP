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
 *         ������ģʽ���ṹ�����е�Ԫ���ǹ̶��ģ��������߶����з��ʵ�Ԫ�ض�������ǹ̶���
 * 
 *         �Է����߷��Ͽ���ԭ�򣬶�Ԫ�ز����Ͽ���ԭ�򣬲��ýӿ�ȥ����if/else������ж�
 */
public class MainVisitor {

	public static void main(String[] args) {
		// �ṹ
		AccountBill accountBill = new AccountBill();

		// Ԫ��
		Bill incomeBill = new IncomeBill("��Ʊ����", 10000000);
		Bill outcomeBill = new OutcomeBill("�ɼ�װ��", 200000);

		// ��Ԫ�ط���ṹ��
		accountBill.addBill(incomeBill);
		accountBill.addBill(outcomeBill);

		// ����һ�������߶���
		Viewer boss = new BossViewer();

		// ��������߲鿴�ṹ�е�����Ԫ��
		accountBill.veiwAll(boss);
	}

}
