package com.jing.dp.demo.simpleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����ģʽ
 * @author hspcadmin
 *
 *����Ϊ���̵߳ĵ���ģʽ��ִ�д���
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
		//��������ʵ��װ��ü�����
		final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>(10)) ;
		
		ExecutorService threadService = Executors.newCachedThreadPool() ;
		
		final SimpleMain simpleMain = new SimpleMain() ;
		simpleMain.setLock(true);
		for(int i = 0; i < 100; i++){
			threadService.execute(new Runnable() {
				
				@Override
				public void run() {
					while(true){
						//ǿ�ƴ����ڴ�ˢ�¸����ڴ棬�����˱������Ż�
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
		//���߳������������߳��������ٴ�lock��������5���������߳�ִ��
		System.out.println("��ʼ�����߳�");
		Thread.sleep(5000);
		System.out.println("��ʼ��ȡʵ��");
		simpleMain.setLock(false);
		Thread.sleep(5000);
		System.out.println("��ʼ�������");
		//�����������ʵ˵��
		for(String instace : instanceSet){
			System.out.println(instace);
		}
		
		threadService.shutdownNow() ;
	}
}
