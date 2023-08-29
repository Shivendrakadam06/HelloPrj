package cloneimp;

public class ProductClone {
	public static void main(String[] args) {
		Product obj1=new Product(1001,"Laptop",90000);
		Product obj2=null;
		try
		{
		obj2=(Product)obj1.clone();
		
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println("Clone not working");
		}
		obj2.setProductname("IPAD");
		System.out.println("Product name in obj1 is "+obj1.getProductname());
		
		System.out.println("Product name in obj2 is "+obj2.getProductname());
	}

}