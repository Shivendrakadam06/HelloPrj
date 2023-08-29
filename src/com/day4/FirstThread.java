package com.day4;

public class FirstThread extends Thread{
	
	public void run() {
		for (int x=1;x<=10;x++) {
			System.out.println("value of x" + x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		ft.start();
		FirstThread ft2= new FirstThread();
		ft2.start();

	}

}
