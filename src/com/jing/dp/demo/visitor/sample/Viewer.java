package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 *         ������,���ʵ�Ԫ�ظ����ǹ̶���
 */
public interface Viewer {

	void view(IncomeBill iBill);

	void view(OutcomeBill oBill);
}
