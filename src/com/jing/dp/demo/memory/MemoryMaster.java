package com.jing.dp.demo.memory;

import java.util.HashMap;
import java.util.Map;

/**
@author jingsir

����������
**
*/
public class MemoryMaster {

	private Map<Person,Memory> memoryMap = new HashMap<>() ;
	
	//��ȡ�û��ļ���
	public void pullPersonMemory(Person person){
		memoryMap.put(person, person.getMemory()) ;
	}
	
	//�ָ��û��ļ���
	public void forcePersonMemory(Person person){
		if(memoryMap.containsKey(person)){
			person.setMemory(memoryMap.get(person));
		}
	}
}
