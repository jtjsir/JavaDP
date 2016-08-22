package com.jing.dp.demo.decorator;

/**
 * 待装饰的对象
 * @author hspcadmin
 *
 */
public abstract class FaceAbsDecorator implements IDecorator {

	@Override
	public void draw() {
		System.out.println("I draw a face");
	}

}
