package com.jing.dp.demo.eventdriven.event.model;

import com.jing.dp.demo.eventdriven.event.ClickEvent;
import com.jing.dp.demo.eventdriven.event.DbClickEvent;
import com.jing.dp.demo.eventdriven.event.MouseMoveEvent;
import com.jing.dp.demo.eventdriven.event.listener.ClickListener;
import com.jing.dp.demo.eventdriven.event.listener.DbClickListener;
import com.jing.dp.demo.eventdriven.event.listener.MouseMoveListener;

/**
 * 事件源
 * @author hspcadmin
 *
 *在事件源里匹配事件监听
 */
public class Button {
	private String name ;
	private String id ;
	private int x ;
	private int y ;
	private ClickListener clickListener ;
	private DbClickListener dbClickListener ;
	private MouseMoveListener mouseMoveListener ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public ClickListener getClickListener() {
		return clickListener;
	}
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public DbClickListener getDbClickListener() {
		return dbClickListener;
	}
	public void setDbClickListener(DbClickListener dbClickListener) {
		this.dbClickListener = dbClickListener;
	}
	public MouseMoveListener getMouseMoveListener() {
		return mouseMoveListener;
	}
	public void setMouseMoveListener(MouseMoveListener mouseMoveListener) {
		this.mouseMoveListener = mouseMoveListener;
	}
	
	public void click(){
		clickListener.dbClick(new ClickEvent(this));
	}
	
	public void dbClick(){
		dbClickListener.dbClick(new DbClickEvent(this));
	}
	
	public void mouseMoveClick(){
		mouseMoveListener.mouseMove(new MouseMoveEvent(this));
	}
}
