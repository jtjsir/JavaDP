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

	//第一个模板方法
	abstract String buildHeader() ;
	
	//第二个模板方法
	abstract String builderBody() ;
	
	//第三个模板方法，可供子类覆盖
	protected String buildScript(){
		return "<script></script>" ;
	}
}
