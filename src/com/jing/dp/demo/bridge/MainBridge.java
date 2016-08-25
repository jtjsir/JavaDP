package com.jing.dp.demo.bridge;

import com.jing.dp.demo.bridge.sample.AbsPerson;
import com.jing.dp.demo.bridge.sample.NormalPerson;
import com.jing.dp.demo.bridge.sample.impl.GuitarMusic;
import com.jing.dp.demo.bridge.sample.impl.HandsomeAppearance;
import com.jing.dp.demo.bridge.sample.impl.NormalAppearance;
import com.jing.dp.demo.bridge.sample.impl.NormalMusic;
import com.jing.dp.demo.bridge.sample.impl.NormalSocietyExprience;

/**
 * @author jingsir
 * 
 *         �Ž�ģʽӦ�ã�ʹĳЩ��������Ӧ��ά�ȵı仯������������ʵ�ֲ��ַ��룬�ڳ��󲿷���ӵ��ʵ�ֵĽӿ�����
 **
 */
public class MainBridge {

	public static void main(String[] args){
		AbsPerson normalPerson = new NormalPerson() ;
		
		normalPerson.setAppearance(new NormalAppearance());
		normalPerson.setExprience(new NormalSocietyExprience());
		normalPerson.setMusic(new NormalMusic());
		
		//����ʵ����ķ���
		normalPerson.doCommonThings();
		normalPerson.show();
		normalPerson.exprience();
		normalPerson.skill();
		System.out.println("------------�л�������ά�ȼ���--------------");
		//�л�ά��
		normalPerson.setMusic(new GuitarMusic());
		normalPerson.skill();
		
		System.out.println("----------------��������һ��-----------------------");
		normalPerson.setAppearance(new HandsomeAppearance());
		normalPerson.show();
	}
}
