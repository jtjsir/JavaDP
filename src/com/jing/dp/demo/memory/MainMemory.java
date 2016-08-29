package com.jing.dp.demo.memory;


/**
 * @author jingsir
 **
 * 备忘录模式的应用	外部管理某个对象的状态，并可以实时改变这个状态
 */
public class MainMemory {

	public static void main(String[] args){
		MemoryMaster master = new MemoryMaster() ;
//		
		Person xiaofang = new Person() ;
		xiaofang.setName("xiaofang");
		xiaofang.addMemory("xiaofang学会了一道做带鱼的菜");
		xiaofang.addMemory("xiaofang学会了一道做香菇青菜的菜");
		xiaofang.addMemory("xiaofang学会了一道做螃蟹的菜");
		master.pullPersonMemory(xiaofang);
		System.out.println(xiaofang.toString());
		
		System.out.println("---------------------------------------------------------------------------");
		Person xiaoli = new Person() ;
		xiaoli.setName("xiaoli");
		xiaoli.addMemory("有一天，xiaoli认识了一个大胸妹子，妹子人很nice啊");
		xiaoli.addMemory("有一天，xiaoli约大胸妹子去唱歌，妹子唱歌唱的不错呀");
		xiaoli.addMemory("有一天，xiaoli约大胸妹子去吃烧烤，烧烤吃的妹子直掉汗，衬衣都湿了");
		master.pullPersonMemory(xiaoli);
		System.out.println("---------------------拉取的记忆为------------------------");
		System.out.println(xiaoli.getMemory());
		xiaoli.addMemory("大胸妹子生日的时候，xiaoli忘带礼物了，妹子很不开心");
		System.out.println(xiaoli.toString());
		System.out.println("----------------强制恢复xiaoli的一个记忆---------");
		master.forcePersonMemory(xiaoli);
		System.out.println(xiaoli.toString());
		
	}
}
