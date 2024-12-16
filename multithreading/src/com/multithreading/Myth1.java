package com.multithreading;

public class Myth1 extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("child thread : "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) {
		Myth1 t = new Myth1();
		Thread.currentThread().setPriority(MAX_PRIORITY);
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("parent thread : "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}
