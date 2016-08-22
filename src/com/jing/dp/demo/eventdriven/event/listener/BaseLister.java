package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.BaseEvent;

public interface BaseLister extends EventListener {
	//×¢²áµã»÷ÊÂ¼ş
	void click(BaseEvent baseEvent) ;
}
