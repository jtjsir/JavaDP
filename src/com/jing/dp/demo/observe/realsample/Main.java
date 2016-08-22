package com.jing.dp.demo.observe.realsample;

/**
 * Ӧ��JDK��observer���Ƶ�����
 * @author hspcadmin
 *
 */
public class Main {

	public static void main(String[] args){
		//�������
		BlogWriter jingSir = new BlogWriter("JingSir","���ҽ���") ;
		
		//����
		BlogReader reader1 = new BlogReader("����") ;
		BlogReader reader2 = new BlogReader("����") ;
		BlogReader reader3 = new BlogReader("����") ;
		BlogReader reader4 = new BlogReader("֣��") ;
		
		//��������
		reader1.subscribe("JingSir");
		reader2.subscribe("JingSir");
		reader3.subscribe("JingSir");
		reader4.subscribe("JingSir");
		
		//���߸�������
		jingSir.addNovel("���ģʽ");
		
		reader1.unsubscribe("JingSir");
		
		jingSir.addNovel("Java�߲������");
		
	}
}
