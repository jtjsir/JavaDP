/**
 * 
 */
package com.jing.dp.demo.decorator;

/**
 * ����װ����
 * @author hspcadmin
 *
 */
public class TeethDecorator extends AbsDecorator {

	/**
	 * @param decorator
	 */
	public TeethDecorator(IDecorator decorator) {
		super(decorator);
	}

	@Override
	public void draw() {
		System.out.println("��Ҫ��һ������");
		super.draw();
		System.out.println("���ݻ�����");
	}

	
}
