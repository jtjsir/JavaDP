package com.jing.dp.demo.template.sample;

public class DefaultPageBuilder extends AbsPageBuilder {

	@Override
	String buildHeader() {
		
		return "<head><title>Hello World</title></head>";
	}

	@Override
	String builderBody() {
		
		return "<body>Hello World</body>";
	}

}
