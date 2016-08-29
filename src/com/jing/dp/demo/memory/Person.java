package com.jing.dp.demo.memory;

import java.util.ArrayList;
import java.util.List;
/**
@author jingsir

**
*/
public class Person {

	private String name ;
	private List<String> storyList = new ArrayList<>() ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getStoryList() {
		return storyList;
	}
	public void setStoryList(List<String> storyList) {
		this.storyList = storyList;
	}
	
	public void addMemory(String story){
		storyList.add(story) ;
	}
	//获取状态
	public Memory getMemory(){
		Memory memory = new Memory() ;
		memory.setStoryList(new ArrayList<>(storyList));
		
		return memory ;
	}
	
	
	public void setMemory(Memory memory){
		this.storyList = memory.getStoryList() ;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder(this.name + "的记忆为: ") ;
		for(String story : storyList){
			builder.append(story + "\n") ;
		}
		
		return builder.toString() ;
	}
}
