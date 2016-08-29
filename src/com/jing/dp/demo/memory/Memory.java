package com.jing.dp.demo.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingsir º«“‰¿‡
 **
 */
public class Memory {

	private List<String> storyList = new ArrayList<>();

	public List<String> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<String> storyList) {
		this.storyList = storyList;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder() ;
		for(String story : storyList){
			builder.append(story + "\n") ;
		}
		
		return builder.toString() ;
	}
}
