package com.jing.test.demo.classloader;

import java.io.InputStream;

public class MyClassLoader extends ClassLoader {

	@Override
	public Class<?> loadClass(String s) throws ClassNotFoundException {
		String filename = s.substring(s.lastIndexOf(".") + 1) + ".class";
		System.out.println("加载的类为: " + filename);
		InputStream classStream = getClass().getResourceAsStream(filename);
		if (classStream == null) {
			System.out.println("从父类加载");
			return super.loadClass(s);
		}
		try {
			byte[] b = new byte[classStream.available()];
			classStream.read(b) ;
			return defineClass(s, b, 0, b.length);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null ;
	}

}
