package com.jing.dp.demo.simpleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 * @author hspcadmin
 *
 *以下为单线程的单例模式的执行代码
 */
public class SimpleMain {

	private  boolean lock ;
	
	
	public boolean isLock() {
		return lock;
	}



	public void setLock(boolean lock) {
		this.lock = lock;
	}



	public static void main(String[] args) throws InterruptedException{
		//将产生的实例装入该集合中
		final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>(10)) ;
		
		ExecutorService threadService = Executors.newCachedThreadPool() ;
		
		final SimpleMain simpleMain = new SimpleMain() ;
		simpleMain.setLock(true);
		for(int i = 0; i < 100; i++){
			threadService.execute(new Runnable() {
				
				@Override
				public void run() {
					while(true){
						//强制从主内存刷新副本内存，进行了编译器优化
						synchronized(System.out){
							
						}
						if(!simpleMain.isLock()){
							Simpleton simpleton = Simpleton.getInstance() ;
							instanceSet.add(simpleton.toString()) ;
							
							break ;
						}
					}
				}
			});
		}
		//主线程休眠让所有线程启动后再打开lock，再休眠5秒让所有线程执行
		System.out.println("开始启动线程");
		Thread.sleep(5000);
		System.out.println("开始获取实例");
		simpleMain.setLock(false);
		Thread.sleep(5000);
		System.out.println("开始遍历结果");
		//遍历结果让事实说话
		for(String instace : instanceSet){
			System.out.println(instace);
		}
		
		threadService.shutdownNow() ;
	}
}
