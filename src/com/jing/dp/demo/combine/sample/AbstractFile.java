package com.jing.dp.demo.combine.sample;

/**
 * @author jingsir
 **
 * 提供默认实现
 */
public abstract class AbstractFile implements IFile{

	@Override
	public void createFile(String name) {
		throw new UnsupportedOperationException() ;
	}

	@Override
	public void removeFile(String name) {
		throw new UnsupportedOperationException() ;
	}

	@Override
	public IFile getFile(String name) {
		return null;
	}

}
