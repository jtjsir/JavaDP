package com.jing.dp.demo.memory;

import java.util.HashMap;
import java.util.Map;

/**
@author jingsir

管理记忆的类
**
*/
public class MemoryMaster {

	private Map<Person,Memory> memoryMap = new HashMap<>() ;
	
	//拉取用户的记忆
	public void pullPersonMemory(Person person){
		memoryMap.put(person, person.getMemory()) ;
	}
	
	//恢复用户的记忆
	public void forcePersonMemory(Person person){
		if(memoryMap.containsKey(person)){
			person.setMemory(memoryMap.get(person));
		}
	}
}
