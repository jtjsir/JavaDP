package com.jing.dp.demo.eventdriven.event.listener;

import java.util.EventListener;

import com.jing.dp.demo.eventdriven.event.MouseMoveEvent;

public interface MouseMoveListener extends EventListener {

	void mouseMove(MouseMoveEvent mouseMoveEvent) ;
}
