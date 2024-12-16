package com.pack1.doubleLinkList;

public class DoubleLikList {
	
	Node head;
	int count;
	
	public void add(Object ele)
	{
		if(head==null)
		{
			head=new Node(ele, null, null);
			count++;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node(ele, null, temp);
		count++;
	}
	public int size()
	{
		return count;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.ele);
			temp=temp.next;
		}
	}
	
	public Object get(int index)
	{
		if(index<=-1 || index>=count)
			throw new IndexOutOfBoundsException();
		
		Node temp=head;
		
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.ele;
	}
	
	public void add(int index, Object ele)
	{
		if(index<=-1 && index>=count)
			throw new IndexOutOfBoundsException();
		
		if(index==0)
		{
			Node temp=new Node(ele, head, null);
			head.prev=temp;
			head=temp;
			count++;
			return;
		}
		
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		
		Node n=new Node(ele, temp.next, temp);
//		temp.next.prev=n;
		temp.next=n;
		count++;
				
		
	}

}
