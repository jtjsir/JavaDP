package com.jing.dp.demo.memory;


/**
 * @author jingsir
 **
 * ����¼ģʽ��Ӧ��	�ⲿ����ĳ�������״̬��������ʵʱ�ı����״̬
 */
public class MainMemory {

	public static void main(String[] args){
		MemoryMaster master = new MemoryMaster() ;
//		
		Person xiaofang = new Person() ;
		xiaofang.setName("xiaofang");
		xiaofang.addMemory("xiaofangѧ����һ��������Ĳ�");
		xiaofang.addMemory("xiaofangѧ����һ�����㹽��˵Ĳ�");
		xiaofang.addMemory("xiaofangѧ����һ�����з�Ĳ�");
		master.pullPersonMemory(xiaofang);
		System.out.println(xiaofang.toString());
		
		System.out.println("---------------------------------------------------------------------------");
		Person xiaoli = new Person() ;
		xiaoli.setName("xiaoli");
		xiaoli.addMemory("��һ�죬xiaoli��ʶ��һ���������ӣ������˺�nice��");
		xiaoli.addMemory("��һ�죬xiaoliԼ��������ȥ���裬���ӳ��質�Ĳ���ѽ");
		xiaoli.addMemory("��һ�죬xiaoliԼ��������ȥ���տ����տ��Ե�����ֱ���������¶�ʪ��");
		master.pullPersonMemory(xiaoli);
		System.out.println("---------------------��ȡ�ļ���Ϊ------------------------");
		System.out.println(xiaoli.getMemory());
		xiaoli.addMemory("�����������յ�ʱ��xiaoli���������ˣ����Ӻܲ�����");
		System.out.println(xiaoli.toString());
		System.out.println("----------------ǿ�ƻָ�xiaoli��һ������---------");
		master.forcePersonMemory(xiaoli);
		System.out.println(xiaoli.toString());
		
	}
}
