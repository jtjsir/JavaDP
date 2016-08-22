package com.jing.test.demo.classloader;

/**
 * ��ͬ�ļ���������ͬһ�����ļ��õ���ʵ�����Ͳ���һ����
 * @author hspcadmin
 *
 *Ĭ�ϵ���ͨ��ϵͳ�ļ��������ص�
 */
public class MainLoader {

	public static void main(String[] args) {
		MyClassLoader classLoader = new MyClassLoader() ;
		
		try {
			Class<?> class1 = classLoader.loadClass("com.jing.test.demo.classloader.MainLoader") ;
			if(null!=class1){
				System.out.println("ʹ���Զ���������Ľ���� ");
				System.out.println((class1.newInstance()) instanceof MainLoader);
			}
			System.out.println("ʹ��ϵͳ�Դ��ļ������Ľ���� ");
			Class<?> class2 = ClassLoader.getSystemClassLoader().loadClass("com.jing.test.demo.classloader.MainLoader") ;
			System.out.println((class2.newInstance()) instanceof MainLoader);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
