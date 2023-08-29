package com.day4;

public class SevenMulti extends Thread {
	public void run() {
		for(int i=1; i <= 10; i++)  
		{     
		System.out.println(7+" * "+i+" = "+7*i); 
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}  
		
		
	}
	public static void main(String[] args) {
		SevenMulti sm = new SevenMulti();
		sm.start();
		
	}

}
