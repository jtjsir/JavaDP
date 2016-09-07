package com.jing.dp.demo.flyweight.sample;

/**
 * @author jingsir
 **
 *抽象英雄类，有相同的技能属性和不同的血量 
 */
public abstract class AbstractHero {

	protected final String name ;
	
	protected final String[] skills = new String[4];
	
	public AbstractHero(){
		super() ;
		this.name = getName() ;
		initSkills();
		checkSkills();
	}
	
	protected abstract String getName() ;
	
	protected abstract void initSkills() ;
	
	private void checkSkills(){
		for(int i = 0; i < skills.length ; i++){
			if(null==skills[i]){
				throw new NullPointerException() ;
			}
		}
	}
	
	public void release(int index){
		if(index<0){
			index = 0 ;
		}else if(index > 3){
			index = 3 ;
		}
		
		System.out.println(getName() + " 释放了名为: " + skills[index] + " 的技能");
	}
	
	public void attack(){
		System.out.println(getName() + " 进行了平A");
	}
}
