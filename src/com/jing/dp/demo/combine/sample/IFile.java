package com.jing.dp.demo.combine.sample;

/**
 * @author jingsir
 **
 *对外的统一接口 
 */
public interface IFile {

	//公共方法对应类图中的operation()
	String getName() ;
	
	void delete() ;
	
	/*以下为文件夹特有功能*/
	
	void createFile(String name) ;
	
	void removeFile(String name) ;
	
	IFile getFile(String name) ;
}
