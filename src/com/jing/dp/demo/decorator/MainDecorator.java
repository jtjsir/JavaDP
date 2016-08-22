package com.jing.dp.demo.decorator;

/**
 * װ����ģʽ��Ӧ��
 * @author hspcadmin
 *
 */
public class MainDecorator {

	public static void main(String[] args) {
		//��ʼ����װ�ζ���
		IDecorator faceDecorator = new FaceDecorator() ;
		
		//װ����װ��
		IDecorator manDecorator = new TeethDecorator(new MouthDecorator(faceDecorator)) ;
		
		//����
		manDecorator.draw();
	}

}
