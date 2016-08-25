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
 *         桥接模式应用：使某些类型能适应多维度的变化，即将抽象与实现部分分离，在抽象部分中拥有实现的接口引用
 **
 */
public class MainBridge {

	public static void main(String[] args){
		AbsPerson normalPerson = new NormalPerson() ;
		
		normalPerson.setAppearance(new NormalAppearance());
		normalPerson.setExprience(new NormalSocietyExprience());
		normalPerson.setMusic(new NormalMusic());
		
		//调用实现类的方法
		normalPerson.doCommonThings();
		normalPerson.show();
		normalPerson.exprience();
		normalPerson.skill();
		System.out.println("------------切换下音乐维度技能--------------");
		//切换维度
		normalPerson.setMusic(new GuitarMusic());
		normalPerson.skill();
		
		System.out.println("----------------我整容了一下-----------------------");
		normalPerson.setAppearance(new HandsomeAppearance());
		normalPerson.show();
	}
}
