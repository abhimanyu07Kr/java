package com.manu;

public class Demo1 {

	public static void main(String[] args) {
		Runnable r=()->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("child class "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main Thread "+i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
