package com.jing.dp.demo.combine.sample;

/**
 * @author jingsir
 **
 *�����ͳһ�ӿ� 
 */
public interface IFile {

	//����������Ӧ��ͼ�е�operation()
	String getName() ;
	
	void delete() ;
	
	/*����Ϊ�ļ������й���*/
	
	void createFile(String name) ;
	
	void removeFile(String name) ;
	
	IFile getFile(String name) ;
}
