package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.ClickEvent;

/**
 * �����ӿ����¼�һһ��Ӧ,���¼�
 * @author hspcadmin
 *
 */
public interface ClickListener extends EventListener {

	void dbClick(ClickEvent clickEvent) ;
}
