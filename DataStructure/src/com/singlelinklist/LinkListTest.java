package com.singlelinklist;

public class LinkListTest {
	
	public static void main(String[] args) {
		LinkList l= new LinkList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
//		System.out.println(l.size());
//		System.out.println(l.get(3));
		
		l.add(5, 5);
		
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
	}

}
