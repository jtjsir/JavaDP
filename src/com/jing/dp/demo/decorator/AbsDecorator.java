package com.jing.dp.demo.decorator;

/**
 * 装饰器抽象接口
 * @author hspcadmin
 *
 */
public abstract class AbsDecorator implements IDecorator {
	
	private IDecorator decorator ;
	
	public AbsDecorator(IDecorator decorator){
		this.decorator = decorator ;
	}

	@Override
	public void draw() {
		this.decorator.draw();
	}

}
