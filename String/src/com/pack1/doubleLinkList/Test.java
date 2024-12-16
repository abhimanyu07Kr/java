package com.pack1.doubleLinkList;

public class Test {
	public static void main(String[] args) {
		DoubleLikList l = new DoubleLikList();
		l.add(10);
		l.add(20);
		l.add(1, 5);
		l.add(30);
		l.add(40);
		System.out.println(l.size());
		System.out.println("==============");
		l.display();
		System.out.println("==================");
		System.out.println(l.get(3));
		
	}

}
