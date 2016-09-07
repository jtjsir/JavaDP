package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir 人马
 **
 */
public class HumanHorse extends AbstractHero {

	@Override
	protected String getName() {
		return "人马";
	}

	@Override
	protected void initSkills() {
		skills[0] = "暴走" ;
		skills[1] = "恐惧之灵" ;
		skills[2] = "毁灭冲锋" ;
		skills[3] = "暗影冲锋" ;
	}

}
