package com.jing.dp.demo.combine.sample;

import java.util.ArrayList;
import java.util.List;

/**
@author jingsir

**
*/
public class Folder implements IFile {
	
	private String name ;
	private IFile folder ;
	private List<IFile> files ;

	public Folder(String name) {
		this(name, null) ;
	}
	
	public Folder(String name,IFile folder){
		this.name = name ;
		this.folder = folder ;
		files = new ArrayList<>() ;
	}
	
	@Override
	public String getName() {
		return name ;
	}

	@Override
	public void delete() {
		List<IFile> copy = new ArrayList<>(files) ;
		for(IFile file : copy){
			file.delete();
		}
		//É¾³ý±¾ÎÄ¼þ¼Ð
	}

	@Override
	public void createFile(String name) {
		
	}

	@Override
	public void removeFile(String name) {

	}

	@Override
	public IFile getFile(String name) {
		return null;
	}

}
