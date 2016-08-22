package com.jing.dp.demo.eventdriven.event;

import java.util.EventObject;

import com.jing.dp.demo.eventdriven.event.model.Button;

/**
 * �¼�����,���¼�Դ
 * @author hspcadmin
 *
 */
public class BaseEvent extends EventObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BaseEvent(Object source){
		super(source) ;
	}

	public Button getButton(){
		return (Button)super.getSource() ;
	}
	
}
