package com.jing.dp.demo.combine.sample;

/**
 * @author jingsir
 **
 * �ṩĬ��ʵ��
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
