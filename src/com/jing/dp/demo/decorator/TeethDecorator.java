/**
 * 
 */
package com.jing.dp.demo.decorator;

/**
 * 牙齿装饰器
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
		System.out.println("我要画一口牙齿");
		super.draw();
		System.out.println("牙齿画完了");
	}

	
}
