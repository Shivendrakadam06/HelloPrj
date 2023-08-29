package com.day4;

public class SecondThread implements Runnable{

	@Override
	public void run() {
		for(int x=10;x>=0;x--)
		{
			System.out.println("Value of x is "+x);
			System.out.println("Thread executing "+Thread.currentThread().getName());
			if(Thread.currentThread().getName().equals("FirstThread"))
			{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else
			{
				if(Thread.currentThread().getName().equals("SecondThread"))
				{
					{
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}
		}
}
	public static void main(String[] args) {
		SecondThread second=new SecondThread();
		Thread th1=new Thread(second);
		th1.setName("FirstThread");
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread th2=new Thread(second);
		th2.setName("SecondThread");
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}