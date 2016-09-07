package com.jing.dp.demo.flyweight.sample;

import java.util.HashMap;

/**
 * @author jingsir
 **
 *         �����࣬����hero�ĵ���
 */
public class HeroManager {

	private static HashMap<String, AbstractHero> heros = null;

	private HeroManager() {
		if (heros == null) {
			heros = new HashMap<>();
		}
	}

	public static HeroManager getInstance() {

		return Singleton.manager;
	}

	private static class Singleton {
		private static HeroManager manager = new HeroManager();
	}

	public static void addHero(AbstractHero hero) {
		heros.put(hero.getName(), hero);
	}

	public static AbstractHero getHero(String name) {
		AbstractHero hero = null;
		if (!heros.containsKey(name)) {
			if (name.equals("����")) {
				hero = new HumanHorse();
			} else if (name.equals("����")) {
				hero = new Yasuo();
			}

			heros.put(name, hero);
		} else {
			hero = heros.get(name);
		}

		return hero;
	}
}
