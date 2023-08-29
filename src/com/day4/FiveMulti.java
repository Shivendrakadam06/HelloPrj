package com.day4;

public class FiveMulti extends Thread{
	
	public void run() {
		for(int i=1; i <= 10; i++)  
		{     
		System.out.println(5+" * "+i+" = "+5*i); 
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}  
		
		
	}
	public static void main(String[] args) {
		FiveMulti fm= new FiveMulti();
		fm.start();
		
	}

}
