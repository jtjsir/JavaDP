package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.DbClickEvent;

public interface DbClickListener extends EventListener {

	void dbClick(DbClickEvent dbClickEvent) ;
}
