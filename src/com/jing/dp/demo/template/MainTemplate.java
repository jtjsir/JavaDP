package com.jing.dp.demo.template;

import com.jing.dp.demo.template.sample.AbsPageBuilder;
import com.jing.dp.demo.template.sample.DefaultPageBuilder;

/**
 * ģ��ģʽ��Ӧ��
 * 
 * @author hspcadmin
 *
 *         �ڸ����ж����һϵ�е��㷨������߹���ĳ������Ĳ������˳�򣬾����ʵ����ȥ�������ɣ������ó��󷽷�
 */
public class MainTemplate {

	public static void main(String[] args) {
		AbsPageBuilder pageBuilder = new DefaultPageBuilder();
		System.out.println("Ĭ�ϵ�htmlҳ��Ϊ: " + pageBuilder.buildHtml());
	}
}
