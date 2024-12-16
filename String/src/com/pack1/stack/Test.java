package com.pack1.stack;

public class Test {
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(10);
		s.add(20);
		
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
