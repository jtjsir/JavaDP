package com.jing.dp.demo.creator;
/**
@author jingsir

**
*/
public interface IBuilder {

	void createProduct(String name) ;
	
	void buildColor() ;
	
	void buildSize() ;
	
	Product getProduct() ;
}
