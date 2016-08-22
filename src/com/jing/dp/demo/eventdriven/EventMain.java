package com.jing.dp.demo.eventdriven;

import com.jing.dp.demo.eventdriven.event.ClickEvent;
import com.jing.dp.demo.eventdriven.event.DbClickEvent;
import com.jing.dp.demo.eventdriven.event.MouseMoveEvent;
import com.jing.dp.demo.eventdriven.event.listener.ClickListener;
import com.jing.dp.demo.eventdriven.event.listener.DbClickListener;
import com.jing.dp.demo.eventdriven.event.listener.MouseMoveListener;
import com.jing.dp.demo.eventdriven.event.model.Button;

/**
 * �¼���������
 * 
 * @author hspcadmin �¼�Դ���¼������������ʺ϶�Զ��״̬�ı�֪ͨ
 */
public class EventMain {

	public static void main(String[] args) {
		Button button = new Button();
		button.setName("testButton");
		button.setId("myButton");

		// ע���¼�����
		button.setClickListener(new ClickListener() {

			@Override
			public void dbClick(ClickEvent clickEvent) {
				System.out.println("--------�����¼�����---------");
				System.out.println("if('���Ϸ�'){");
				System.out.println("\t���ύ");
				System.out.println("}else{");
				System.out.println("\treturn false");
				System.out.println("}");
			}
		});

		button.setDbClickListener(new DbClickListener() {

			@Override
			public void dbClick(DbClickEvent dbClickEvent) {
				System.out.println("--------˫���¼�����---------");
				System.out.println("alert('������˫��" + dbClickEvent.getButton().getName() + "��ť)'");
			}
		});

		button.setMouseMoveListener(new MouseMoveListener() {

			@Override
			public void mouseMove(MouseMoveEvent mouseMoveEvent) {
				System.out.println(
						"Ŀǰ����λ����: x-" + mouseMoveEvent.getButton().getX() + " y-" + mouseMoveEvent.getButton().getY());
			}
		});

		// �¼���Ӧ
		button.click();
		button.dbClick();
		button.setX(100);
		button.setY(100);
		button.mouseMoveClick();
	}
}
