package com.jing.dp.demo.simpleton;

/**
 * 使用内部类实现
 * 
 * @author hspcadmin
 *
 */
public class BestSimpleton {
	
	private BestSimpleton() {
		System.out.println("我在被初始化");
	}

	public static BestSimpleton getInstance() {
		return SingletonCreator.bestSimpleton;
	}

	private static class SingletonCreator {
		// 内部类只有被主动调用的时候才加载静态变量
		private static BestSimpleton bestSimpleton = new BestSimpleton();
	}

	public static void main(String[] args) {
//		 BestSimpleton.getInstance() ;
	}
}
