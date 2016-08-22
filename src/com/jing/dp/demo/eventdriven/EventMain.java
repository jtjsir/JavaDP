package com.jing.dp.demo.eventdriven;

import com.jing.dp.demo.eventdriven.event.ClickEvent;
import com.jing.dp.demo.eventdriven.event.DbClickEvent;
import com.jing.dp.demo.eventdriven.event.MouseMoveEvent;
import com.jing.dp.demo.eventdriven.event.listener.ClickListener;
import com.jing.dp.demo.eventdriven.event.listener.DbClickListener;
import com.jing.dp.demo.eventdriven.event.listener.MouseMoveListener;
import com.jing.dp.demo.eventdriven.event.model.Button;

/**
 * 事件驱动例子
 * 
 * @author hspcadmin 事件源、事件、监听器，适合多对多的状态改变通知
 */
public class EventMain {

	public static void main(String[] args) {
		Button button = new Button();
		button.setName("testButton");
		button.setId("myButton");

		// 注册事件监听
		button.setClickListener(new ClickListener() {

			@Override
			public void dbClick(ClickEvent clickEvent) {
				System.out.println("--------单击事件代码---------");
				System.out.println("if('表单合法'){");
				System.out.println("\t表单提交");
				System.out.println("}else{");
				System.out.println("\treturn false");
				System.out.println("}");
			}
		});

		button.setDbClickListener(new DbClickListener() {

			@Override
			public void dbClick(DbClickEvent dbClickEvent) {
				System.out.println("--------双击事件代码---------");
				System.out.println("alert('您不能双击" + dbClickEvent.getButton().getName() + "按钮)'");
			}
		});

		button.setMouseMoveListener(new MouseMoveListener() {

			@Override
			public void mouseMove(MouseMoveEvent mouseMoveEvent) {
				System.out.println(
						"目前鼠标的位置是: x-" + mouseMoveEvent.getButton().getX() + " y-" + mouseMoveEvent.getButton().getY());
			}
		});

		// 事件响应
		button.click();
		button.dbClick();
		button.setX(100);
		button.setY(100);
		button.mouseMoveClick();
	}
}
