package com.jing.dp.demo.decorator;

/**
 * 嘴巴装饰器
 * @author hspcadmin
 *
 */
public class MouthDecorator extends AbsDecorator {

	public MouthDecorator(IDecorator decorator) {
		super(decorator);
	}

	@Override
	public void draw() {
		System.out.println("我要画一张嘴巴");
		super.draw();
		System.out.println("嘴巴画完了");
	}

	
}
