package com.day6.streamAPI;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductOperation {
	private Scanner sc;
	private List<Product> prdlist;
	public ProductOperation()
	{
		sc=new Scanner(System.in);
		prdlist=new ArrayList<Product>();
				
	}
	public void insert()
	{
		System.out.println("Enter no of products u want to enter ");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter Product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter price ");
			p.setPrice(sc.nextDouble());
			prdlist.add(p);
		}
	}
	public void diplayProduct() {
	List<Product> prd=	prdlist.stream().filter(pobj->pobj.getPrice()>30000).collect(Collectors.toList());
	prd.stream().forEach(o->{
		System.out.println("product name"+ o.getProductname());
		System.out.println("product price"+ o.getPrice());
	});
	
	}
	public void displayProductName() {
		System.out.println("enter the product name you wanr to search");
		String str=sc.next();
		List<Product> prd=prdlist.stream().filter(obj-> obj.getProductname().equals(str)).collect(Collectors.toList());
		prd.stream().forEach(o->{
			System.out.println("product name"+ o.getProductname());
			System.out.println("product price"+ o.getPrice());
		});
	}
	public void priceIncr() {
		prdlist.stream().map(obj-> obj.getPrice()+1000).forEach(p->{System.out.println(p);});
		
		
	}
	public void sortListacc() {
		prdlist.stream().sorted((a,b)-> a.getPrice().compareTo(b.getPrice())).forEach(p->
		{
			System.out.println("name"+ p.getProductname());
			System.out.println("price"+p.getPrice());
		}
				
				);
	
		}
	public void totalPrice() {
		double total=prdlist.stream().collect(Collectors.summingDouble(p-> p.getPrice()));
		System.out.println("total"+total);
	}
	public void summuary() {
	DoubleSummaryStatistics	dss=prdlist.stream().mapToDouble(x->x.getPrice()).summaryStatistics();
		System.out.println("max value"+ dss.getMax());
		System.out.println("min value"+ dss.getMin());
		System.out.println("sum " + dss.getSum());
		System.out.println("average"+ dss.getAverage());
	}
	public static void main(String[] args) {
		ProductOperation po= new ProductOperation();
		po.insert();
		//po.diplayProduct();
		//po.displayProductName();
		//po.priceIncr();
		//po.sortListacc();
		//po.totalPrice();
		po.summuary();
	}
}