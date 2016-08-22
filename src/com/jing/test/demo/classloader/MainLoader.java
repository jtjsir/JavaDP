package com.jing.test.demo.classloader;

/**
 * 不同的加载器加载同一个类文件得到的实例类型不是一样的
 * @author hspcadmin
 *
 *默认的是通过系统的加载器加载的
 */
public class MainLoader {

	public static void main(String[] args) {
		MyClassLoader classLoader = new MyClassLoader() ;
		
		try {
			Class<?> class1 = classLoader.loadClass("com.jing.test.demo.classloader.MainLoader") ;
			if(null!=class1){
				System.out.println("使用自定义加载器的结果： ");
				System.out.println((class1.newInstance()) instanceof MainLoader);
			}
			System.out.println("使用系统自带的加载器的结果： ");
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
