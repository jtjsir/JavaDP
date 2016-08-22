package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.ClickEvent;

/**
 * 监听接口与事件一一对应,绑定事件
 * @author hspcadmin
 *
 */
public interface ClickListener extends EventListener {

	void dbClick(ClickEvent clickEvent) ;
}
