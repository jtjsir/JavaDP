package com.jing.dp.demo.simpleton;

/**
 * 缩小synchronized锁范围,跟JVM的执行顺序有关
 * 
 * 
 * 潜在危险：如果JVM创建对象步骤为:分配内存、初始化构造器、指向地址 没有问题
 * 
 * 如果是 分配内存、指向地址、初始化构造器可能对象在未初始化时候就进行了使用，便会出错（概率很小）
 * 
 * @author hspcadmin
 *
 */
public class GreateSynSimpleton {

	private static GreateSynSimpleton greateSynSimpleton;

	private GreateSynSimpleton() {

	}

	public static GreateSynSimpleton getInstance() {
		if (greateSynSimpleton == null) {
			synchronized (GreateSynSimpleton.class) {
				// 再次判断，防止多线程创建多个示例
				if (greateSynSimpleton == null) {
					greateSynSimpleton = new GreateSynSimpleton();
				}
			}
		}

		return greateSynSimpleton;
	}
}
