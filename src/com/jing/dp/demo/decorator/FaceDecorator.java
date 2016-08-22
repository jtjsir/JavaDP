package com.jing.dp.demo.decorator;

/**
 * 待装饰的对象
 * @author hspcadmin
 *
 */
public class FaceDecorator implements IDecorator {

	@Override
	public void draw() {
		System.out.println("我先画一张脸");
	}

}
