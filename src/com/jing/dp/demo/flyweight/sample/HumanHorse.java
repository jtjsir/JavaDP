package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir ����
 **
 */
public class HumanHorse extends AbstractHero {

	@Override
	protected String getName() {
		return "����";
	}

	@Override
	protected void initSkills() {
		skills[0] = "����" ;
		skills[1] = "�־�֮��" ;
		skills[2] = "������" ;
		skills[3] = "��Ӱ���" ;
	}

}
