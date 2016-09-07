package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir
 **
 *	����Ԫ�ؼ���Ӣ�۵��ڲ�״̬���ⲿ״̬ ,������Ѫ���ǲ�ͬ״̬���������ڹ���״̬
 */
public class Role {

	//Ӣ��Ѫ��
	private int hp ;
	
	//Ӣ��ħ��
	private int mp ;
	
	public AbstractHero hero ;
	
	public Role(AbstractHero hero){
		this.hero = hero ;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void release(int index){
		hero.release(index);
	}
	
	public void attack(){
		hero.attack();
	}
}
