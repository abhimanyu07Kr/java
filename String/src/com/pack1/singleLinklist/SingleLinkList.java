package com.pack1.singleLinklist;

public class SingleLinkList {
	
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
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node(ele);
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public Object get(int index)
	{
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.ele;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.ele);
			temp = temp.next;
		}
	}
	
	public void add(int index, Object ele)
	{
		if(index<0 || index>size())
			throw new IndexOutOfBoundsException();
		Node n=new Node(ele);
		if(index==0)
		{
			
			n.next=head;
			head=n;
			count++;
			return;
		}
		
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
			
		}
		n.next=temp.next;
		temp.next=n;
		count++;
		
		
	}

}
