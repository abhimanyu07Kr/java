package com.DoubleLinkList;

public class DoubleLinkList {
	
	Node head;
	int count=0;
	
	public void add(Object ele)
	{
		if(head==null)
		{
			head=new Node(ele, null, null);
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null) curr=curr.next;
		
		curr.next=new Node(ele, null, curr);
		count++;
		return;
			
	}
	
	public int size()
	{
		return count;
	}
	
	

	public Object get(int index)
	{
		if(index < 0 || index >=size())
			return new IndexOutOfBoundsException();
		Node curr=head;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	
	
	public void display()
	{
		
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	
	

}
