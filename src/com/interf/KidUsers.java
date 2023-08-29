package com.interf;

public class KidUsers implements LibraryUser{
	private int age;
	private String bookType;
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		if (age>12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}else {
			System.out.println("register succesfully");
		}
		
	}
	@Override
	public void requestBook() {
		if(bookType=="kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
