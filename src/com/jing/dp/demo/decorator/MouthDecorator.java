package com.jing.dp.demo.decorator;

/**
 * ���װ����
 * @author hspcadmin
 *
 */
public class MouthDecorator extends AbsDecorator {

	public MouthDecorator(IDecorator decorator) {
		super(decorator);
	}

	@Override
	public void draw() {
		System.out.println("��Ҫ��һ�����");
		super.draw();
		System.out.println("��ͻ�����");
	}

	
}
