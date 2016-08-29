package com.jing.dp.demo.creator;
/**
@author jingsir

**
*/
public class ProductBuilder implements IBuilder {

	private Product product ;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public void createProduct(String name) {
		this.product = new Product() ;
		this.product.setName(name);
	}

	@Override
	public void buildColor() {
		this.product.setColor("��ɫ");
	}

	@Override
	public void buildSize() {
		this.product.setSize("СС��");
	}

}
