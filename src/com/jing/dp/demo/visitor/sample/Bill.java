package com.jing.dp.demo.visitor.sample;

/**
 * @author jingsir
 **
 *         被访问的元素接口
 */
public interface Bill {

	void accept(Viewer viewer) ;
}
