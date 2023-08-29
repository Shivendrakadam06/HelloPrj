package com.day4.collection;

public class ProductMain {

	public static void main(String[] args) {
		ProductData pd = new ProductData();
		pd.insertData();
		pd.display();
		//pd.deletProduct();
		pd.updateQuantity();
		pd.display();
	}

}
