package com.DoubleLinkList;

public class Test {
	
	public static void main(String[] args) {
		DoubleLinkList dl = new DoubleLinkList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(50);
		dl.add("Abhi");
		
		
		System.out.println("=====================");
		System.out.println(dl.size());
		System.out.println("======================");
		dl.display();
		System.out.println("========================");
		System.out.println(dl.get(4));
	}

}
