package com.jing.dp.demo.decorator;

/**
 * ��װ�εĶ���
 * @author hspcadmin
 *
 */
public abstract class FaceAbsDecorator implements IDecorator {

	@Override
	public void draw() {
		System.out.println("I draw a face");
	}

}
