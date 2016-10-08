package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 *         访问者,访问的元素个数是固定的
 */
public interface Viewer {

	void view(IncomeBill iBill);

	void view(OutcomeBill oBill);
}
