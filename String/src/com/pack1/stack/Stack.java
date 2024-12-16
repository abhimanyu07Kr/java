package com.pack1.stack;

public class Stack {
	
	Node head;
	int count;
	
	public void add(Object ele)
	{
		if(head==null)
		{
			head=new Node(ele);
			count++;
			return;
		}
		Node n=new Node(ele);
		n.next=head;
		head=n;
		count++;
				
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public int size()
	{
		return count;
	}
	public Object pop()
	{
		if(isEmpty()) return null;
		
		Object ele=head.ele;
		head.next=head;
		count--;
		return ele;
	}
	
	public Object peek()
	{
		if(isEmpty()) return null;
		
		return head.ele;
	}

	public void display()
	{
		
	}
}
