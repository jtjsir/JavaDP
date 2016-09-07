package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir
 **
 *	共享元素集合英雄的内部状态和外部状态 ,本例中血量是不同状态，技能属于共享状态
 */
public class Role {

	//英雄血量
	private int hp ;
	
	//英雄魔量
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
