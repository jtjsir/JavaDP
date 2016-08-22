package com.jing.dp.principle.two;

/**
 * 实现最小接口原则/接口隔离原则：抽象出实体接口的必须部分，抽离不必须的部分
 * 
 * @author hspcadmin
 *
 */
public interface Mobile {

	void makeCall() ;
	
	void sendMsg() ;
}
