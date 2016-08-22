package com.jing.dp.demo.template;

import com.jing.dp.demo.template.sample.AbsPageBuilder;
import com.jing.dp.demo.template.sample.DefaultPageBuilder;

/**
 * 模板模式的应用
 * 
 * @author hspcadmin
 *
 *         在父类中定义好一系列的算法步骤或者构建某个对象的步骤或者顺序，具体的实类再去操作即可，大多采用抽象方法
 */
public class MainTemplate {

	public static void main(String[] args) {
		AbsPageBuilder pageBuilder = new DefaultPageBuilder();
		System.out.println("默认的html页面为: " + pageBuilder.buildHtml());
	}
}
