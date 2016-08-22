package com.jing.dp.demo.decorator;

/**
 * 装饰器模式的应用
 * @author hspcadmin
 *
 */
public class MainDecorator {

	public static void main(String[] args) {
		//初始化待装饰对象
		IDecorator faceDecorator = new FaceDecorator() ;
		
		//装饰器装配
		IDecorator manDecorator = new TeethDecorator(new MouthDecorator(faceDecorator)) ;
		
		//调用
		manDecorator.draw();
	}

}
