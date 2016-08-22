package com.jing.dp.demo.observe.realsample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 订阅管理类
 * 
 * @author hspcadmin
 *
 */
public class SubscribeManager {

	//作者集合
	private static Map<String,BlogWriter> writerMap = Collections.synchronizedMap(new HashMap<String,BlogWriter>(20)) ;
	
	public static SubscribeManager getInstance() {
		return Singleton.manager;
	}

	private static class Singleton {
		private static SubscribeManager manager = new SubscribeManager();
	}
	
	public static void addBlogReader(String writername,BlogReader reader){
		writerMap.get(writername).addObserver(reader);
	}
	
	public static void removeBlogReader(String writername,BlogReader reader){
		writerMap.get(writername).deleteObserver(reader);
	}
	
	public static void putWriter(String name,BlogWriter writer){
		writerMap.put(name, writer) ;
	}
}
