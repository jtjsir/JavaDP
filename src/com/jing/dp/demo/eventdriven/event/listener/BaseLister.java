package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.BaseEvent;

public interface BaseLister extends EventListener {
	//ע�����¼�
	void click(BaseEvent baseEvent) ;
}
