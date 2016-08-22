package com.jing.dp.demo.template.sample;

public abstract class AbsPageBuilder implements PageBuilder {

	@Override
	public String buildHtml() {
		StringBuilder htmlBuilder = new StringBuilder() ;
		htmlBuilder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \""
				+ "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">") ;
		htmlBuilder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">") ;
		
		htmlBuilder.append(buildHeader()) ;
		htmlBuilder.append(builderBody()) ;
		htmlBuilder.append(buildScript()) ;
		
		htmlBuilder.append("</html>") ;
		
		return htmlBuilder.toString();
	}

	//��һ��ģ�巽��
	abstract String buildHeader() ;
	
	//�ڶ���ģ�巽��
	abstract String builderBody() ;
	
	//������ģ�巽�����ɹ����า��
	protected String buildScript(){
		return "<script></script>" ;
	}
}
