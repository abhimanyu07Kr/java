package com.pack1.arrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(7, 5);
		System.out.println(al.size());
		System.out.println(al.capacity());
//		System.out.println(al.get(7));
		
		
		
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
	}

}
