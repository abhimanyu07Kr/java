package com.pack1.queue;

public class Test {
	public static void main(String[] args) {
		Queue q= new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
