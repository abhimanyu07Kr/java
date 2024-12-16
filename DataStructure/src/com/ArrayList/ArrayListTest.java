package com.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(20);
		al.add(10);
		al.add(20);
		
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
//		al.add(6,100);
		System.out.println(al.size());
		System.out.println(al.capacity());
		System.out.println("========================");
		System.out.println(al.get(0));
		System.out.println("====================");
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		al.remove(1);
		System.out.println("=============================");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
