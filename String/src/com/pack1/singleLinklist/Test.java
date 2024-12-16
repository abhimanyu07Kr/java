package com.pack1.singleLinklist;

public class Test {

	public static void main(String[] args) {
		SingleLinkList ll = new SingleLinkList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(4, 5);
		
		System.out.println("size :"+ll.size());
		
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
		System.out.println("====================================");
		ll.display();
		
	}
}
