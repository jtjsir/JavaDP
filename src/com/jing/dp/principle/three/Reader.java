package com.jing.dp.principle.three;

/**
 * 依赖倒置原则：即具体的实现都依赖于抽象
 * 
 * @author hspcadmin
 * 
 *         以下接口抽象出来，不同的读法实现同一个抽象的接口方法
 */
public interface Reader {

	void read();

	public int getA();

	public int getB();
}
