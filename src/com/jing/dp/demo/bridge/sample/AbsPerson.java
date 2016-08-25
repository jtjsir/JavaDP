package com.jing.dp.demo.bridge.sample;
/**
@author jingsir

**
*/
public abstract class AbsPerson {

	private IMusic music ;
	
	private IAppearance appearance ;
	
	private ISocietyExprience exprience ;

	public IMusic getMusic() {
		return music;
	}

	public void setMusic(IMusic music) {
		this.music = music;
	}

	public IAppearance getAppearance() {
		return appearance;
	}

	public void setAppearance(IAppearance appearance) {
		this.appearance = appearance;
	}

	public ISocietyExprience getExprience() {
		return exprience;
	}

	public void setExprience(ISocietyExprience exprience) {
		this.exprience = exprience;
	}
	
	//���ิд
	public abstract void doCommonThings() ;
	
	//����ʵ����Ľӿ�
	public void show(){
		appearance.show();
	}
	
	public void skill(){
		music.skill();
	}
	
	public void exprience(){
		exprience.experience();
	}
}
