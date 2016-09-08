package com.jing.dp.demo.combine.sample;import java.util.jar.Attributes.Name;

/**
@author jingsir

**
*/
public class File extends AbstractFile {
	private String fileName ;
	private IFile folder ;
	
	public File(String name,IFile folder){
		this.fileName = name ;
		this.folder = folder ;
	}

	@Override
	public String getName() {
		return this.fileName ;
	}

	@Override
	public void delete() {
		//ͨ���ļ�����ɾ��
		folder.delete();
		System.out.println("---ɾ��" + fileName + "--sucess");
	}

}
