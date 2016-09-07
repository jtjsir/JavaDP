package com.jing.dp.demo.flyweight;

import com.jing.dp.demo.flyweight.sample.HeroManager;
import com.jing.dp.demo.flyweight.sample.Role;

/**
 * @author jingsir 享元模式：封装相似状态作为共享状态，剥离不同状态作为外部状态 防止重复造轮子，耗费内存
 *         本例中有五局solo局，拿取的英雄都来自于同一个单例对象，防止重复的造英雄耗费巨大的内存
 */
public class MainFlyWeight {

	public static void main(String[] args) {
		System.out.println("--------------第一局solo---------------");
		Role role1 = new Role(HeroManager.getInstance().getHero("人马"));
		Role role2 = new Role(HeroManager.getInstance().getHero("亚索"));

		/* 各种操作 */

		System.out.println("--------------第二局solo---------------");
		Role role3 = new Role(HeroManager.getInstance().getHero("人马"));
		Role role4 = new Role(HeroManager.getInstance().getHero("亚索"));

		/* 各种操作 */

		System.out.println("--------------第三局solo---------------");
		Role role5 = new Role(HeroManager.getInstance().getHero("人马"));
		Role role6 = new Role(HeroManager.getInstance().getHero("亚索"));

		/* 各种操作 */

		System.out.println("--------------第四局solo---------------");
		Role role7 = new Role(HeroManager.getInstance().getHero("人马"));
		Role role8 = new Role(HeroManager.getInstance().getHero("亚索"));

		/* 各种操作 */

		System.out.println("--------------第五局solo---------------");
		Role role9 = new Role(HeroManager.getInstance().getHero("人马"));
		Role role10 = new Role(HeroManager.getInstance().getHero("亚索"));

		/* 各种操作 */
	}
}
