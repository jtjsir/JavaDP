package com.jing.dp.demo.flyweight;

import com.jing.dp.demo.flyweight.sample.HeroManager;
import com.jing.dp.demo.flyweight.sample.Role;

/**
 * @author jingsir ��Ԫģʽ����װ����״̬��Ϊ����״̬�����벻ͬ״̬��Ϊ�ⲿ״̬ ��ֹ�ظ������ӣ��ķ��ڴ�
 *         �����������solo�֣���ȡ��Ӣ�۶�������ͬһ���������󣬷�ֹ�ظ�����Ӣ�ۺķѾ޴���ڴ�
 */
public class MainFlyWeight {

	public static void main(String[] args) {
		System.out.println("--------------��һ��solo---------------");
		Role role1 = new Role(HeroManager.getInstance().getHero("����"));
		Role role2 = new Role(HeroManager.getInstance().getHero("����"));

		/* ���ֲ��� */

		System.out.println("--------------�ڶ���solo---------------");
		Role role3 = new Role(HeroManager.getInstance().getHero("����"));
		Role role4 = new Role(HeroManager.getInstance().getHero("����"));

		/* ���ֲ��� */

		System.out.println("--------------������solo---------------");
		Role role5 = new Role(HeroManager.getInstance().getHero("����"));
		Role role6 = new Role(HeroManager.getInstance().getHero("����"));

		/* ���ֲ��� */

		System.out.println("--------------���ľ�solo---------------");
		Role role7 = new Role(HeroManager.getInstance().getHero("����"));
		Role role8 = new Role(HeroManager.getInstance().getHero("����"));

		/* ���ֲ��� */

		System.out.println("--------------�����solo---------------");
		Role role9 = new Role(HeroManager.getInstance().getHero("����"));
		Role role10 = new Role(HeroManager.getInstance().getHero("����"));

		/* ���ֲ��� */
	}
}
