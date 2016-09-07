package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir
 **亚索
 * 
 */
public class Yasuo extends AbstractHero {

	@Override
	protected String getName() {
		return "亚索";
	}

	@Override
	protected void initSkills() {
		skills[0] = "斩钢闪" ;
		skills[1] = "风之障壁" ;
		skills[2] = "踏前斩" ;
		skills[3] = "狂风绝息斩" ;
	}

}
